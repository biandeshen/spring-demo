package xyz.biandeshen.demo.BeanFactoryReview;

import lombok.Data;
import org.springframework.context.annotation.Bean;


/**
 * @author fjp
 * @Title: User
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2111:30
 */
@Data
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }
}
