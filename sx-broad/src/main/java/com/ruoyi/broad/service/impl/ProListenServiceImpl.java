package com.ruoyi.broad.service.impl;

import com.ruoyi.broad.domain.ProApplyUser;
import com.ruoyi.broad.domain.ProListen;
import com.ruoyi.broad.domain.ProreApply;
import com.ruoyi.broad.mapper.ProListenMapper;
import com.ruoyi.broad.mapper.ProreApplyMapper;
import com.ruoyi.broad.service.IProListenService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2019/8/11.
 * @author cx
 * @description 节目省听业务层实现
 */
@Service
public class ProListenServiceImpl implements IProListenService {
    @Autowired
    private ProListenMapper proListenMapper;

    /**
     * 查询节目申请信息
     *
     * @param paid 节目申请ID
     * @return 节目申请信息
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public ProListen selectProListenById(Integer paid)
    {
        return proListenMapper.selectProListenById(paid);
    }

    /**
     * 查询节目申请列表
     *
     * @param proListen 节目申请信息
     * @return 节目申请集合
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<ProListen> selectProListenList(ProListen proListen)
    {
        return proListenMapper.selectProListenList(proListen);
    }

    /**
     * 新增节目申请
     *
     * @param proListen 节目申请信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int insertProListen(ProListen proListen)
    {
        return proListenMapper.insertProListen(proListen);
    }

    /**
     * 修改节目申请
     *
     * @param proListen 节目申请信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int updateProListen(ProListen proListen)
    {
        return proListenMapper.updateProListen(proListen);
    }

    /**
     * 删除节目申请对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int deleteProListenByIds(String ids)
    {
        return proListenMapper.deleteProListenByIds(Convert.toStrArray(ids));
    }

    /**
     * 该方法只提供节目申请表中的目录
     * @param proApplyUser
     * @return java.util.List<com.ruoyi.broad.domain.ProApplyUser>
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<ProApplyUser> selectProrApplyUserList(ProApplyUser proApplyUser){
        return proListenMapper.selectProrApplyUserList(proApplyUser);
    }

}
