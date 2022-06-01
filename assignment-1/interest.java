// 4. Calculate SI=P*R*T/100

import java.util.Scanner;

public class interest {
	public static void main (String args []) {
	double si,p,r,n;
	
	System.out.println("Enter the principal amt");
	Scanner obj = new Scanner(System.in);
	p = obj.nextDouble();
	
	System.out.println("Enter the ROI");
	
	r = obj.nextDouble();
	
	System.out.println("Enter the years");
	n = obj.nextDouble();
	
	si=(p*r*n)/100;
	
	System.out.println("Simple interest is  : " +si);

}
}
