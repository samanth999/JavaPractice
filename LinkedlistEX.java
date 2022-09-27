import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
 
public class LinkedlistEX {
 
 
    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<Integer>();
        
        List<Integer> linkedList = new LinkedList<Integer>();
         
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
     
    private static void doTimings(String type, List<Integer> list) {
         
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
         
        long start = System.currentTimeMillis();
		 for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
         
        long end = System.currentTimeMillis();
         
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
       
    }
     
 
 
}