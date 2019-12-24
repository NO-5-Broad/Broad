package com.ruoyi.api.controller.village;

import com.ruoyi.framework.web.base.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.village.domain.Andrpic;
import com.ruoyi.village.service.IAndrpicService;
/**
 * 三级图片 控制层
 *
 * @author hfz
 * @date 2019-11-3
 */
@RestController
@RequestMapping("/api/andrpic")
@CrossOrigin
@Api(value = "三级图片")
public class AndrpicCount extends BaseController{
    @Autowired
    private IAndrpicService andrpicService;
    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询三级图片列表")
    public RongApiRes list(Andrpic andrpic)
    {

        return RongApiService.get_list(andrpicService.selectAndrpicList(andrpic));
    }
}
