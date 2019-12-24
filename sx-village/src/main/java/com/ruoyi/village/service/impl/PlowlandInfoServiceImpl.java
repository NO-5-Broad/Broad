package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.village.mapper.PlowlandInfoMapper;
import com.ruoyi.village.domain.PlowlandInfo;
import com.ruoyi.village.service.IPlowlandInfoService;
import com.ruoyi.common.support.Convert;

/**
 * 耕地 服务层实现
 * 
 * @author 张鸿权
 * @date 2019-05-02
 */
@Service
public class PlowlandInfoServiceImpl implements IPlowlandInfoService 
{
	@Autowired
	private PlowlandInfoMapper plowlandInfoMapper;

	/**
     * 查询耕地信息
     * 
     * @param pid 耕地ID
     * @return 耕地信息
     */
    @Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public PlowlandInfo selectPlowlandInfoById(Integer pid)
	{
	    return plowlandInfoMapper.selectPlowlandInfoById(pid);
	}
	
	/**
     * 查询耕地列表
     * 
     * @param plowlandInfo 耕地信息
     * @return 耕地集合
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public List<PlowlandInfo> selectPlowlandInfoList(PlowlandInfo plowlandInfo)
	{
	    return plowlandInfoMapper.selectPlowlandInfoList(plowlandInfo);
	}
	
    /**
     * 新增耕地
     * 
     * @param plowlandInfo 耕地信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int insertPlowlandInfo(PlowlandInfo plowlandInfo)
	{
	    return plowlandInfoMapper.insertPlowlandInfo(plowlandInfo);
	}
	
	/**
     * 修改耕地
     * 
     * @param plowlandInfo 耕地信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int updatePlowlandInfo(PlowlandInfo plowlandInfo)
	{
	    return plowlandInfoMapper.updatePlowlandInfo(plowlandInfo);
	}

	/**
     * 删除耕地对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int deletePlowlandInfoByIds(String ids)
	{
		return plowlandInfoMapper.deletePlowlandInfoByIds(Convert.toStrArray(ids));
	}
	
}
