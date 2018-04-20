/*
 * 文 件 名:  People.java
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
@Table(name = "T_CONFIG_PEOPLE")
public class People
{
    @Id
    @SequenceGenerator(name = "", sequenceName = "SEQ_CONFIG_PEOPLE")
    private Long id;
    
    private String name;
    
    private String tel;
    
    private String email;
    
    private String company;
    
    private String city;
    
    private String position;
    
    private String remark;
    
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
     * @return 返回 name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param 对name进行赋值 */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return 返回 tel
     */
    public String getTel()
    {
        return tel;
    }
    
    /**
     * @param 对tel进行赋值 */
    public void setTel(String tel)
    {
        this.tel = tel;
    }
    
    /**
     * @return 返回 email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * @param 对email进行赋值 */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * @return 返回 company
     */
    public String getCompany()
    {
        return company;
    }
    
    /**
     * @param 对company进行赋值 */
    public void setCompany(String company)
    {
        this.company = company;
    }
    
    /**
     * @return 返回 city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * @param 对city进行赋值 */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * @return 返回 position
     */
    public String getPosition()
    {
        return position;
    }
    
    /**
     * @param 对position进行赋值 */
    public void setPosition(String position)
    {
        this.position = position;
    }
    
    /**
     * @return 返回 remark
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * @param 对remark进行赋值 */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
}
