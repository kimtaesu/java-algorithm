import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class CommaTest {
    @Test
    public void test1() {
        Assert.assertThat(comma("1000"), Is.is("1,000"));
        Assert.assertThat(comma("123456789"), Is.is("123,456,789"));
    }

    public String comma(String s) {
        int len = s.length();
        int position = len % 3;
        StringBuilder builder = new StringBuilder();
        if (s.contains(".")) {
            s.substring(0, s.indexOf("."));
        } else {
            if (position != 0)
                builder.append(s, 0, position);
            while (position < len) {
                if (builder.length() > 0) builder.append(",");
                builder.append(s, position, position + 3);
                position += 3;
            }
        }

        return builder.toString();
    }
}