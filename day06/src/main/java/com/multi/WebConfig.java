package com.multi;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

//configuration을 담당하는 클래스
@Configuration
public class WebConfig implements ApplicationContextAware {

    ApplicationContext context;

  
    
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        //messages폴더 밑에 message를 불러온다.
        messageSource.setBasenames("messages/message");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }



    @Override
    public void setApplicationContext(ApplicationContext context) {
        this.context = context;
    }
}