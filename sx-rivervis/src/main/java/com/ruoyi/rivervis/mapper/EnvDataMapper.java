package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.EnvData;
import com.ruoyi.rivervis.domain.Riverbytl;

import java.util.List;

/**
 * 环境监测 数据层
 * 
 * @author 张超
 * @date 2019-03-05
 */
public interface EnvDataMapper 
{
	/**
     * 查询环境监测信息
     * 
     * @param id 环境监测ID
     * @return 环境监测信息
     */
	public EnvData selectEnvDataById(Integer id);
	
	/**
     * 查询环境监测列表
     * 
     * @param envData 环境监测信息
     * @return 环境监测集合
     */
	public List<EnvData> selectEnvDataList(EnvData envData);

	/**
	 * 查询环境监测列表 前20条数据
	 *
	 * @param envData 环境监测信息
	 * @return 环境监测集合
	 */
	public List<EnvData> selectEnvDataListLimit();

	/**
	    * 统计山洪数据总数
	    * @author 张超 teavamc
	    * @date 2019/3/10
	    * @param []
	    * @return int
	    */
	public int countall();

	/**
     * 新增环境监测
     * 
     * @param envData 环境监测信息
     * @return 结果
     */
	public int insertEnvData(EnvData envData);
	
	/**
     * 修改环境监测
     * 
     * @param envData 环境监测信息
     * @return 结果
     */
	public int updateEnvData(EnvData envData);
	
	/**
     * 删除环境监测
     * 
     * @param id 环境监测ID
     * @return 结果
     */
	public int deleteEnvDataById(Integer id);
	
	/**
     * 批量删除环境监测
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteEnvDataByIds(String[] ids);

	/**
	 * 根据时间范围和查询条数统计环境数据
	 *
	 * @param envData 环境监测信息
	 * @return 环境监测集合
	 */
	public List<EnvData> selectEnvDataListbytl(Riverbytl riverbytl);
}