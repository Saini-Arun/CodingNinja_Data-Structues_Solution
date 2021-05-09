public class Solution {
    
    	public static void printPermutations(String str,String output) {
		
		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			printPermutations(  str.substring(0 , i) + str.substring(i+1) , output + str.charAt(i));
		}
        }

	public static void FindPermutations(String input){
		// Write your code here
        printPermutations(input,"");

	}
}
