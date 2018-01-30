package junit;


import java.util.LinkedList;
import java.util.Queue;

public class Producer extends Thread{

    @Override
    public void run() {

        while (true){

            try {
                QueueUtils.add();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
