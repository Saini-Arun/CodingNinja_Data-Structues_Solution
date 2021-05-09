
public class Solution {
    
    	public static int[] Allindexes(int input[], int x,int index) {
		if (index==input.length) {
			int sa[]= new int[0];
            return sa;
		}		
		 int sa[]=Allindexes(input,x,index+1);
		 if (input[index]==x) {
			int answer[]=new int[sa.length+1];
			answer[0]=index;
			for(int i=0;i<sa.length;i++) {
				answer[i+1]=sa[i];
			}
			return answer;
		 }
		 return sa;
	}

	public static int[] allIndexes(int input[], int x) {
		
        return Allindexes(input,x,0);
		
	}
	
}