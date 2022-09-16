class Bike{  
 final int spdlmt=90;
 void run(){  
  spdlmt=400;  
 }  
}
public class FinalEx{
	public static void main(String args[]){  
		Bike i=new  Bike();  
		i.run();  
		}  
}

 /* Won't work: throws complile time error
 FinalEx.java:4: error: cannot assign a value to final variable spdlmtspdlmt=400^;
 */
 
