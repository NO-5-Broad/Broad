package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.Terminaladmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITerminaladminService  {

    /**
     * 查询终端用户信息
     *
     * @param aid 终端用户ID
     * @return 终端用户信息
     */
    public Terminaladmin selectTerminaladminById(String aid);
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
    public int updateTerminaladmin(Terminaladmin terminaladmin);

    /**
     * 删除终端用户信息
     *
     * @param aid 需要删除的数据ID
     * @return 结果
     */
    public int deleteTerminaladminById(String aid);
    /**
     * @param aid
     * @param uname
     * @param uphone
     * @return
     */
    public int insertTerminaladmin(Terminaladmin terminaladmin);


}
