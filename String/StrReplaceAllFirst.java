package st.ri.ng;

public class StrReplaceAllFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Replace
		String sc="Helloo";
		System.out.println(sc.replace('l', 'p'));
		//ReplaceALL
		String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
		String regex = "(?i)cat";
		System.out.println(myStr.replaceAll(regex, "dog"));
		//Replace First
		String mStr = "This is W3Schools";
		String regx = "is";
		System.out.println(mStr.replaceFirst(regx, "at"));
		
	}

}
