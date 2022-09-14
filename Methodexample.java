class Addition {
     
    int a;
    int b;
     
     void add(){
		System.out.println(a+b);
	 }
 
}
 
 
public class Methodexample {
 
    public static void main(String[] args) {
         
         
        Addition add1 = new Addition();  
        add1.a=12;
        add1.b = 20;
         
        add1.add();
         
    }
 
}