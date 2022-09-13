import java.util.Scanner;

public class Gettinginput{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Text : ");
		
		String line = input.nextLine();
		
		int t = input.nextInt();
		System.out.println("your num is " + t);
		
		System.out.println("your text is " + line);
	}
}