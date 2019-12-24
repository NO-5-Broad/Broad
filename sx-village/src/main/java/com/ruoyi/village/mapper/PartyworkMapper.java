package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Partywork;
import java.util.List;	

/**
 * 党员值班 数据层
 * 
 * @author 张鸿权
 * @date 2019-01-20
 */
public interface PartyworkMapper 
{
	/**
     * 查询党员值班信息
     * 
     * @param id 党员值班ID
     * @return 党员值班信息
     */
	public Partywork selectPartyworkById(Integer id);
	
	/**
     * 查询党员值班列表
     * 
     * @param partywork 党员值班信息
     * @return 党员值班集合
     */
	public List<Partywork> selectPartyworkList(Partywork partywork);
	
	/**
     * 新增党员值班
     * 
     * @param partywork 党员值班信息
     * @return 结果
     */
	public int insertPartywork(Partywork partywork);
	
	/**
     * 修改党员值班
     * 
     * @param partywork 党员值班信息
     * @return 结果
     */
	public int updatePartywork(Partywork partywork);
	
	/**
     * 删除党员值班
     * 
     * @param id 党员值班ID
     * @return 结果
     */
	public int deletePartyworkById(Integer id);
	
	/**
     * 批量删除党员值班
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePartyworkByIds(String[] ids);

	/**
	 * 按照值班时间推送最近五条信息
	 *
	 * @return 结果
	 */
	public List<Partywork> selectPartyworkListlimit5();
	
}