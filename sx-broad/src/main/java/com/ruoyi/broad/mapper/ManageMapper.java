package com.ruoyi.broad.mapper;

import com.ruoyi.broad.domain.Manage;

import java.util.List;

/**
 * @author cx
 * @Time 2019/8/20 15:27
 * @Description 管理参数列表 数据层
 */
public interface ManageMapper {

    /**
     * @param manage
     * @author cx
     * @Description 查询管理参数列表
     */
    public List<Manage> selectManagelist(Manage manage);

    /**
     * @param manage
     * @author cx
     * @Description 更新参数列表
     */
    public int updateManage(Manage manage);

    /**
     * @param manage
     * @author cx
     * @Description 插入参数列表
     */
    public int insertManage(Manage manage);


}
