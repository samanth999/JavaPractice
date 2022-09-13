import java.util.Scanner;

public class Dowhileloop{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do{
		System.out.println("Enter a number : ");
		 num = scan.nextInt();
		 }
		while(num != 5);
		System.out.println("Got 5!");
	}
	
}