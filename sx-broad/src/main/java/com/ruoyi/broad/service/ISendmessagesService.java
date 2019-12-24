package com.ruoyi.broad.service;


import com.ruoyi.broad.domain.Sendmessages;
import java.util.List;

/**
 * 短信发送记录 服务层
 * 
 * @author 张超
 * @date 2019-01-11
 */
public interface ISendmessagesService 
{
	/**
     * 查询短信发送记录信息
     * 
     * @param smid 短信发送记录ID
     * @return 短信发送记录信息
     */
	public Sendmessages selectSendmessagesById(Integer smid);
	
	/**
     * 查询短信发送记录列表
     * 
     * @param sendmessages 短信发送记录信息
     * @return 短信发送记录集合
     */
	public List<Sendmessages> selectSendmessagesList(Sendmessages sendmessages);
	
	/**
     * 新增短信发送记录
     * 
     * @param sendmessages 短信发送记录信息
     * @return 结果
     */
	public int insertSendmessages(Sendmessages sendmessages);
	
	/**
     * 修改短信发送记录
     * 
     * @param sendmessages 短信发送记录信息
     * @return 结果
     */
	public int updateSendmessages(Sendmessages sendmessages);
		
	/**
     * 删除短信发送记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSendmessagesByIds(String ids);
	
}
