package junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LIS on 29.01.2018.
 */
public class QueueUtilsTest {

    @Before
    public void addBefore(){
        QueueUtils.add();
        QueueUtils.add();
    }

    @Test
    public void add() throws Exception {
        QueueUtils.add();
        QueueUtils.add();
        assertEquals("2 add in Queue",4,QueueUtils.getQueue().size());
    }

    @Test
    public void getFromQueueDelete() throws Exception {
        int size = QueueUtils.getQueue().size();
        QueueUtils.getFromQueue();
        assertEquals("get from Queue, size-1",size-1,QueueUtils.getQueue().size());

    }

}