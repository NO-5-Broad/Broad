package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.ProList;
import com.ruoyi.broad.domain.ProSinmanage;
import com.ruoyi.broad.domain.ProTerminal;

import java.util.List;

/**
 * 节目播出单 服务层
 *
 * @author 张超
 * @date 2019-03-02
 */
public interface IProSinmanageService {
    /**
     * 查询节目播出单信息
     *
     * @param sfid 节目播出单ID
     * @return 节目播出单信息
     */
    public ProSinmanage selectProSinmanageById(Integer sfid);

    /**
     * 查询节目播出单列表
     *
     * @param proSinmanage 节目播出单信息
     * @return 节目播出单集合
     */
    public List<ProSinmanage> selectProSinmanageList(ProSinmanage proSinmanage);


    /**
     * 查询紧急节目播出单列表
     *
     * @param userid 节目播出单信息
     * @return 节目播出单集合
     */
    public List<ProSinmanage> selectProSinmanageListForWarning(int userid);

    /**
     * 新增节目播出单
     *
     * @param proSinmanage 节目播出单信息
     * @return 结果
     */
    public int insertProSinmanage(ProSinmanage proSinmanage);

    /**
     * 修改节目播出单
     *
     * @param proSinmanage 节目播出单信息
     * @return 结果
     */
    public int updateProSinmanage(ProSinmanage proSinmanage);

    /**
     * 删除节目播出单信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProSinmanageByIds(String ids);


    /**
     * 通过 sfid 查询节目编号List
     *
     * @param [sfids]
     * @return java.util.List<com.ruoyi.broad.domain.ProSinmanage>
     * @author 张超 teavamc
     * @date 2019/3/9
     */
    public List<ProSinmanage> selectProSinmanageListbySfid(String sfid);

    public List<ProSinmanage> selectProSinmanagebyoneday();

    /*通过终端ID查询其所有节目播出单*/
    public List<ProSinmanage> selectProSinmanageByTId(String tid);

    //	批量将节目单批量存储
    public int addProList(List<ProList> proList);

    public int addProTerminals(List<ProTerminal> proTerminal);

}