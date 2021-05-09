import java.util.Arrays;
public class Solution{
    
public static void intersection(int[] arr1, int[] arr2){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int G= arr1.length;
		int S= arr2.length;
		int x=0;
		int y=0;
		while(x<G && y<S) {
			if(arr1[x]==arr2[y]) {
				System.out.print(arr1[x]+" ");
				x +=1;
				y +=1;
			}else if(arr1[x]<arr2[y]) {
				x +=1;
			}else{
				y +=1;
			}			
		}		
	}
}