package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 我的建议表 suggest
 * 
 * @author 张鸿权
 * @date 2019-08-15
 */
public class Suggest extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 数据编号 */
	private Integer mid;
	/** 标题 */
	private String mtitle;
	/** 图片地址 */
	private String mpic;
	/** 内容 */
	private String mcontent;
	/** 发布人编号 */
	private Integer uid;
	/** 发布人姓名 */
	private String uname;
	/** 建立日期 */
	private String pushdate;
	/** 阅读点击数 */
	private Integer greadtotal;
	/** 状态 */
	private Integer mtype;
	/** 用户所属地区编号 */
	private String aid;
	/** 备注 */
	private String note;

	public void setMid(Integer mid) 
	{
		this.mid = mid;
	}

	public Integer getMid() 
	{
		return mid;
	}
	public void setMtitle(String mtitle) 
	{
		this.mtitle = mtitle;
	}

	public String getMtitle() 
	{
		return mtitle;
	}
	public void setMpic(String mpic) 
	{
		this.mpic = mpic;
	}

	public String getMpic() 
	{
		return mpic;
	}
	public void setMcontent(String mcontent) 
	{
		this.mcontent = mcontent;
	}

	public String getMcontent() 
	{
		return mcontent;
	}
	public void setUid(Integer uid) 
	{
		this.uid = uid;
	}

	public Integer getUid() 
	{
		return uid;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public String getUname() 
	{
		return uname;
	}
	public void setPushdate(String pushdate)
	{
		this.pushdate = pushdate;
	}

	public String getPushdate()
	{
		return pushdate;
	}
	public void setGreadtotal(Integer greadtotal) 
	{
		this.greadtotal = greadtotal;
	}

	public Integer getGreadtotal() 
	{
		return greadtotal;
	}
	public void setMtype(Integer mtype) 
	{
		this.mtype = mtype;
	}

	public Integer getMtype() 
	{
		return mtype;
	}
	public void setAid(String aid) 
	{
		this.aid = aid;
	}

	public String getAid() 
	{
		return aid;
	}
	public void setNote(String note) 
	{
		this.note = note;
	}

	public String getNote() 
	{
		return note;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mid", getMid())
            .append("mtitle", getMtitle())
            .append("mpic", getMpic())
            .append("mcontent", getMcontent())
            .append("uid", getUid())
            .append("uname", getUname())
            .append("pushdate", getPushdate())
            .append("greadtotal", getGreadtotal())
            .append("mtype", getMtype())
            .append("aid", getAid())
            .append("note", getNote())
            .toString();
    }
}
