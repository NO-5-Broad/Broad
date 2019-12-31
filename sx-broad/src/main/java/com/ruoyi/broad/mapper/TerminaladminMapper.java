package com.ruoyi.broad.mapper;

import com.ruoyi.broad.domain.Terminaladmin;

import java.util.List;

public interface TerminaladminMapper {
    /**
     * 查询广播用户信息
     *
     * @param aid 用户ID
     * @return 终端管理用户信息
     */
    public  Terminaladmin selectTerminaladminById(String aid);

    /**
     * 查询终端用户列表
     *
     * @param terminaladmin 终端用户信息
     * @return 终端用户集合
     */
    public List<Terminaladmin> selectTerminaladminList(Terminaladmin terminaladmin);

    /**
     * 修改终端用户
     *
     * @param terminaladmin 终端用户信息
     * @return 结果
     */
    public  int updateTerminaladmin(Terminaladmin terminaladmin);

    /**
     * 删除终端用户
     *
     * @param aid 终端用户ID
     * @return 结果
     */
    public int deleteTerminaladminById(String[] aid);

    /**
     * 新增终端用户
     *
     * @return 结果
     */
    public int insertTerminaladmin(Terminaladmin terminaladmin);


}
