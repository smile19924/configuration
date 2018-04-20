/*
 * 文 件 名:  PeopleServiceImpl.java
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

import cn.migu.payment.config.domain.People;
import cn.migu.payment.config.mapper.PeopleMapper;
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
@Service
public class PeopleServiceImpl implements PeopleService
{
    @Resource
    private PeopleMapper peopleMapper;
    
    /** {@inheritDoc} */
    
    @Override
    public List<People> queryList()
    {
        return peopleMapper.selectAll();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int insert(People record)
    {
        return peopleMapper.insert(record);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int update(People record)
    {
        return peopleMapper.updateByPrimaryKey(record);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int delete(Long id)
    {
        return peopleMapper.deleteByPrimaryKey(id);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public People getDetail(Long id)
    {
        return peopleMapper.selectByPrimaryKey(id);
    }
    
}
