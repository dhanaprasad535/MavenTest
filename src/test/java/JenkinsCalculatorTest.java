import org.testng.annotations.Test;

public class JenkinsCalculatorTest {

    JenkinsCalculator jc = new JenkinsCalculator();

    // Add 2 numbers
    @Test
    public void addNumbersTest() {
        jc.addNumbers(5, 10);
    }

    @Test
    public void subNumbersTest() {
        jc.subNumbers(17, 3);
    }
}
