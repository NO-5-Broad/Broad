package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.village.mapper.ForestlandInfoMapper;
import com.ruoyi.village.domain.ForestlandInfo;
import com.ruoyi.village.service.IForestlandInfoService;
import com.ruoyi.common.support.Convert;

/**
 * 林地 服务层实现
 * 
 * @author 张鸿权
 * @date 2019-05-02
 */
@Service
public class ForestlandInfoServiceImpl implements IForestlandInfoService 
{
	@Autowired
	private ForestlandInfoMapper forestlandInfoMapper;

	/**
     * 查询林地信息
     * 
     * @param fid 林地ID
     * @return 林地信息
     */
    @Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public ForestlandInfo selectForestlandInfoById(Integer fid)
	{
	    return forestlandInfoMapper.selectForestlandInfoById(fid);
	}
	
	/**
     * 查询林地列表
     * 
     * @param forestlandInfo 林地信息
     * @return 林地集合
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public List<ForestlandInfo> selectForestlandInfoList(ForestlandInfo forestlandInfo)
	{
	    return forestlandInfoMapper.selectForestlandInfoList(forestlandInfo);
	}
	
    /**
     * 新增林地
     * 
     * @param forestlandInfo 林地信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int insertForestlandInfo(ForestlandInfo forestlandInfo)
	{
	    return forestlandInfoMapper.insertForestlandInfo(forestlandInfo);
	}
	
	/**
     * 修改林地
     * 
     * @param forestlandInfo 林地信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int updateForestlandInfo(ForestlandInfo forestlandInfo)
	{
	    return forestlandInfoMapper.updateForestlandInfo(forestlandInfo);
	}

	/**
     * 删除林地对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int deleteForestlandInfoByIds(String ids)
	{
		return forestlandInfoMapper.deleteForestlandInfoByIds(Convert.toStrArray(ids));
	}
	
}
