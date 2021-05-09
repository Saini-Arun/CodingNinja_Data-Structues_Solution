
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        	if(input>=0 && input<=9) {
			return input;
		}
		int ans=sumOfDigits(input/10);
        
		return (ans+(input%10));

	}
}
