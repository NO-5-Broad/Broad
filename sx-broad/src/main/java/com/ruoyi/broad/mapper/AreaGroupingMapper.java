package com.ruoyi.broad.mapper;

import com.ruoyi.broad.domain.AreaGrouping;

import java.util.List;

/**
 * Created by ASUS on 2019/8/2.
 * @author 陈霞
 * @return 分组列表管理
 */
public interface AreaGroupingMapper {
    /**
    * 查询分组列表，连表查询
    *
    * @return 终端分组列表
    */
    public List<AreaGrouping> listAreaGrouping(AreaGrouping areaGrouping);


    /**
     * @author cx
     * @param aid
     *
     * @Description 分组管理批量删除
     */
    public int deleteAreaGroupingByIds(String[] aid);

    /**
    * 更新分组列表
    *
    * @return 终端分组列表
    */
    public int updateAreaGrouping(AreaGrouping areaGrouping);

    /**
    * 插入分组列表
    *
    * @return 终端分组列表
    */
    public int insertAreaGrouping(AreaGrouping areaGrouping);

    /**
     * 查询分组列表
     *
     * @return 终端分组列表
     */
    public AreaGrouping selectAreaGroupingByAid(String aid);
}
