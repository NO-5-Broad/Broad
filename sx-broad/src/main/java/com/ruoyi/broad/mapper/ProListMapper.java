package com.ruoyi.broad.mapper;

import com.github.pagehelper.Page;
import com.ruoyi.broad.domain.ProList;
import com.ruoyi.broad.domain.Progbroad;
import com.ruoyi.broad.domain.Program_List;
import com.ruoyi.broad.domain.TerReceives;

import java.util.HashMap;
import java.util.List;

/**
 * 节目单记录 数据层
 * 
 * @author 张超
 * @date 2019-03-02
 */
public interface ProListMapper 
{
	/**
     * 查询节目单记录信息
     * 
     * @param id 节目单记录ID
     * @return 节目单记录信息
     */
	public ProList selectProListById(String id);
	
	/**
     * 查询节目单记录列表
     * 
     * @param proList 节目单记录信息
     * @return 节目单记录集合
     */
	public List<ProList> selectProListList(ProList proList);
	
	/**
     * 新增节目单记录
     * 
     * @param proList 节目单记录信息
     * @return 结果
     */
	public int insertProList(ProList proList);
	
	/**
     * 修改节目单记录
     * 
     * @param proList 节目单记录信息
     * @return 结果
     */
	public int updateProList(ProList proList);
	
	/**
     * 删除节目单记录
     * 
     * @param pid 节目单记录ID
     * @return 结果
     */
	public int deleteProListById(Integer pid);
	
	/**
     * 批量删除节目单记录
     * 
     * @param pids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProListByIds(String[] pids);

//	旧业务

	/**
	 * 根据用户编号和查询获取节目播出单（分页）
	 * @return
	 * @throws Exception
	 */
	public List<Progbroad> getProgBroadByUserid(String userid) throws Exception;
	/**
	 * 根据编号列表查询节目单
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<Progbroad> getProgBroadByIds(String[] ids) throws Exception;
	/**
	 * 根据编号列表查询节目单明细表
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<Progbroad> getProgBroadDetails(Progbroad progbroad) throws Exception;
	/**
	 * 根据节目播出单编号获取节目明细
	 * @param probroadid
	 * @return
	 * @throws Exception
	 */
	public List<HashMap> selectProListByProid(String probroadid) throws Exception;
	/**
	 * 终端播出单下载情况
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<TerReceives> getTerReceive() throws Exception;
	public List<HashMap> getTerReceiveByIdlist(String[] ids) throws Exception;
	/**
	 * 根据节目单编号查询终端
	 * @param probroadid
	 * @return
	 * @throws Exception
	 */
	public List<HashMap> getBroadTerminals(String probroadid) throws Exception;
	/**
	 * 删除播出单
	 * @param probroadid
	 * @throws Exception
	 */
//	public void deleteProgbroad(String probroadid) throws Exception;
	/**
	 * 添加播出单
	 * @param pd
	 * @return 播出单编号
	 * @throws Exception
	 */
	public Integer addProBroad(Progbroad pb) throws Exception;
	/**
	 * 添加播出单明细
	 * @param prolist
	 * @throws Exception
	 */
	public void addProList(Program_List prolist) throws Exception;
	/**
	 * 添加终端播出单关联
	 * @param pdlist
	 */
	public void addProTerminal(List<HashMap> pdlist) throws Exception;


	/**
	    * 根据pid显示相应的播出单操作详情
	    * @author 张超 teavamc
	    * @date 2019/3/9
	    * @param [pid]
	    * @return java.util.List<com.ruoyi.broad.domain.Progbroad>
	    */
	public List<ProList> 	selectProListListByPid(String pid);

}