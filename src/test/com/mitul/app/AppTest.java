package test.com.mitul.app;

import main.com.mitul.app.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Unit test for this app
 */
public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try{
            new App();
        }catch (Exception e){
            fail("Construction failed");
        }
    }

    @Test
    public void testAppMain(){
        App.main(null);
        try{
        assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (Exception e){
            fail("\"message\" is not \"Hello World!\"");
        }
    }

    @After
    public void cleanUpStream(){
        System.setOut(null);
    }
}
