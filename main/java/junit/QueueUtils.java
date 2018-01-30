package junit;


import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {
    private static final int begNum = 1;
    private static final int endNum = 100;
    private static Queue<Integer> queue = new LinkedList<Integer>();

    public static Queue<Integer> getQueue() {
        return queue;
    }

    private static int random(){
        int randNum=0;
        randNum += begNum + (int) (Math.random()*endNum);
        return randNum;
    }

    public static void add(){
        queue.add(random());
    }

    public static int getFromQueue(){
        int num = 0;
        try {
            num = queue.poll();
        }catch (NullPointerException e){
            num = 0;
        }

        return num;
    }

}
