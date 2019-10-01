import java.util.Scanner;
public class calci{
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int c,int d) {
		return c-d;
	}
	public int multiply(int e,int f) {
		return e*f;
	}
	public float divide(float g,float h) {
		return g/h;
	}
	
	public static void main(String[]args){
		int x,y;
		Scanner sc=new Scanner(System.in);
		calci m=new calci();
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println(m.add(x, y));
		System.out.println(m.subtract(x, y));
		System.out.println(m.multiply(x,y));
		System.out.println(m.divide(x,y));
		


	}
}
