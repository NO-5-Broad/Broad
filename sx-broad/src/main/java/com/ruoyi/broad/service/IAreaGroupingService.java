package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.AreaGrouping;

import java.util.List;

/**
 * Created by ASUS on 2019/8/2.
 *
 * @author 陈霞
 */
public interface IAreaGroupingService {
    /**
     * 查询分组列表，连表查询
     *
     * @return 终端分组列表
     */
    public List<AreaGrouping> listAreaGrouping(AreaGrouping areaGrouping);


    /**
     * @param aid
     * @author cx
     * @Description 分组管理批量删除
     */
    public int deleteAreaGroupingByIds(String aid);

    /**
     * 更新分组列表
     *
     * @return 终端分组列表
     */
    public int updateAreaGrouping(AreaGrouping areaGrouping);

    /*
     * 插入分组列表
     *
     * @return 终端分组列表
     * */

    public int insertAreaGrouping(AreaGrouping areaGrouping);

    /*
     * 查询分组管理记录
     *
     * @return 分组管理
     * */

    public AreaGrouping selectAreaGroupingByAid(String aid);
}
