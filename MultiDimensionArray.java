public class MultiDimensionArray{
	public static void main(String[] args){
		int[][] tab ={
			{1,2,3},
				{4,5,6}
		};
		
		System.out.println(tab[1][1]);
		
		String[][] texs = new String[2][3];
		
		System.out.println(texs[0][1]);
		
		texs[0][1]="Hello Sam";
		System.out.println(texs[0][1]);

	}
}