package com.ruoyi.village.service;

import com.ruoyi.village.domain.Project;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;

/**
 * 重大项目 服务层
 * 
 * @author 张鸿权
 * @date 2019-01-19
 */
public interface IProjectService 
{
	/**
     * 查询重大项目信息
     * 
     * @param proid 重大项目ID
     * @return 重大项目信息
     */
	public Project selectProjectById(Integer proid);
	
	/**
     * 查询重大项目列表
     * 
     * @param project 重大项目信息
     * @return 重大项目集合
     */
	public List<Project> selectProjectList(Project project);
	
	/**
     * 新增重大项目
     * 
     * @param project 重大项目信息
     * @return 结果
     */
	public int insertProject(Project project);
	
	/**
     * 修改重大项目
     * 
     * @param project 重大项目信息
     * @return 结果
     */
	public int updateProject(Project project);
		
	/**
     * 删除重大项目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectByIds(String ids);

	public List<Project> selectProjectListForapp(pubObjApi project);
}
