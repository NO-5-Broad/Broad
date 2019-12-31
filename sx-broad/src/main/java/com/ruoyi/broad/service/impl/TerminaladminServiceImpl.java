package com.ruoyi.broad.service.impl;

import com.ruoyi.broad.domain.Terminaladmin;
import com.ruoyi.broad.mapper.TerminaladminMapper;
import com.ruoyi.broad.service.ITerminaladminService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public  class  TerminaladminServiceImpl implements ITerminaladminService{  //class
    @Autowired
    private TerminaladminMapper terminaladminMapper;
    /**
     * 查询终端用户信息
     *
     * @param aid 终端用户ID
     * @return 终端用户信息
     */
    //@Override
    @DataSource(value = DataSourceType.SLAVE)
    public Terminaladmin selectTerminaladminById(String aid){
        return terminaladminMapper.selectTerminaladminById(aid);
    }
    /**
     * 查询终端用户列表
     *
     * @param terminaladmin 终端用户信息
     * @return 终端用户集合
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<Terminaladmin> selectTerminaladminList(Terminaladmin terminaladmin) {
        return terminaladminMapper.selectTerminaladminList(terminaladmin);
    }
    /**
     * 修改终端用户
     *
     * @param terminaladmin 终端用户信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int updateTerminaladmin(Terminaladmin terminaladmin){
        return terminaladminMapper.updateTerminaladmin(terminaladmin);
    }

    /**
     * 删除终端用户对象
     *
     * @param aid 需要删除的数据ID
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int deleteTerminaladminById(String aid){
        return terminaladminMapper.deleteTerminaladminById(Convert.toStrArray(aid));
    }
    /**
     * 新增终端用户信息
     *
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int insertTerminaladmin(Terminaladmin terminaladmin){
        return terminaladminMapper.insertTerminaladmin(terminaladmin);
    }
}
