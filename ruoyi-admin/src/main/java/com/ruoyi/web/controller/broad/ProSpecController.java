package com.ruoyi.web.controller.broad;

import com.ruoyi.broad.domain.ProList;
import com.ruoyi.broad.domain.ProSpec;
import com.ruoyi.broad.service.IProSpecService;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.ModelMap;
import java.util.List;

/**
 * 特种节目管理
 *
 * @author 周博
 * @date 2019-03-27
 */

@Controller
@RequestMapping("/broad/spec")
public class ProSpecController extends BaseController {
    private String prefix = "broad/spec";

    @Autowired
    private IProSpecService proSpecService;
    @Autowired
    private ISysUserService sysUserService;

    @GetMapping()
    public String spec() {
        return prefix + "/spec";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProSpec proSpec) {
        SysUser currentUser = ShiroUtils.getSysUser();//从session中获取当前登陆用户的userid
        Long userid = currentUser.getUserId();
        int returnId = new Long(userid).intValue();
        int roleid = sysUserService.selectRoleid(returnId);//通过所获取的userid去广播用户表中查询用户所属区域的Roleid
        if (roleid == 1) {
            startPage();
            List<ProSpec> list = proSpecService.selectProSpecList(proSpec);
            return getDataTable(list);
        } else {
            proSpec.setUserid(userid.toString());
            startPage();
            List<ProSpec> list = proSpecService.selectProSpecList(proSpec);
            return getDataTable(list);
        }
    }
    @RequiresPermissions("broad:proSpec:export")
    @GetMapping("/export")
    @ResponseBody
    public AjaxResult export(ProSpec proSpec) {
        List<ProSpec> list = proSpecService.selectProSpecList(proSpec);
        ExcelUtil<ProSpec> util = new ExcelUtil<ProSpec>(ProSpec.class);
        return util.exportExcel(list, "proSpec");
    }
    @GetMapping("/speclist")

    public String doCham(ModelMap mmap){

        return prefix+"/speclist";

    }




    /**



     * 返回特种节目替换页面



     * @param



     * @return



     */



    @PostMapping("/changespec")



    @ResponseBody



    public int changespec(String oldfid,String createdtime,String filename,String flenth,String fname,String fsize,String uname,String urls,String userid){



        ProSpec proSpec = new ProSpec();



        proSpec.setFid(oldfid);



        proSpec.setCreatedtime(createdtime);



        proSpec.setFilename(filename);



        proSpec.setFlenth(flenth);



        proSpec.setFname(fname);



        proSpec.setFsize(fsize);



        proSpec.setUname(uname);



        proSpec.setUrls(urls);



        proSpec.setUserid(userid);



        int value = proSpecService.updateprospec(proSpec);



        return value;



    }
}
