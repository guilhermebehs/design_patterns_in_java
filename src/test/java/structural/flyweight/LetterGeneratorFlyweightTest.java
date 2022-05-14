package structural.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LetterGeneratorFlyweight")
public class LetterGeneratorFlyweightTest {

    @DisplayName("should be the same object for 'a' letter")
    @Test
    public void shouldBeTheSameObjectForALetter(){
        var a = LetterGeneratorFlyweight.generateLetter("a");
        var anotherA = LetterGeneratorFlyweight.generateLetter("a");

        assertEquals(a, anotherA);
    }
}
