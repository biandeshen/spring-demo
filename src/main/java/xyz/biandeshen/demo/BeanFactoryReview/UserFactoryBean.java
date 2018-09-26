package xyz.biandeshen.demo.BeanFactoryReview;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author fjp
 * @Title: UserFactoryBean
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2515:45
 */
public class UserFactoryBean implements FactoryBean<UserFactory> {

    private UserFactory userFactory;


    public UserFactoryBean() {
    }

    public UserFactoryBean(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    @Override
    public UserFactory getObject() throws Exception {
        if (userFactory != null) {
            return userFactory;
        }
        return UserFactory.getInstance();
    }

    @Override
    public Class<? extends UserFactory> getObjectType() {
        return userFactory == null ? UserFactory.class : userFactory.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
