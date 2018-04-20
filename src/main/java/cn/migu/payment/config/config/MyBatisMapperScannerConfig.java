package cn.migu.payment.config.config;

import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号>
 * 创 建 人:  蒋维佳
 * 创建时间:  2016/8/25 17:11
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig
{
    
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("cn.migu.payment.config.mapper.**");
        Properties properties = new Properties();
        properties.setProperty("mappers", "tk.mybatis.mapper.common.Mapper");
        properties.setProperty("ORDER", "BEFORE");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
