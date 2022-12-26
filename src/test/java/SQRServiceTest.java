import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/inputData.csv")

    public void testNumbSqrt(int borderBottom, int borderTop, int expected) {
        int actual = new SQRService().numbSqrt(borderBottom, borderTop);
        Assertions.assertEquals(expected, actual);
    }
}