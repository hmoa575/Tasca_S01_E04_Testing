package level02;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise03AssertionTest {
    @Test
    void testArraysHaveSameContent()
    {
        int[] array1 = {100, 200, 300, 400, 500};
        int[] array2 = {100, 200, 300, 400, 500};
        assertThat(array1).isEqualTo(array2);
    }
    @Test
    void testArraysAreDifferentContent()
    {
        int[] array1 = {100, 200, 300, 400, 500};
        int[] array2 = {600, 700, 800, 900, 901};
        assertThat(array1).isNotEqualTo(array2);
    }
    @Test
    void testArraysAreSameInstance(){
        int[] array1 = {100, 200, 300, 400, 500};
        int[] array2 = array1;
        assertThat(array1).isSameAs(array2);
    }
}
