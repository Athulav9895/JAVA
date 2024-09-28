package oops.com.in;

public class Encap {

	
	public int a;
	public int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static void main(String[]args){
		Encap obj=new Encap();
		obj.setA(40);
		obj.setB(30); 
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}

}
