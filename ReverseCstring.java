
class ReverseCstring{
	//In java this is really simple there is a built in method
	//But also to do it manually
	public static void main(String [] args) {
		//east way built in Java
		String ans = "abc d";
		ans = new StringBuffer(ans).reverse().toString();
		System.out.println(ans);
		//try2
		String str = "a b";
        char[] myChar = str.toCharArray();
        System.out.println(str);
        int p1 = 0;
        int p2 = myChar.length -1;

        while(p1<p2)
        {
            char tempStr = myChar[p1];
            myChar[p1]= myChar[p2];
            myChar[p2] = tempStr;

            p1++;
            p2--;
        }

        str = str.copyValueOf(myChar);

        System.out.println(str);
        System.out.println();
        System.out.println(CStyleStringReversed("abcd"));
	}
	//Using simple method
	public static String CStyleStringReversed(String s) {
    	char[] ans = s.toCharArray(); // << highlighted line
    	for (int i = 0; i < (s.length() - 1) / 2; ++i) {
        	char tempStr = ans[i];
        	ans[i] = ans[s.length() - 1 - i];
        	ans[s.length() - 1 - i] = tempStr;
    	}
    	return new String(ans) + "\0";
	}

}