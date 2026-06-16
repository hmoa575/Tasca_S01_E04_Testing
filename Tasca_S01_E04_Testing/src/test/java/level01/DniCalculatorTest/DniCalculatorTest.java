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
                Arguments.of("00020001", 'A'),
                Arguments.of("00030001", 'B'),
                Arguments.of("00060001", 'C'),
                Arguments.of("00080001", 'D'),
                Arguments.of("00410321", 'E'),
                Arguments.of("54200123", 'F'),
                Arguments.of("54289101", 'G'),
                Arguments.of("54289741", 'H'),
                Arguments.of("54289852", 'K'),
                Arguments.of("54289654", 'L'));
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
