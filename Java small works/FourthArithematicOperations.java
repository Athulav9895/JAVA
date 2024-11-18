package Ath.u.l.Self;

public class FourthArithematicOperations {
static void Arith(int a , int b) {
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	double quotient = (b!=0)? a / b :0;
	int remainder=(b!=0)?a % b :0;
	
	System.out.println("Sum: " +sum);
	System.out.println("Sub: " +sub);
	System.out.println("mul: " +mul);
	if (b !=0) {
		System.out.println("quotient: " +quotient);
		System.out.println("remainder: " +remainder);

	} else {
		System.out.println("Divition and modulus by zero are undefined.");
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith(10,6);
		
		Arith(10,0);
	}

}
