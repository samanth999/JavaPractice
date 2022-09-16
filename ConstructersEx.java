class Mac {
    private String name;
    private int code;
     
    public Mac() {
        this("lila", 0);
         
        System.out.println("Constructor running!" +name);
    }
     
    public Mac(String name) {
        this(name, 0);
         
        System.out.println("Second constructor running "+name);
        
    }
     
    public Mac(String name, int code) {
         
        System.out.println("Third constructor running "+name);
        this.name = name;
        this.code = code;
    }
}
 
public class ConstructersEx {
    public static void main(String[] args) {
        Mac trail1 = new Mac();
 
        Mac trail2 = new Mac("lilly");
         
        Mac trail3 = new Mac("jennie", 25);
    }
 
}