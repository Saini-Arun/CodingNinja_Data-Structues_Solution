
public class Solution {
    
    static StringBuilder b = new StringBuilder();

	public static String replaceCharacter(String input, char c1, char c2) {
		
        		if(input.length()==0) {
			return "";
			}
		if (input.charAt(0)==c1) {
			b.append(c2);
			replaceCharacter(input.substring(1,input.length()), c1, c2);
		}
	 	else {
			b.append(input.charAt(0));
			replaceCharacter(input.substring(1,input.length()),c1,c2);
		}
		String s= b.toString();
 return s;

	}
}
