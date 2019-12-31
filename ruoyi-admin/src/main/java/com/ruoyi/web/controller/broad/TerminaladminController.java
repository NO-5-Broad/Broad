package com.ruoyi.web.controller.broad;


import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ExcelUtil;
import org.springframework.ui.ModelMap;
import com.ruoyi.broad.domain.Terminaladmin;
import com.ruoyi.broad.service.ITerminaladminService;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** 终端管理员 */

@Controller
@RequestMapping("/broad/terminaladmin")
public class TerminaladminController extends BaseController {
    private String prefix = "broad/terminaladmin";
    private   ITerminaladminService terminaladminService;

    public TerminaladminController(ITerminaladminService terminaladminService) {
        this.terminaladminService = terminaladminService;
    }

    @RequiresPermissions("broad:terminaladmin:view")
    @GetMapping()
    public String terminaladmin() {
        return prefix + "/terminaladmin";
    }


    /**
     * 导出终端用户列表
     */
    @RequiresPermissions("broad:terminaladmin:export")
    @PostMapping("/export")

    public AjaxResult export(Terminaladmin terminaladmin){
        List<Terminaladmin> List =terminaladminService.selectTerminaladminList(terminaladmin);
        ExcelUtil<Terminaladmin> util =new ExcelUtil<>(Terminaladmin.class);
        return util.exportExcel(List,"terminaladmin");
    }

    /**
     * 查询终端管理员列表
     */
    @RequiresPermissions("broad:terminaladmin:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Terminaladmin terminaladmin) {
        startPage();
        List<Terminaladmin> List =terminaladminService.selectTerminaladminList(terminaladmin);
        return getDataTable(List);
    }


    /**
     * 修改广终端用户
     */
    @GetMapping("/edit/{aid}")
    public String edit(@PathVariable("aid") String aid, ModelMap mmap) {
        Terminaladmin terminaladmin=terminaladminService.selectTerminaladminById(aid);
        mmap.put("terminaladmin",terminaladmin);
        return prefix +"/edit";
    }

    /**
     * 修改保存广播用户
     */
    @RequiresPermissions("broad:terminaladmin:edit")
    @Log(title = "终端用户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Terminaladmin terminaladmin){
        return toAjax(terminaladminService.updateTerminaladmin(terminaladmin));
    }

    /**
     * 删除广播用户
     */
    @RequiresPermissions("broad:terminaladmin:remove")
    @Log(title = "终端用户", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String aid){
        return toAjax(terminaladminService.deleteTerminaladminById(aid));
    }
    /**
     * 新增终端用户
     */
    @RequiresPermissions("broad:terminaladmin:add")
    @Log(title = "终端用户", businessType = BusinessType.INSERT)
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult add(Terminaladmin terminaladmin) {
        return toAjax(terminaladminService.insertTerminaladmin(terminaladmin));
    }
}
