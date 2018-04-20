/*
 * 文 件 名:  EnvirementController.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  chenwenwen
 * 创建时间:  2017年9月5日
 
 */
package cn.migu.payment.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.migu.payment.config.domain.Enviroment;
import cn.migu.payment.config.service.EnviromentService;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenwenwen
 * @version  [1.0.0, 2017年9月5日]
 * @see  [相关类/方法]
 * @since  [点数平台/模块版本]
 */
@Controller
public class EnviromentController
{
    @Autowired
    private EnviromentService service;
    
    @RequestMapping("enviroment")
    public String envirement(Model model)
    {
        return "enviroment";
    }
    
    @RequestMapping("enviromentList")
    @ResponseBody
    public List<Enviroment> queryEnviromentList()
    {
        return service.queryList();
    }
    
    @RequestMapping("saveEnviroment")
    @ResponseBody
    public boolean saveEnviroment(Enviroment record)
    {
        int flag = 0;
        if (null == record.getId())
        {
            flag = service.insert(record);
        }
        else
        {
            flag = service.update(record);
        }
        return flag == 0 ? false : true;
    }
    
    @RequestMapping("getEnviromentDetail")
    @ResponseBody
    public Enviroment getEnviromentDetail(Long id)
    {
        return service.getOne(id);
    }
    
    @RequestMapping("deleteEnv")
    @ResponseBody
    public boolean deleteEnv(Long id)
    {
        int flag = service.delete(id);
        return flag == 0 ? false : true;
    }
}
