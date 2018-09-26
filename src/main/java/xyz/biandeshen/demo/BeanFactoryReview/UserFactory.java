package xyz.biandeshen.demo.BeanFactoryReview;

import java.util.Random;

/**
 * @author fjp
 * @Title: UserFactory1
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2111:26
 */
public class UserFactory {

    private String name;
    private static UserFactory instance;


    public UserFactory() {

    }

    /**
     * Sets the name.
     * <p>
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    public static synchronized UserFactory getInstance() {
        if (instance == null) {
            instance = new UserFactory();
        }
        return instance;
    }


    public User getUser() {
        if (name == null) {
            return null;
        }
        if (name.startsWith("a")) {
            return new User(name, 10 + (new Random().nextInt(9)));
        }
        if (name.startsWith("b")) {
            return new User(name, 20 + (new Random().nextInt(9)));
        }
        if (name.startsWith("c")) {
            return new User(name, 30 + (new Random().nextInt(9)));
        }
        return new User(name, (new Random().nextInt(110) + 40));
    }


}
