package structure;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void test() {
        MyQueue queue = new MyQueue<Integer>(30);
        Assert.assertThat(queue.isEmpty(), Is.is(true));

        queue.add(1);
        queue.add(2);
        Assert.assertThat(queue.isEmpty(), Is.is(false));
        Assert.assertThat(queue.peek(), Is.is(1));

        ;
        Assert.assertThat(queue.remove(), Is.is(1));
        Assert.assertThat(queue.remove(), Is.is(2));
    }
}
