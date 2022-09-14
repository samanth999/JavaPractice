public class Arraex{
	public static void main(String[] args){
		
		int val =7;
		
		int[] vals;
		vals = new int[3];
		
		vals[0]=1;
		vals[1]=2;
		vals[2]=3;
		System.out.println(vals[0]);
		System.out.println(vals[1]);
		System.out.println(vals[2]);
		
		for(int i=0;i<vals.length;i++){
			System.out.println(vals[i]);
		}
		
		int[] nums={8,9,0};
		for(int x=0;x<nums.length;x++){
			System.out.println(nums[x]);
		}
		
	}
}