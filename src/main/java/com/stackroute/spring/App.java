package com.stackroute.spring;
import com.stackroute.spring.domain.BeanLifecycleDemoBean;
import com.stackroute.spring.domain.BeanPostProcessorDemoBean;
import com.stackroute.spring.domain.Movie;
import com.stackroute.spring.domain.Actor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean =
                (BeanLifecycleDemoBean) configurableApplicationContext.getBean("BeanLifeCycleDemoBean");
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=(BeanPostProcessorDemoBean) configurableApplicationContext.getBean("BeanPostProcessorDemoBean") ;
        System.out.println(beanPostProcessorDemoBean);
        System.out.println(beanLifecycleDemoBean);

        configurableApplicationContext.close();

    }
}
