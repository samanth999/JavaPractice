import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
 
 class Test {
    public void run() throws IOException, ParseException {
         
         
         
        throw new ParseException("Error in command list.", 2);
         
         
    }
     
    public void input() throws IOException, FileNotFoundException {
         
    }
 }
public class MutlicatchEx {
 
    public static void main(String[] args)  {
        Test test = new Test();
         
        // Multiple catch blocks
        try {
            test.run();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
         
         
     
    }
 
}