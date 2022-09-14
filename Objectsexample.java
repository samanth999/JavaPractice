class Person {
     
    String name;
    int age;
     
     
 
}
 
 
public class Objectsexample {
 
    public static void main(String[] args) {
         
         
        Person per1 = new Person();  
        per1.name = "Sam";
        per1.age = 37;
         
        // Create a second Person object
        Person per2 = new Person();
        per2.name = "star";
        per2.age = 20;
         
        System.out.println(per1.name);
         
    }
 
}