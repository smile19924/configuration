/*
 * 文 件 名:  EnviromentService.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  chenwenwen
 * 创建时间:  2017年9月5日
 
 */
package cn.migu.payment.config.service;

import java.util.List;

import cn.migu.payment.config.domain.Enviroment;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenwenwen
 * @version  [1.0.0, 2017年9月5日]
 * @see  [相关类/方法]
 * @since  [点数平台/模块版本]
 */
public interface EnviromentService
{
    List<Enviroment> queryList();
    
    int insert(Enviroment record);
    
    int update(Enviroment record);
    
    int delete(Long id);
    
    Enviroment getOne(Long id);
    
}
