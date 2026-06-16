package level02;
import level02.Exercise02Assertion;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise02AssertionTest {

    @Test
    void sameReferenceTest()
    {
        Exercise02Assertion exercise = new Exercise02Assertion(30);
        Exercise02Assertion sameReference = exercise;

        assertThat(exercise).isSameAs(sameReference);
    }
    @Test
    void notSameReferenceTest()
    {
        Exercise02Assertion exercise1 = new Exercise02Assertion(30);
        Exercise02Assertion exercise2 = new Exercise02Assertion(30);

        assertThat(exercise1).isNotSameAs(exercise2);
    }
}
