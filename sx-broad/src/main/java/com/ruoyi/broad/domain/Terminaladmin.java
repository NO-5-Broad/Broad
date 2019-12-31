package com.ruoyi.broad.domain;

public class Terminaladmin {
    private static final long serialVersionUID = 1L;
    /**
     * 所属用户
     */
    private String uname;
    /**
     * 终端编号
     */
    private String aid;
    /**
     * 终端类型
     */
    private String type;
    /**
     * 所属分组
     */
    private String group;
    /**
     * 授权手机号
     */
    private String uphone;
    /**
     * 安装地址
     */
    private String address;
    /**
     * 终端出厂编号
     */
    private String tnum;
    /**
     * 用户编号
     */
    private String uerid;
    /**
     * 接入通信网标准
     */
    private String tinternet;
    /**
     * 广播电视网标准
     */
    private String ginternet;
    /**
     * 是否启用
     */
    private String enable;
    /**
     * 创建时间
     */
    private String createtime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return uname;
    }

    public void setUsername(String uname) {
        this.uname = uname;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    public String getUerid() {
        return uerid;
    }

    public void setUerid(String uerid) {
        this.uerid = uerid;
    }

    public String getTinternet() {
        return tinternet;
    }

    public void setTinternet(String tinternet) {
        this.tinternet = tinternet;
    }

    public String getGinternet() {
        return ginternet;
    }

    public void setGinternet(String ginternet) {
        this.ginternet = ginternet;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Terminaladmin{" +
                "uname='" + uname + '\'' +
                ", aid='" + aid + '\'' +
                ", type='" + type + '\'' +
                ", group='" + group + '\'' +
                ", uphone='" + uphone + '\'' +
                ", address='" + address + '\'' +
                ", tnum='" + tnum + '\'' +
                ", uerid='" + uerid + '\'' +
                ", tinternet='" + tinternet + '\'' +
                ", ginternet='" + ginternet + '\'' +
                ", enable='" + enable + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
