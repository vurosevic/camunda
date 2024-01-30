package com.vlada.camundademo.config;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.spring.ProcessEngineFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class CamundaConfig {

    @Bean
    public ProcessEngine processEngine(@Qualifier("&processEngineFactoryBean") ProcessEngineFactoryBean factoryBean) throws Exception {
        return factoryBean.getObject();
    }
}
