import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReverseFileContent {

 public static void reverseFileContent(Reader reader, Writer writer) {
        try (
            BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String reversedStr = reverseAsciiInput(line);
                writer.write(reversedStr);
                //writer.write(System.lineSeparator());
            }
            System.out.println("File content reversed successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

     private static String reverseAsciiInput(String inputStr) {
	        return new StringBuilder(inputStr).reverse().toString();
    }

    public static void main(String args[])
    {
	String inputFilePath = "F:\\Spring\\hsbc\\final\\ReverseStrAndWriteToFile\\input.txt";
	String outputFilePath = "F:\\Spring\\hsbc\\final\\ReverseStrAndWriteToFile\\output.txt";

	try (Reader reader = Files.newBufferedReader(Paths.get(inputFilePath));
             Writer writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {

            reverseFileContent(reader, writer);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
 	
	
    }
}
