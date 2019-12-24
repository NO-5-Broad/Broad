package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.PageData;
import com.ruoyi.village.domain.Mcount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.village.mapper.MemberMapper;
import com.ruoyi.village.domain.Member;
import com.ruoyi.village.service.IMemberService;
import com.ruoyi.common.support.Convert;

import javax.annotation.Resource;

/**
 * 村民基本 服务层实现
 * 
 * @author 张超
 * @date 2019-01-15
 */
@Service
public class MemberServiceImpl implements IMemberService 
{
	@Autowired
	private MemberMapper memberMapper;

	/**
     * 查询村民基本信息
     * 
     * @param pid 村民基本ID
     * @return 村民基本信息
     */
    @Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public Member selectMemberById(Integer pid)
	{
	    return memberMapper.selectMemberById(pid);
	}
	
	/**
     * 查询村民基本列表
     * 
     * @param member 村民基本信息
     * @return 村民基本集合
     */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public List<Member> selectMemberList(Member member)
	{
	    return memberMapper.selectMemberList(member);
	}
	
    /**
     * 新增村民基本
     * 
     * @param member 村民基本信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public int insertMember(Member member)
	{
	    return memberMapper.insertMember(member);
	}
	
	/**
     * 修改村民基本
     * 
     * @param member 村民基本信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public int updateMember(Member member)
	{
	    return memberMapper.updateMember(member);
	}

	/**
     * 删除村民基本对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public int deleteMemberByIds(String ids)
	{
		return memberMapper.deleteMemberByIds(Convert.toStrArray(ids));
	}

	/**
	 * 按组统计村民数据
	 *
	 * @return 结果
	 */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public List<Mcount> countbygroup(){
		return memberMapper.countbygroup();
	}

	/**
	 * 统计村民和党员总数/男/女
	 * @author 张超 teavamc
	 * @date 2019/1/30
	 * @return java.util.List<com.ruoyi.common.utils.PageData>
	 */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public List<PageData> countpm(){
		return memberMapper.countpm();
	}


	/**
	 * 按照地区类型返回村民和党员的总数/男性/女性
	 * @author 张超 teavamc
	 * @date 2019/2/1
	 * @return java.util.List<com.ruoyi.common.utils.PageData>
	 */
	@Override
	@DataSource(value = DataSourceType.SXVILLAGE)
	public List<PageData> groupAreaCountPM(){
		return memberMapper.groupAreaCountPM();
	}
}
