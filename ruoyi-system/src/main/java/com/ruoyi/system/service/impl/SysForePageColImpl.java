package com.ruoyi.system.service.impl;


import com.ruoyi.system.domain.SysForePage;
import com.ruoyi.system.mapper.SysForePageColMapper;

import com.ruoyi.system.service.ISysForePagecolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysForePageColImpl implements ISysForePagecolService {
    @Autowired
    private SysForePageColMapper sysForePagecolMapper;

    @Override
    public List<SysForePage> selectForePageStatus()
    {
        return sysForePagecolMapper.selectForePageStatus();
    }
}
