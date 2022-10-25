package hu.crs.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NoteCircleTest {
    @ParameterizedTest
    @CsvSource({"A,A#,1", "A,B,2", "B, Gb, 5", "F,C,5", "G,A#,3"})
    public void testSemitoneDistances(String firstPitch, String secondPitch, int expected) {
        var jamBuddy = new NoteCircle();

        Assertions.assertEquals(expected, jamBuddy.interval(Pitch.of(firstPitch), Pitch.of(secondPitch)));
    }
}
