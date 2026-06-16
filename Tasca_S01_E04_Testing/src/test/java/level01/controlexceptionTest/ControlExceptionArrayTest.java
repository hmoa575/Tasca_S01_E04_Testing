package level01.controlexceptionTest;

import level01.controlexception.ControlExceptionArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ControlExceptionArrayTest {
    private ControlExceptionArray controlExceptionArray;

    @BeforeEach
    void setup(){
        controlExceptionArray = new ControlExceptionArray();
    }

    @Test
    void shouldThrowArrayIndexOutOfBoundsException(){
        ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->controlExceptionArray.triggerArrayIndexOutOfBoundsException(10));
    }
}
