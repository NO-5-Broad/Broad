package com.ruoyi.broad.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 节目播出单表 pro_sinmanage
 *
 * @author 张超
 * @date 2019-03-02
 */
public class ProSinmanage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 节目播出单IDSin */
    private String sfid;
    @Excel(name="sfid")
    /** 节目播出单类别 */
    private String scategory;
    @Excel(name="scategory")
    /*提交时间*/
    private String submittime;
    @Excel(name="submittime")
    /*节目名称*/
    private String pname;
    @Excel(name="pname")
    /*创建时间*/
    private String createtime;
    @Excel(name="createtime")
    /** 播出日期 */
    private String broaddate;
    @Excel(name="broaddate")
    /** 操作（所属）用户 */
    private String userid;
    @Excel(name="userid")
    /*操作（所属）用户名*/
    private String username;
    @Excel(name="username")
    /** 操作（所属）用户 */
    private String uname;
    @Excel(name="uname")
    /** 备注 */
    private String remark;
    @Excel(name="remark")
    /** 紧急播出单播放次数 */
    private String broadtimes;


    public void setSfid(String sfid)
    {
        this.sfid = sfid;
    }

    public String getSfid()
    {
        return sfid;
    }
    public void setScategory(String scategory)
    {
        this.scategory = scategory;
    }

    public String getScategory()
    {
        return scategory;
    }
    public void setCreatetime(String createtime)
    {
        this.createtime = createtime;
    }

    public String getCreatetime()
    {
        return createtime;
    }
    public void setBroaddate(String broaddate)
    {
        this.broaddate = broaddate;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getBroaddate()
    {
        return broaddate;
    }
    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    public String getUserid()
    {
        return userid;
    }
    public void setUname(String uname)
    {
        this.uname = uname;
    }

    public String getUname()
    {
        return uname;
    }

    @Override
    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    @Override
    public String getRemark()
    {
        return remark;
    }

    public void setBroadtimes(String broadtimes)
    {
        this.broadtimes = broadtimes;
    }

    public String getBroadtimes()
    {
        return broadtimes;
    }

    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "ProSinmanage{" +
                "sfid='" + sfid + '\'' +
                ", scategory='" + scategory + '\'' +
                ", submittime='" + submittime + '\'' +
                ", pname='" + pname + '\'' +
                ", createtime='" + createtime + '\'' +
                ", broaddate='" + broaddate + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", uname='" + uname + '\'' +
                ", remark='" + remark + '\'' +
                ", broadtimes='" + broadtimes + '\'' +
                '}';
    }
}
