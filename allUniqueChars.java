import java.io.*;
class allUniqueChars {
	public static void main(String [] args) {
		System.out.println(hasUniqueCharacters("works"));

	}
	public static boolean hasUniqueCharacters(String s){
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < s.length(); i++){
			int val = s.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
}