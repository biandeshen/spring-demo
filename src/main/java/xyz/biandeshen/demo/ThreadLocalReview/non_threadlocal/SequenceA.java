package xyz.biandeshen.demo.ThreadLocalReview.non_threadlocal;

/**
 * @author fjp
 * @Title: SequenceA
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2611:32
 */
public class SequenceA implements Sequence {


    private int number;

    @Override
    public int getNumber() {
        number = number + 1;
        return number;
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceA();

        ClientThread clientThread1 = new ClientThread(sequence);
        ClientThread clientThread2 = new ClientThread(sequence);
        ClientThread clientThread3 = new ClientThread(sequence);

        clientThread1.start();
        clientThread2.start();
        clientThread3.start();
    }
}
