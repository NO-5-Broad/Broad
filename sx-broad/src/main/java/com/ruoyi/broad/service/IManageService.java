package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.Manage;

import java.util.List;

/**
 * @author cx
 * @Time 2019/8/20 15:58
 * @Description 管理参数 服务层接口
 */
public interface IManageService {

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
