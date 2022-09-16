class Fg {
     
    private int id;
    private String name;
     
    public Fg(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public String toString() {
         
        return String.format("%-4d: %s", id, name);
         
        
    }
}
 
public class ToStringEx1 {
 
    public static void main(String[] args) {
        Fg fg1 = new Fg(7, "Teddy");
        Fg fg2 = new Fg(5, "Bear");
         
        System.out.println(fg1);
        System.out.println(fg2);
    }
}