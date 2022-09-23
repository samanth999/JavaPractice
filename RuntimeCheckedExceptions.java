public class RuntimeCheckedExceptions {
 
    public static void main(String[] args) {
         
        String text = null;
         
        System.out.println(text.length());
         
        int value = 7/0;
 
        String[] texts = { "one", "two", "three" };
 
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}