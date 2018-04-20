/*
 * 文 件 名:  EnviromentServiceImpl.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  chenwenwen
 * 创建时间:  2017年9月5日
 
 */
package cn.migu.payment.config.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.migu.payment.config.domain.Enviroment;
import cn.migu.payment.config.mapper.EnviromentMapper;
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
@Service
public class EnviromentServiceImpl implements EnviromentService
{
    @Resource
    private EnviromentMapper enviromentMapper;
    
    /** {@inheritDoc} */
    
    @Override
    public List<Enviroment> queryList()
    {
        return enviromentMapper.selectAll();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int insert(Enviroment record)
    {
        return enviromentMapper.insert(record);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int update(Enviroment record)
    {
        return enviromentMapper.updateByPrimaryKey(record);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int delete(Long id)
    {
        return enviromentMapper.deleteByPrimaryKey(id);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Enviroment getOne(Long id)
    {
        return enviromentMapper.selectByPrimaryKey(id);
    }
}
