import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Shift {
    @Test
    public void test() {
        Assert.assertThat(rightRotateShift(1234, 2), Is.is(3412));
        Assert.assertThat(rightRotateShift(41234, 3), Is.is(23441));
    }

    public int rightRotateShift(int x, int count) {
        int l = String.valueOf(x).length() - count;
        int division = (int) Math.pow(10, l);
        int second = x % division;
        int first = x / division;

        return second * division + first;
    }
}
