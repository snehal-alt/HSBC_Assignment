
import static org.junit.Assert.*;
import  org.junit.Test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class ReverseFileContentTest {


 	@Test
    public void testReverseFileContent() throws IOException {
        String input = "ABC";

        StringReader stringReader = new StringReader(input);

        StringWriter stringWriter = new StringWriter();

        ReverseFileContent.reverseFileContent(stringReader, stringWriter);

        String expectedOutput = "CBA";
        assertEquals(expectedOutput, stringWriter.toString().trim());
    }


}
