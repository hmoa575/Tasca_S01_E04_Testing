package level02;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise06AssertionTest {
    @Test
    void testGetElementAtThrowsArrayIndexOutOfBoundsException(){

        Exercise06Assert accesor = new Exercise06Assert();
        int[] array = {100, 200, 300};
        assertThatThrownBy(()-> accesor.getElementAt(array, 9)).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
