package st.ri.ng;
import java.util.Scanner;
public class Lsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		Scanner sc = new Scanner(System.in);
        String output = "";
        String main = "";

        System.out.println("Enter your full name:");
        String name = sc.nextLine();
        
    
        String[] newword = name.split(" ");
        

        for (String n : newword) {
            char ch = n.charAt(0);
            output += ch;
        }
        
        
        for (int i = 0; i < output.length() - 1; i++) {
            char ch = output.charAt(i);
            main += ch + ".";
        }

        
        String lastName = newword.length >= 3 ? newword[2] : newword[newword.length - 1];
        
        
        System.out.println(main.toUpperCase() + lastName);
        
        sc.close(); 
    }
}

