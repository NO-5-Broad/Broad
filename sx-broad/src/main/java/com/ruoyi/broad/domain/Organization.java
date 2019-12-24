package com.ruoyi.broad.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 终端表 tb_organization
 *
 * @author cx
 * @date 2019-09-21
 */
public class Organization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**终端imei*/
    @Excel(name = "终端IMEI号")
    private String tid;

    /**设备编号*/
    @Excel(name = "终端编号")
    private String tname;

    /**所属分组*/
    @Excel(name = "所属分组编号")
    private String aname;

    /**所属用户*/
    @Excel(name = "所属用户编号")
    private String uname;

    /**出厂编号*/
    @Excel(name = "终端出厂编号")
    private String facid;

    /**终端地址*/
    @Excel(name = "终端安装地址")
    private String address;

    /**终端经度*/
    @Excel(name = "安装点经度")
    private String longitude;

    /**终端纬度*/
    @Excel(name = "安装点纬度")
    private String latitude;

    /**终端手机号码*/
    @Excel(name = "终端手机号码")
    private String phone;

    /**终端接入通信网*/
    @Excel(name = "接入通信网标准")
    private String comstand;

    /**终端接入广播电视网模式*/
    @Excel(name = "接入广播电视网模式")
    private String broadtel;

    /**调频接收频率（可收转广播频率）*/
    @Excel(name = "终端可收转广播频率")
    private String fmfrequency;

    /**终端管理员*/
    @Excel(name = "终端管理员姓名")
    private String manager;

    /**管理员电话*/
    @Excel(name = "终端管理员电话")
    private String managertel;

    /**交互时间*/
    @Excel(name = "终端交互时间")
    private String intertime;

    /**rds码*/
    @Excel(name = "RDS码")
    private String rds;

    /**终端流量使用限制，单位MB*/
    @Excel(name = "终端流量限制")
    private String trafficlimit;

    /**节目播出主管单位*/
    @Excel(name = "节目播出主管单位")
    private String supervisionUnit;

    /**安全播出责任单位*/
    @Excel(name = "安全播出责任单位")
    private String accountabilityUnit;

    /**覆盖用户*/
    @Excel(name = "覆盖用户")
    private String families;

    /**覆盖人口数*/
    @Excel(name = "覆盖人口数")
    private String population;

    /**二次覆盖模式*/
    @Excel(name = "二次覆盖模式")
    private String twoOverlayMode;

    /**二次覆盖终端数*/
    @Excel(name = "二次覆盖终端数")
    private String twoOverlayNumber;

    /**二次覆盖用户数*/
    @Excel(name = "二次覆盖用户数")
    private String twoOverlayFamiles;

    /**二次覆盖人口数*/
    @Excel(name = "二次覆盖人口数")
    private String twoOverlayPopulations;

    /**耗电指数*/
    @Excel(name = "耗电指数")
    private String powerConsumption;

    /**年度维护经费*/
    @Excel(name = "维护经费")
    private String maintenanceFunds;

    /**所属用户名称*/
    private String username;

    private String longitudelatitude;
    /**最后访问日期*/
    private String lastaccesstime;
    /**终端类型*/
    private String terminaltype;
    /**基站编码*/
    private String basestation;
    /**年耗电量*/
    private String ypowerconsumption;
    /**流量使用情况*/
    private String usetraffic;
    /**在线状态*/
    private String onlinestate;
    /**DCS码*/
    private String dcs;
    /**发射功率*/
    private String transmitpower;
    /**发射频率*/
    private String transmitfrequency;
    /**反射功率*/
    private String reflectedpower;
    /**反射电压*/
    private String workvoltage;
    /**电池电压*/
    private String batteryvoltage;
    /**负载电流*/
    private String loadcurrent;
    /**供电模式*/
    private String pdmode;
    /**充电电流*/
    private String chargecurrent;
    /**创建时间*/
    private String createdtime;
    /**是否启用*/
    private boolean isuse;

    private String isused;
    /**终端地域id*/
    private String aid;
    /**备注*/
    private String note;
    /**终端授权号码*/
    private String atphone;
    /**广播接收频率*/
    private String brfrequency;
    /**网络类型*/
    private String nettype;
    /**月流量使用*/
    private String mflowusing;
    /**对讲接收频率*/
    private String irfrequency;
    /**终端音量*/
    private String eovolume;
    /**现场照片*/
    private String poscene;
    /**父地域id*/
    private String parentaid;
    /**所属用户编号*/
    private String userid;
    /**心跳包时间*/
    private String hbtime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLastaccesstime() {
        return lastaccesstime;
    }

    public void setLastaccesstime(String lastaccesstime) {
        this.lastaccesstime = lastaccesstime;
    }

    public String getIntertime() {
        return intertime;
    }

    public void setIntertime(String intertime) {
        this.intertime = intertime;
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getBasestation() {
        return basestation;
    }

    public void setBasestation(String basestation) {
        this.basestation = basestation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMaintenanceFunds() {
        return maintenanceFunds;
    }

    public void setMaintenanceFunds(String maintenanceFunds) {
        this.maintenanceFunds = maintenanceFunds;
    }

    public String getYpowerconsumption() {
        return ypowerconsumption;
    }

    public void setYpowerconsumption(String ypowerconsumption) {
        this.ypowerconsumption = ypowerconsumption;
    }

    public String getUsetraffic() {
        return usetraffic;
    }

    public void setUsetraffic(String usetraffic) {
        this.usetraffic = usetraffic;
    }

    public String getOnlinestate() {
        return onlinestate;
    }

    public void setOnlinestate(String onlinestate) {
        this.onlinestate = onlinestate;
    }

    public String getDcs() {
        return dcs;
    }

    public void setDcs(String dcs) {
        this.dcs = dcs;
    }

    public String getTransmitpower() {
        return transmitpower;
    }

    public void setTransmitpower(String transmitpower) {
        this.transmitpower = transmitpower;
    }

    public String getTransmitfrequency() {
        return transmitfrequency;
    }

    public void setTransmitfrequency(String transmitfrequency) {
        this.transmitfrequency = transmitfrequency;
    }

    public String getReflectedpower() {
        return reflectedpower;
    }

    public void setReflectedpower(String reflectedpower) {
        this.reflectedpower = reflectedpower;
    }

    public String getWorkvoltage() {
        return workvoltage;
    }

    public void setWorkvoltage(String workvoltage) {
        this.workvoltage = workvoltage;
    }

    public String getBatteryvoltage() {
        return batteryvoltage;
    }

    public void setBatteryvoltage(String batteryvoltage) {
        this.batteryvoltage = batteryvoltage;
    }

    public String getLoadcurrent() {
        return loadcurrent;
    }

    public void setLoadcurrent(String loadcurrent) {
        this.loadcurrent = loadcurrent;
    }

    public String getPdmode() {
        return pdmode;
    }

    public void setPdmode(String pdmode) {
        this.pdmode = pdmode;
    }

    public String getChargecurrent() {
        return chargecurrent;
    }

    public void setChargecurrent(String chargecurrent) {
        this.chargecurrent = chargecurrent;
    }

    public String getFmfrequency() {
        return fmfrequency;
    }

    public void setFmfrequency(String fmfrequency) {
        this.fmfrequency = fmfrequency;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagertel() {
        return managertel;
    }

    public void setManagertel(String managertel) {
        this.managertel = managertel;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRds() {
        return rds;
    }

    public void setRds(String rds) {
        this.rds = rds;
    }

    public String getAtphone() {
        return atphone;
    }

    public void setAtphone(String atphone) {
        this.atphone = atphone;
    }

    public String getBrfrequency() {
        return brfrequency;
    }

    public void setBrfrequency(String brfrequency) {
        this.brfrequency = brfrequency;
    }

    public String getFacid() {
        return facid;
    }

    public void setFacid(String facid) {
        this.facid = facid;
    }

    public String getNettype() {
        return nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype;
    }

    public String getMflowusing() {
        return mflowusing;
    }

    public void setMflowusing(String mflowusing) {
        this.mflowusing = mflowusing;
    }

    public String getIrfrequency() {
        return irfrequency;
    }

    public void setIrfrequency(String irfrequency) {
        this.irfrequency = irfrequency;
    }

    public String getEovolume() {
        return eovolume;
    }

    public void setEovolume(String eovolume) {
        this.eovolume = eovolume;
    }

    public String getPoscene() {
        return poscene;
    }

    public void setPoscene(String poscene) {
        this.poscene = poscene;
    }

    public String getParentaid() {
        return parentaid;
    }

    public void setParentaid(String parentaid) {
        this.parentaid = parentaid;
    }

    public String getComstand() {
        return comstand;
    }

    public void setComstand(String comstand) {
        this.comstand = comstand;
    }

    public String getBroadtel() {
        return broadtel;
    }

    public void setBroadtel(String broadtel) {
        this.broadtel = broadtel;
    }

    public String getTrafficlimit() {
        return trafficlimit;
    }

    public void setTrafficlimit(String trafficlimit) {
        this.trafficlimit = trafficlimit;
    }

    public String getSupervisionUnit() {
        return supervisionUnit;
    }

    public void setSupervisionUnit(String supervisionUnit) {
        this.supervisionUnit = supervisionUnit;
    }

    public String getAccountabilityUnit() {
        return accountabilityUnit;
    }

    public void setAccountabilityUnit(String accountabilityUnit) {
        this.accountabilityUnit = accountabilityUnit;
    }

    public String getFamilies() {
        return families;
    }

    public void setFamilies(String families) {
        this.families = families;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getTwoOverlayMode() {
        return twoOverlayMode;
    }

    public void setTwoOverlayMode(String twoOverlayMode) {
        this.twoOverlayMode = twoOverlayMode;
    }

    public String getTwoOverlayNumber() {
        return twoOverlayNumber;
    }

    public void setTwoOverlayNumber(String twoOverlayNumber) {
        this.twoOverlayNumber = twoOverlayNumber;
    }

    public String getTwoOverlayFamiles() {
        return twoOverlayFamiles;
    }

    public void setTwoOverlayFamiles(String twoOverlayFamiles) {
        this.twoOverlayFamiles = twoOverlayFamiles;
    }

    public String getTwoOverlayPopulations() {
        return twoOverlayPopulations;
    }

    public void setTwoOverlayPopulations(String twoOverlayPopulations) {
        this.twoOverlayPopulations = twoOverlayPopulations;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getHbtime() {
        return hbtime;
    }

    public void setHbtime(String hbtime) {
        this.hbtime = hbtime;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLongitudelatitude() {
        return longitudelatitude;
    }

    public void setLongitudelatitude(String longitudelatitude) {
        this.longitudelatitude = longitudelatitude;
    }
}
