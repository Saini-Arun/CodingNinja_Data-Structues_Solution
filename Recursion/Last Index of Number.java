
public class Solution {
    
	public static int LastIndex(int input[], int x,int index,int answer) {
		if (input[index]==x) {
			answer=index;
		}
		if(index==input.length-1) {
			return answer;
		}
		
		answer=LastIndex(input,x,index+1,answer);
		return answer;
		
	}

	public static int lastIndex(int input[], int x) {
		
        return LastIndex(input,x,0,-1);
	}
	
}