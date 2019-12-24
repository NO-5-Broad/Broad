package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Politics;

import java.util.List;
/**
 * @Description: 政策Mapper$
 * @Param: dyq_RongSys$
 * @return: $
 * @Author: Mr.DYQ
 * @Date: $
 */
public interface PoliticsMapper {
       /**
     * 政策记录列表
     *
     * @return
     */
    List<Politics> selectPoliticsList(Politics politics);

    /**
     * 根据shiid删除数据
     * @param id
     */
    int deletePoliticsByids(String[] id);

    /**
     * 添加政策信息
     * @param politics
     * @return
     */
    int insertpolitics(Politics politics);

    /**
     * 根据shiid选择数据
     * @param shiid
     * @return
     */
    Politics selectByshiid(Integer shiid);

    /**
     * 保存用户修改
     * @param politics
     * @return
     */
    int updatePolitics(Politics politics);

    /**
     * 删除政策信息
     * @param shiid
     * @return
     */
    int deletePoliticsByIds(String shiid);
}
