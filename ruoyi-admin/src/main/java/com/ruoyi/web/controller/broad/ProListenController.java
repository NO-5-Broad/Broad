package com.ruoyi.web.controller.broad;

import com.ruoyi.broad.domain.ProApplyUser;
import com.ruoyi.broad.domain.ProList;
import com.ruoyi.broad.domain.ProListen;
import com.ruoyi.broad.service.IProListenService;
import com.ruoyi.broad.service.impl.ProListServiceImpl;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.broad.domain.ProreApply;
import com.ruoyi.broad.service.IProreApplyService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.ExcelUtil;

import java.util.List;

/**
 * @author cx
 * @Description: 节目审听
 * @ClassName ProListenController
 *
 **/
@Controller
@RequestMapping(value="/broad/prolisten")
public class ProListenController extends BaseController{
    private String prefix = "broad/prolisten";

    @Autowired
    private IProListenService iProListenService;
    @Autowired
    private ISysUserService sysUserService;

    @GetMapping()
    @RequiresPermissions("broad:prolisten:view")
    public String proreApply()
    {
        return prefix + "/prolisten";
    }


    @RequiresPermissions("broad:prolisten:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProListen proListen){
        startPage();
        List<ProListen> list = iProListenService.selectProListenList(proListen);
        return getDataTable(list);
    }

    @GetMapping("/play")
    @RequiresPermissions("broad:prolisten:view")
    public String proreApplyplay() {
        return prefix + "/play";
    }


    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }//新增添加功能


    @RequiresPermissions("broad:proreApply:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProListen proListen) {
        List<ProListen> list = iProListenService.selectProListenList(proListen);
        ExcelUtil<ProListen> util = new ExcelUtil<ProListen>(ProListen.class);
        return util.exportExcel(list, "prolisten");
    }//新增导出功能



    @GetMapping("/pass/{paid}")
    @RequiresPermissions("broad:prolisten:view")
    @ResponseBody
    public AjaxResult checkpass(@PathVariable("paid") String paid) {
        return toAjax(iProListenService.checkpass(paid));
    }

    @GetMapping("/nopassreason")
    @RequiresPermissions("broad:prolisten:view")
    public String nopassreason() {
        return prefix + "/nopassreason";
    }

    @PostMapping("/nopassreason")
    @RequiresPermissions("broad:prolisten:view")
    @ResponseBody
    public AjaxResult nopassreason(ProListen proListen) {
        return toAjax(iProListenService.updateProListen(proListen));
    }
}
