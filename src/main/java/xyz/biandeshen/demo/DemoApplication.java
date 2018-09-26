package xyz.biandeshen.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.annotation.Configurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import xyz.biandeshen.demo.BeanFactoryReview.User;
import xyz.biandeshen.demo.BeanFactoryReview.UserFactory;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        Resource resource = new ClassPathResource("spring-beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Object userf = beanFactory.getBean("userf");
        System.out.println(userf);
        User user = ((UserFactory) userf).getUser();
        System.out.println("userf" + user);


        Object userFactory = beanFactory.getBean("userFactory");
        Object userFactory_F = beanFactory.getBean("&userFactory");
        System.out.println("userFactory" + "\t" + userFactory);
        System.out.println("&userFactory" + "\t" + userFactory_F);

        Object userFactory2 = beanFactory.getBean("userFactory2");
        System.out.println("userFactory2" + "\t" + userFactory2);

        Object customerUser = beanFactory.getBean("customerUser");
        System.out.println("customerUser" + "\t" + customerUser);


        Object customerUser_Bean = beanFactory.getBean("customerUser_Bean");
        System.out.println("customerUser_Bean" + "\t" + customerUser_Bean);

        Object customerUser2 = beanFactory.getBean("customerUser2");
        System.out.println("customerUser2" + "\t" + customerUser2);

        Object customerUser3 = beanFactory.getBean("customerUser3");
        System.out.println("customerUser3" + "\t" + customerUser3);


//        /* *********************************************** */
//        DefaultListableBeanFactory beanFactory1 = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory1);
//        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
//
//        UserFactory userFactory = beanFactory1.getBean(UserFactory.class);
//        User user2 = userFactory.getUser("张三");
//        System.out.println(user2);
//
//        User user3 = (User) beanFactory1.getBean("CustomerUser");
//        System.out.println(user3);

//        BeanFactory factory = new DefaultListableBeanFactory();


    }
}
