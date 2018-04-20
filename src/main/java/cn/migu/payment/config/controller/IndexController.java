/*
 * 文 件 名:  IndexController.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  chenwenwen
 * 创建时间:  2017年9月5日
 
 */
package cn.migu.payment.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class IndexController
{
    @RequestMapping("/index")
    public String index(Model model)
    {
        model.addAttribute("name", "2222");
        return "index";
    }
}
