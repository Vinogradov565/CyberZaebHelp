package test;

import com.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testTransformStringWithAllVowels() throws Exception {
        String input = "AEIOUaeiouаеёияэюоыyАЕЁИЯЭЮОЫУ";
        String expected = "251915211651733132316292112516631251121";

        String result = Main.transformString(input);

        assertEquals(expected, result);
    }

    @Test
    public void testTransformStringWithConsonants() throws Exception {
        String input = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxzБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        String expected = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxzБВГДЖЗКЛМНПРСТФХЦЧШЩ";

        String result = Main.transformString(input);

        assertEquals(expected, result);
    }

    @Test
    public void testTransformStringWithOneCharacter() throws Exception {
        String input = "a";
        String expected = "a";

        String result = Main.transformString(input);

        assertEquals(expected, result);
    }

    @Test
    public void testTransformStringWithNullInput() throws Exception {
        String expected = null;

        String result = Main.transformString(null);

        assertEquals(expected, result);
    }
}