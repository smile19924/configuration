/*
 * 文 件 名:  PeopleController.java
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

import cn.migu.payment.config.domain.People;
import cn.migu.payment.config.service.PeopleService;

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
public class PeopleController
{
    @Autowired
    private PeopleService service;
    
    @RequestMapping("people")
    public String people(Model model)
    {
        return "people";
    }
    
    @RequestMapping("peopleList")
    @ResponseBody
    public List<People> queryPeopleList()
    {
        return service.queryList();
    }
    
    @RequestMapping("savePeople")
    @ResponseBody
    public boolean savePeople(People record)
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
    
    @RequestMapping("deletePeople")
    @ResponseBody
    public boolean deletePeople(Long id)
    {
        int flag = service.delete(id);
        return flag == 0 ? false : true;
    }
    
    @RequestMapping("getPeopleDetail")
    @ResponseBody
    public People getDetail(Long id)
    {
        return service.getDetail(id);
    }
    
}
