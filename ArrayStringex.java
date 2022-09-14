public class ArrayStringex{
	public static void main(String[] args){
		String[] words = new String[3];
		
		words[0]="sam";
		words[1]="Raj";
		words[2]="Gopi";
		
		System.out.println(words[1]);
		
		String[] vegies = {"carrot","Beetroot","Leafs"};
		
		for(String veg: vegies){
			System.out.println(veg);
		}
	}
}