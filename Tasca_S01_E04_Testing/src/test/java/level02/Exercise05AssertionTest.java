package level02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise05AssertionTest {
    private Map<String, Integer> puntuacion;

    @BeforeEach
    void setUp() {
        puntuacion = new HashMap<>();
        puntuacion.put("Anna", 95);
        puntuacion.put("Carles", 82);
        puntuacion.put("Tom", 78);
    }
    @Test
    void testMapContainsKey(){
        assertThat(puntuacion).containsKey("Anna");
    }
    @Test
    void testMapContainsKeys(){
        assertThat(puntuacion).containsKeys("Anna", "Carles");
    }
    @Test
    void testMapDoesNotContainKey(){
        assertThat(puntuacion).doesNotContainKey("Albert");
    }
}
