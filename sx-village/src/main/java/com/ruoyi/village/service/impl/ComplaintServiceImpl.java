package com.ruoyi.village.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.village.domain.Complaint;
import com.ruoyi.village.mapper.ComplaintMapper;
import com.ruoyi.village.service.IComplaintService;
import com.ruoyi.village.util.FilterText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: lyb_RongSys
 * @description: 投诉咨询
 * @author: Mr.Liu
 * @create: 2019-01-14 15:40
 **/
@Service
public class ComplaintServiceImpl implements IComplaintService {

    @Autowired
    private ComplaintMapper complaintMapper;

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Complaint> selectComplaintsList(Complaint complaintmessages) {
        List<Complaint> list = complaintMapper.selectComplaintsList(complaintmessages);
        for(Complaint complaints : list){
            if(complaints.getContent().length()>0)
                complaints.setContent(FilterText.delHTMLTag(complaints.getContent()));
        }
        return list;
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteComplaintsByids(String fbid) {
        return complaintMapper.deleteComplaintsByids(Convert.toStrArray(fbid));
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertcomplaintsmessages(Complaint complaint) {
        return complaintMapper.insertcomplaintsmessages(complaint);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Complaint selectByfbid(Integer fbid) {
        return complaintMapper.selectByfbid(fbid);
    }


    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateComplaintsmessages(Complaint complaint) {
        return complaintMapper.updateComplaintsmessages(complaint);
    }
}
