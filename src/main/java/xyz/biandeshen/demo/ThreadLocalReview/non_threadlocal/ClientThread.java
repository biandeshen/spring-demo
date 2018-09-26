package xyz.biandeshen.demo.ThreadLocalReview.non_threadlocal;

/**
 * @author fjp
 * @Title: ClientThread
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/9/2611:25
 */
public class ClientThread extends Thread {
    private Sequence sequence;

    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " => " + sequence.getNumber());
        }
    }
}
