class Thin{
	public String name;
	public static String desc;
}

public class StaticEx{
	public static void main (String[] args){
		
		Thin.desc ="I am Sam";
		
		System.out.println(Thin.desc);
		
		Thin item1=new Thin();
		Thin item2=new Thin();
		
		item1.name="RAJ";
		item2.name = "SUN";
		
		System.out.println(item1.name);
		System.out.println(item2.name);
		
	}
}