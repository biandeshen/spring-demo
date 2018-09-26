package xyz.biandeshen.demo.BeanFactoryReview;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import xyz.biandeshen.demo.DemoApplication;

/**
 * @author fjp
 * @Title: FactoryBeanPrefix
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2111:04
 */
public class FactoryBeanPrefix {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("spring-beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Object userf = beanFactory.getBean("userf");
        System.err.println(userf);
        User user = ((UserFactory) userf).getUser();
        System.err.println("userf" + user);


        Object userFactory = beanFactory.getBean("userFactory");
        Object userFactory_F = beanFactory.getBean("&userFactory");
        System.err.println("userFactory" + "\t" + userFactory);
        System.err.println("&userFactory" + "\t" + userFactory_F);

        Object userFactory2 = beanFactory.getBean("userFactory2");
        System.err.println("userFactory2" + "\t" + userFactory2);
        Object userFactory2_F = beanFactory.getBean("&userFactory2");
        System.err.println("&userFactory2" + "\t" + userFactory2_F);

        Object customerUser = beanFactory.getBean("customerUser");
        System.err.println("customerUser" + "\t" + customerUser);


        Object customerUser_Bean = beanFactory.getBean("customerUser_Bean");
        System.err.println("customerUser_Bean" + "\t" + customerUser_Bean);

        Object customerUser2 = beanFactory.getBean("customerUser2");
        System.err.println("customerUser2" + "\t" + customerUser2);

        Object customerUser3 = beanFactory.getBean("customerUser3");
        System.err.println("customerUser3" + "\t" + customerUser3);
    }

}
