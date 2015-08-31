
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class project1 {
	
	   public static void main(String[] args) throws IOException 
	   {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Integer:");
	        try
	        {
	        	int test = 0;
	        	int test2 = 200;
	            int number = Integer.parseInt(reader.readLine());
	            System.out.println("You entered: " + number);
	            System.out.println("Test number is:  " + test);
	        }
	        catch(NumberFormatException error)
	        {
	            System.err.println("Invalid Format!");
	        }
	    }
}
