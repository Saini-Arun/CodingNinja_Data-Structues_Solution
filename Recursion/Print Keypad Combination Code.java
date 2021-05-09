public class solution {
    
   
	public static String getstring(int n) {
		if(n==2) {
			return "abc";
		}else if (n==3) {
			return "def";
		}else if(n==4) {
			return "ghi";
		}else if(n==5) {
			return "jkl";
		}else if(n==6) {
			return "mno";
		}else if(n==7) {
			return "pqrs";
		}else if(n==8) {
			return "tuv";
		}else if(n==9) {
			return "wxyz";
		}else {
			return"";
		}
	}
	
	public static String[] keypad(int n) {
		
		if(n<=1) {
			String ans[]= {""};
			return ans;
		}
		int x= n%10;			
		n=(int)n/10;
	   
	    String smallans1[]=keypad(n);
	    String smallans2=getstring(x);
	    
		String ans[]= new  String[smallans1.length*smallans2.length()]; 
		int k=0;
		for(int i=0;i<smallans1.length;i++) {
			for(int j=0;j<smallans2.length();j++) {
				ans[k]=smallans1[i]+smallans2.substring(j, j+1);
				k++;
				}
		}
		 return ans;
	}
	
	public static void print(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void printKeypad(int input){
		// Write your code here
        String arr[]=keypad(input);
        print(arr);
		
	}

}
