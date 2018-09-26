package xyz.biandeshen.demo.ThreadLocalReview;

import org.springframework.core.NamedThreadLocal;
import org.springframework.core.io.support.EncodedResource;

import java.util.*;

/**
 * @author fjp
 * @Title: ThreadLocalTest
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2611:07
 */
public class ThreadLocalTest {
    private final ThreadLocal<Set<String>> resourcesCurrentlyBeingLoaded;

    public ThreadLocalTest() {
        this.resourcesCurrentlyBeingLoaded = new NamedThreadLocal("Set<String> currently being loaded");
    }

    public static void main(String[] args) {
        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        System.err.println(threadLocalTest.resourcesCurrentlyBeingLoaded);
        System.err.println(threadLocalTest.resourcesCurrentlyBeingLoaded.get());
        Set<String> stringList = new HashSet<>();
        stringList.add("zhangsan");
        stringList.add("lisi");
        threadLocalTest.resourcesCurrentlyBeingLoaded.set(stringList);
        System.err.println(threadLocalTest.resourcesCurrentlyBeingLoaded.get());


    }
}
