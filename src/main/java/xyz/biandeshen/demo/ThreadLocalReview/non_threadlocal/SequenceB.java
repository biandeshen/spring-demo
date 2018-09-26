package xyz.biandeshen.demo.ThreadLocalReview.non_threadlocal;

/**
 * @author fjp
 * @Title: SequenceB
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2611:38
 */
public class SequenceB implements Sequence {
//    private ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>(){
//        @Override
//        protected Integer initialValue() {
//            return 0;
//        }
//    };

    private ThreadLocal<Integer> numberContainer = ThreadLocal.withInitial(() -> 0);

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
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
