import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		  int userInput=0;
	      int reverseInput =0;
	      System.out.println("Input your number and press enter: ");
	      //gathers user input
	      Scanner in = new Scanner(System.in);
	      //user input in num
	      userInput = in.nextInt();
	      //while loop to reverse the user inupt
	      while( userInput != 0 )
	      {
	          reverseInput = reverseInput * 10;
	          reverseInput = reverseInput + userInput%10;
	          userInput = userInput/10;
	      }

	      System.out.println("The input number reversed is: "+reverseInput);
	      // Print the user num reversed
   }
}
