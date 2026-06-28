package level01.DniCalculatorTest;

import level01.DniCalculator.DniCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DniCalculatorTest {
    //variable to use for testing.
    private DniCalculator testId;

    @BeforeEach
    void setup(){
        testId = new DniCalculator();
    }
    @ParameterizedTest
    @MethodSource("idAndLetter")
    void testIdAndLetter(String id, char letterTry){
        assertEquals(testId.calculateLetter(id), letterTry);
    }

    private static Stream<Arguments> idAndLetter() {
        return Stream.of(
                Arguments.of("00020001", 'Z'),
                Arguments.of("00030001", 'D'),
                Arguments.of("00060001", 'V'),
                Arguments.of("00080001", 'F'),
                Arguments.of("00410321", 'R'),
                Arguments.of("54200123", 'W'),
                Arguments.of("54289101", 'Q'),
                Arguments.of("54289741", 'N'),
                Arguments.of("54289852", 'P'),
                Arguments.of("54289654", 'V'));
    }
@Test
void idLengthTest(){
        assertThrows(IllegalAccessException.class, () -> testId.calculateLetter("98765"));
    }
@Test
void idNegativeTest(){
    assertThrows(IllegalAccessException.class, () -> testId.calculateLetter("-98765"));
    }
@Test
void idExceededLimitLength(){
    assertThrows(IllegalAccessException.class, () -> testId.calculateLetter("789456321456"));
    }
}
