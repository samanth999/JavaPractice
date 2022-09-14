import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
  
  public static int[] reverse(int[] realArr) {
    int size = 0;
    int reverseArr[] = null;
    
    size = realArr.length;
    
    reverseArr = new int[size];
    
    int i = 0;
    int j = size-1;
    
    while(i < size) {
      reverseArr[i] = realArr[j];
      
      i++;
      j--;
    }
        
    return reverseArr;
  }

  public static void main(String[] args) {
    Scanner scan = null;
    int size = 0;
    int numbers[] = null;
    int rev[] = null;
    
    scan = new Scanner(System.in);
    
    System.out.print("Enter array size: ");
    size = scan.nextInt();
    
    numbers = new int[size];
    
    System.out.println("Enter array elements: ");
    for(int i=0; i<size; i++) {
      numbers[i] = scan.nextInt();
    }
    
    rev = reverse(numbers);
    
    System.out.println("Reverse = " + Arrays.toString(rev));
    
    scan.close();
  }
}