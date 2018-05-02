import java.util.stream.IntStream;

/**
 * Created by alatel01 on 02/05/2018.
 */
public class TestDate extends Date {
    public static void main(String[] args) {
        TestDate td = new TestDate();
        IntStream.range(1,350).forEach((a) -> {
            System.out.println(td.toString());
            td.advance();
        });
    }
}
