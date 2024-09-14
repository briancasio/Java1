import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.*;
import com.github.stefanbirkner.systemlambda.SystemLambda;
import static org.junit.Assert.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

public class StringsAndCharactersTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        withTextFromSystemIn("Hello\nWorld\nJava\n").execute(() -> StringsAndCharacters.main(new String[]{}));

        String expectedOutput = "String 1 name?\n" +
                                "String 2 name?\n" +
                                "String 3 name?\n" +
                                "L\n" +
                                "R\n" +
                                "V\n" +
                                "L.R.V\n";

        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}