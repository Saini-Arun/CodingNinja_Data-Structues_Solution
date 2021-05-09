public class Solution {
    
    static StringBuilder b = new StringBuilder();

		public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==0) {
			return s;
			}
		if(s.length()==1) {
			b.append(s.charAt(0));
			String str= b.toString();
			 return str;
			}
		if (s.charAt(0)==s.charAt(1)) {
			removeConsecutiveDuplicates(s.substring(1,s.length()));
		}
	 	else {
			b.append(s.charAt(0));
			removeConsecutiveDuplicates(s.substring(1,s.length()));
		}
		String str= b.toString();
 return str;
	}

}