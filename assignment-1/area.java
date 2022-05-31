// 2. Write a program to find area square , rectangle, triangle



import java.util.Scanner;
public class area {
	public static void main(String args[]) {
		double l,b,h;
	

		System.out.println("Enter the length");
		Scanner obj = new Scanner(System.in);
		l = obj.nextDouble();
		
		
		System.out.println("Enter the height");
		//Scanner  = new Scanner(System.in);
		h = obj.nextDouble();
		
		System.out.println("Enter the breadth");
		//Scanner bre = new Scanner(System.in);
		b=obj.nextDouble();
		double area = l*l;
		double area2 = l*h;
		double area3 = 0.5 *l *b; 
		
		System.out.println("Area is of square:" +area);
		System.out.println("Area is of rectangle:" +area2);
		System.out.println("Area is of triangle:" +area3);
//		
		
	}

}
