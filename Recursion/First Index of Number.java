
public class Solution {
    	public static int FirstIndex(int input[], int x,int index) {
		if (input[index]==x) {
			return index;
		}
            if (index==input.length-1){
                return -1;
            }
		 int answer=FirstIndex(input,x,index+1);
		 return answer;
		
	}

	public static int firstIndex(int input[], int x) {
		
		return FirstIndex(input,x,0);
	}
	
}