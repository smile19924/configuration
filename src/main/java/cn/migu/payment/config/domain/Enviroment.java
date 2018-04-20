/*
 * 文 件 名:  Enviroment.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  chenwenwen
 * 创建时间:  2017年9月5日
 
 */
package cn.migu.payment.config.domain;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenwenwen
 * @version  [1.0.0, 2017年9月5日]
 * @see  [相关类/方法]
 * @since  [点数平台/模块版本]
 */
@Table(name = "T_CONFIG_ENVIRONMENT")
public class Enviroment
{
    @Id
    @SequenceGenerator(name = "", sequenceName = "SEQ_CONFIG_ENVIROMENT")
    private Long id;
    
    private String url;
    
    private String description;
    
    private Integer type;
    
    /**
     * @return 返回 id
     */
    public Long getId()
    {
        return id;
    }
    
    /**
     * @param 对id进行赋值 */
    public void setId(Long id)
    {
        this.id = id;
    }
    
    /**
     * @return 返回 url
     */
    public String getUrl()
    {
        return url;
    }
    
    /**
     * @param 对url进行赋值 */
    public void setUrl(String url)
    {
        this.url = url;
    }
    
    /**
     * @return 返回 description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @param 对description进行赋值 */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * @return 返回 type
     */
    public Integer getType()
    {
        return type;
    }
    
    /**
     * @param 对type进行赋值 */
    public void setType(Integer type)
    {
        this.type = type;
    }
    
}
