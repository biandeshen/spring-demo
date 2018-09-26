package xyz.biandeshen.demo.ThreadLocalReview.non_threadlocal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fjp
 * @Title: ThreadObjectMap
 * @ProjectName demo
 * @Description: 模仿ThreadLocal
 * @date 2018/9/2613:48
 */
public class ThreadObjectMap<T> {
    private Map<Thread, Object> threadObjectMap = new ConcurrentHashMap<>();


    /**
     * Gets the value of threadObjectMap.
     *
     * @return the value of threadObjectMap
     */
    public T get() {
        Thread thread = Thread.currentThread();
        if (threadObjectMap.get(thread) != null) {
            return (T) threadObjectMap.get(thread);
        }
        return setInitValue();
    }

    /**
     * Sets the threadObjectMap.
     * <p>
     * <p>You can use getThreadObjectMap() to get the value of threadObjectMap</p>
     *
     * @param Value Value
     */
    public void set(Object Value) {
        Thread thread = Thread.currentThread();
        threadObjectMap.put(thread, Value);
    }

    public T initValue() {
        return null;
    }

    public T setInitValue() {
        T value = initValue();
        Thread thread = Thread.currentThread();
        this.threadObjectMap.put(thread, value);
        return value;
    }
}
