package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean, InitializingBean {
    public SpringBean() {
        System.out.println("SpringBean-constructor");
    }

    @Override
    public void setBeanName(String name) {
       // System.out.println("SpringBean-bean name awre");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      //  System.out.println("SpringBean-bean factory name awre");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       // System.out.println("SpringBean-application context awre");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
       // System.out.println("SpringBean-Initializing bean");

    }

    @Override
    public void destroy() throws Exception {
       // System.out.println("SpringBean-destroy");

    }


}
