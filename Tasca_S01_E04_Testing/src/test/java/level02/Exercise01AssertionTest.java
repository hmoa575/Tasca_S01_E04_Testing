package level02;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise01AssertionTest {

    @Test
    void integersEqual(){
        int currentValue = 40;
        int expectedValue = 40;
            assertThat(currentValue).isEqualTo(expectedValue);
    }
    @Test
    void integersNotEqual(){
        int currentValue = 40;
        int unexpectedValue = 45;
        assertThat(currentValue).isNotEqualTo(unexpectedValue);
    }

}
