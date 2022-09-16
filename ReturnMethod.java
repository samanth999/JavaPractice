class Age{
	String name;
	int ages;
	
	void talk(){
		System.out.println("My name is : "+name);
			}
	int calculatetoretire(){
		int yearsLeft=65-ages;
		return yearsLeft;
	}
}

public class ReturnMethod{
	
	public static void  main(String[] args){
		
		Age age1=new Age();
		age1.name="Sam";
		age1.ages=25;
		
		age1.talk();
		int years = age1.calculatetoretire();
		
		System.out.println("The remaining years are "+years);
		
		
	}
	
}