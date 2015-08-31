
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
	        	int test2 = 150;
	            int number = Integer.parseInt(reader.readLine());
	            System.out.println("You entered: " + number);
	            System.out.println("Test getal is:  " + test);
	            System.out.println("You entered the number: " + number);

	        }
	        catch(NumberFormatException error)
	        {
	            System.err.println("Invalid Format!");
	        }
	    }
}
