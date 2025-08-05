package Day13;

public class lab10 {
	public static boolean isPositiveString(String input){
		input = input.toUpperCase();
	
	
	for (int i =1; i<input.length(); i++) {
		if (input.charAt(i) <= input.charAt(i-1)) {
			return false;
		}
	}
	return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "supraja";
		String word2 = "banana";
		
		System.out.println(word1 + " " + isPositiveString(word1));
		System.out.println(word2 + " " + isPositiveString(word2));
	}

}


