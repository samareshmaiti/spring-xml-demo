package com.stackroute.spring.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //    The afterPropertiesSet() method is called, after the message property is set;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Calling after properties set");
    }

//    while the destroy() method is call after the context.close();

    @Override
    public void destroy() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }


}
