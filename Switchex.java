import java.util.Scanner;

public class Switchex{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter Command : ");
		String tex= input.nextLine();
		
		switch(tex){
			case "start":
				System.out.println("Start Case");
				break;
			case "stop":
				System.out.println("Stop Case");
				break;
			default:
				System.out.println("Default Case");
		}
	}
}