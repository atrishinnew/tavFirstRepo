import org.junit.Test;

import static org.junit.Assert.*;

public class SpacesTest {
    @Test
    public void test () {
        Spaces spTest = new Spaces("a b c");
        assertEquals(2, spTest.doCountSpaces(spTest.text));
    }

}