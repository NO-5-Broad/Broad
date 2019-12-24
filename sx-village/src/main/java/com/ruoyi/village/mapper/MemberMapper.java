package com.ruoyi.village.mapper;

import com.ruoyi.common.utils.PageData;
import com.ruoyi.village.domain.Mcount;
import com.ruoyi.village.domain.Member;
import java.util.List;	

/**
 * 村民基本 数据层
 * 
 * @author 张超
 * @date 2019-01-15
 */
public interface MemberMapper 
{
	/**
     * 查询村民基本信息
     * 
     * @param pid 村民基本ID
     * @return 村民基本信息
     */
	public Member selectMemberById(Integer pid);
	
	/**
     * 查询村民基本列表
     * 
     * @param member 村民基本信息
     * @return 村民基本集合
     */
	public List<Member> selectMemberList(Member member);
	
	/**
     * 新增村民基本
     * 
     * @param member 村民基本信息
     * @return 结果
     */
	public int insertMember(Member member);
	
	/**
     * 修改村民基本
     * 
     * @param member 村民基本信息
     * @return 结果
     */
	public int updateMember(Member member);
	
	/**
     * 删除村民基本
     * 
     * @param pid 村民基本ID
     * @return 结果
     */
	public int deleteMemberById(Integer pid);
	
	/**
     * 批量删除村民基本
     * 
     * @param pids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMemberByIds(String[] pids);

	/**
	 * 按组统计村民数据
	 *
	 * @return 结果
	 */
	public List<Mcount> countbygroup();

	/**
	    * 统计村民和党员总数/男/女
	    * @author 张超 teavamc
	    * @date 2019/1/30
	    * @param []
	    * @return java.util.List<com.ruoyi.common.utils.PageData>
	    */
	public List<PageData> countpm();

	/**
	    * 按照地区类型返回村民和党员的总数/男性/女性
	    * @author 张超 teavamc
	    * @date 2019/2/1
	    * @param []
	    * @return java.util.List<com.ruoyi.common.utils.PageData>
	    */
	public List<PageData> groupAreaCountPM();
}