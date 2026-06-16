package level02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise04AssertionTest {
    private List<Object> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add("first");
        list.add(42);
        list.add(new Exercise04Assertion_House("Maple Street"));
        list.add("last");
    }
    @Test
    void testOrderIsPreserved(){
        assertThat(list).containsExactly(
                "first",
                42,
                new Exercise04Assertion_House("Maple Street"),
                "last"
        );
    }
    @Test
    void testContainsInAnyOrder(){
        assertThat(list).containsOnly(
                "first",
                42,
                new Exercise04Assertion_House("Maple Street"),
                "last"
        );
    }
    @Test
    void testElementAddedOnlyOnce(){
        assertThat(list).containsOnlyOnce("first");
    }
    @Test
    void testElementNotPresent(){
        assertThat(list).doesNotContain("missing");
    }
}
