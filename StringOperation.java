public class StringOperation {
	private String str1;
	private String str2;
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	/*
	 * Comparing Two Strings
	 * @param str1 First String to Compared
	 * @param str2 Second String to Compared
	 * @return 1 if Both String are equal else 0
	 */
	
	public Integer StringCmp(String str1,String str2)
	{
		int l1=str1.length();
		int l2=str2.length();
		int lmin=Math.min(l1,l2);
		for(int i=0;i<lmin;i++)
		{
			int str1_ch=(int)str1.charAt(i);
			int str2_ch=(int)str2.charAt(i);
			if(str1_ch!=str2_ch){
				return 0;
			}
		}
		if(l1!=l2){
			return 0;
		}
		else{
		return 1;	
		}
	
	}
	
	/*
	 * Reverse The String
	 * @param str String Input
	 * @return Reverse of the String str
	 */
	
	public String StringRev(String str)
	{
		byte[] ByteArray=str.getBytes();
		byte[] result=new byte[ByteArray.length];
		for(int i=0;i<ByteArray.length;i++)
		{
			result[i]=ByteArray[ByteArray.length-i-1];
		}
		return new String(result);
	}
	
	/*
	 * Replace Character with UpperCase to LowerCase and vice-versa
	 * @param str String Input
	 * @return Replaced Characters String
	 */
	
	public StringBuffer StringReplace(String str)
	{
		StringBuffer newstr=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newstr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		return newstr;
		
		
	}
	
	/*
	 * Finding Largest Word in a String
	 * @param str String Input
	 * @return Longest Word from the String
	 */
	
	public String StringLargest(String str)
	{
		
		String [] word=str.split(" ");
		String longestWord=" ";
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()>=longestWord.length())
			{
				longestWord=word[i];
			}
		}
		return longestWord;
		
	}

	public static void main(String...arg)
	{
		StringOperation newString=new StringOperation();
		newString.setStr1("My name is Aalekh");
		newString.setStr2("my Name Is aalekh");
		System.out.println("\nString 1 : "+newString.getStr1());
		System.out.println("\nString 2 : "+newString.getStr2());
		System.out.println("\nString Comparison Operation : ");
		System.out.println(newString.StringCmp(newString.getStr1(), newString.getStr2()));
		System.out.println("\nString Replacing Operation on string 1 : ");
		System.out.println(newString.StringReplace(newString.getStr1()));
		System.out.println("\nString Reversing Operation on string 2 : ");
		System.out.println(newString.StringRev(newString.getStr2()));
		System.out.println("\nString Largest Repeating Alphabet Operation on string 1 : ");
		System.out.println(newString.StringLargest(newString.getStr1()));
	}
    
}