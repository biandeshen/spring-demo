package xyz.biandeshen.demo.ThreadLocalReview.non_threadlocal;

/**
 * @author fjp
 * @Title: ThreadObjectMapTest
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2614:13
 */
public class ThreadObjectMapTest implements Sequence {
    ThreadObjectMap<Integer> threadObjectMap = new ThreadObjectMap() {
        @Override
        public Object initValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        threadObjectMap.set(threadObjectMap.get() + 1);
        return threadObjectMap.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceB();

        ClientThread clientThread1 = new ClientThread(sequence);
        ClientThread clientThread2 = new ClientThread(sequence);
        ClientThread clientThread3 = new ClientThread(sequence);

        clientThread1.start();
        clientThread2.start();
        clientThread3.start();
    }

}
