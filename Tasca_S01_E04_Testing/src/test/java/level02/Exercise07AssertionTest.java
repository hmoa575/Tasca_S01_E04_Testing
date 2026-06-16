package level02;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise07AssertionTest {
    @Test
    void testOptionalIsEmpty() {
        Optional<String> emptyOptional = Optional.empty();

        assertThat(emptyOptional).isEmpty();
    }
}
