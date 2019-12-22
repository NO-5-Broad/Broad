package com.ruoyi.web.controller.broad;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ruoyi.broad.domain.ProApplyUser;
import com.ruoyi.broad.domain.Program;
import com.ruoyi.broad.service.IProgramService;
import com.ruoyi.broad.utils.bConst;
import com.ruoyi.broad.utils.bFileUtil;
import com.ruoyi.common.utils.DateUtil;
import com.ruoyi.common.utils.VideoUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.broad.domain.ProreApply;
import com.ruoyi.broad.service.IProreApplyService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.ExcelUtil;
import org.springframework.web.multipart.MultipartFile;

/**
 * 节目申请 信息操作处理
 *
 * @author 张超
 * @date 2019-03-02
 */
@Controller
@RequestMapping("/broad/proreApply")
public class ProreApplyController extends BaseController
{
	private String prefix = "broad/proreApply";

	@Autowired
	private IProreApplyService proreApplyService;
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private IProgramService iProgramService;
	private Object VideoUtil;

	//	@RequiresPermissions("broad:proreApply:view")
	@GetMapping()
	public String proreApply()
	{
		return prefix + "/proreApply";
	}

	/**
	 * 查询节目申请列表
	 */
	@RequiresPermissions("broad:proreApply:list")
	@PostMapping("/list")

	@ResponseBody
	public TableDataInfo list(ProApplyUser proapplyuser)
	{
		SysUser currentUser = ShiroUtils.getSysUser();//从session中获取当前登陆用户的userid
		Long userid =  currentUser.getUserId();
		int returnId = new Long(userid).intValue();
		int roleid = sysUserService.selectRoleid(returnId);//通过所获取的userid去广播用户表中查询用户所属区域的Roleid
		if(roleid == 1){
			startPage();
			List<ProApplyUser> list = proreApplyService.selectProrApplyUserList(proapplyuser);
			return getDataTable(list);
		}else{
			proapplyuser.setUserid(userid);
			startPage();
			List<ProApplyUser> list = proreApplyService.selectProrApplyUserList(proapplyuser);
			return getDataTable(list);
		}

	}

//	/**
//	 * 查询节目申请列表
//	 */
//	@RequiresPermissions("broad:proreApply:list")
//	@PostMapping("/list")
//	@ResponseBody
//	public TableDataInfo list(ProreApply proreApply)
//	{
//		startPage();
//		List<ProreApply> list = proreApplyService.selectProreApplyList(proreApply);
//		return getDataTable(list);
//	}


	/**
	 * 导出节目申请列表
	 */
	@RequiresPermissions("broad:proreApply:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(ProreApply proreApply)
	{
		List<ProreApply> list = proreApplyService.selectProreApplyList(proreApply);
		ExcelUtil<ProreApply> util = new ExcelUtil<ProreApply>(ProreApply.class);
		return util.exportExcel(list, "proreApply");
	}

	/**
	 * 新增节目申请
	 */
	@GetMapping("/add")
	public String add()
	{
		return prefix + "/add";
	}

	/**
	 * 新增保存节目申请
	 */
//	@RequiresPermissions("broad:proreApply:add")
	@Log(title = "新增节目申请", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(@RequestParam(value = "files") MultipartFile file,
							  @RequestParam(value="requires") String requires,
							  @RequestParam(value="timelimit") String timelimit,
							  @RequestParam(value="isemergency") String isemergency,
							  @RequestParam(value="pname") String panme)throws IOException
	{
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sim.format(new Date());

		String userId = ShiroUtils.getSysUser().getUserId().toString();//获取用户信息
		int fileurl = bFileUtil.uplodeDocFile(file);//存文件

		//存放节目名称、录制要求、是否紧急、时间要求、doc文件、filename要求文稿名称、fileurl文件路径、申请时间
		ProreApply  proreApply = new ProreApply();
		proreApply.setPname(panme);
		proreApply.setUserid(userId);
		proreApply.setRequires(requires);
		proreApply.setIsemergency(isemergency=="true"?true:false);
		proreApply.setTimelimit(timelimit);
		proreApply.setFileurl(fileurl);
		proreApply.setSubmittime(time);
		return toAjax(proreApplyService.insertProreApply(proreApply));
	}

	/**
	 * 修改节目申请
	 */
	@GetMapping("/edit/{paid}")
	public String edit(@PathVariable("paid") Integer paid, ModelMap mmap)
	{
		ProreApply proreApply = proreApplyService.selectProreApplyById(paid);
		mmap.put("proreApply", proreApply);
		return prefix + "/edit";
	}

	/**
	 * 修改节目申请
	 */
	@GetMapping("/reply")
	public String reply(){
		return prefix + "/reply";
	}

	/**
	 * 修改保存节目申请
	 */
	@RequiresPermissions("broad:proreApply:edit")
	@Log(title = "修改节目申请", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ProreApply proreApply)
	{
		return toAjax(proreApplyService.updateProreApply(proreApply));
	}

	/**
	 * 删除节目申请
	 */
	@RequiresPermissions("broad:proreApply:remove")
	@Log(title = "删除节目申请", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		return toAjax(proreApplyService.deleteProreApplyByIds(ids));
	}

	@Log(title = "节目撤回", businessType = BusinessType.UPDATE)
	@GetMapping("/recall/{fid}")
	@ResponseBody
	public int recall(@PathVariable("fid") String fid) {
		return proreApplyService.recall(fid);
	}

	/**
	 * 修改节目申请
	 */
	@Log(title = "修改节目申请", businessType = BusinessType.UPDATE)
	@PostMapping("/reply")
	@ResponseBody
	public AjaxResult replyfile(String paid,String replyperson,MultipartFile file,String userid){
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sim.format(new Date());

		ProreApply  proreApply = new ProreApply();
		String duration = VideoUtil.ReadVideoTimeMs(file);
		String year = DateUtil.getYear();

		String maxfileid = iProgramService.getMaxFileidofYear(year);
		Program g = bFileUtil.uplodeFile(maxfileid, file, file.getOriginalFilename(),duration, String.valueOf(file.getSize()), year, userid);
		g.setPtype(true);
		g.setCreatedtime(time);
		g.setIspublic(false);
		iProgramService.insertProgram(g);


		System.out.println(Integer.valueOf(paid));
		proreApply.setPaid(Integer.parseInt(paid));
		proreApply.setReplyperson(replyperson);
		proreApply.setReplytime(time);
		proreApply.setFileurl(g.getUrls());
		proreApply.setIsreply(true);
		return toAjax(proreApplyService.updateProreApply(proreApply));
	}

}
