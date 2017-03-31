
public class Application {

	public static void main(String[] args) {
		  int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      //gathers user input
	      Scanner in = new Scanner(System.in);
	      //user input in num
	      num = in.nextInt();
	      //while loop to reverse the user inupt
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("The input number reversed is: "+reversenum);
	      // Print the user num reversed
   }
}
