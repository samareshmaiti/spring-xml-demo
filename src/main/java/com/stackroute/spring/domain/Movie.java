package com.stackroute.spring.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {

        this.actor = actor;
    }
    public Movie() {
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory interface executed");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName interface executed");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context executed");
    }
}
