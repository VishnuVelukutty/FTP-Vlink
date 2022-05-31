// 3. Convert input temperature from Celsius to Fahrenheit(F=T*1.8+32)

import java.util.Scanner;

public class temperature {
	public static void main(String args[]) {
		double f,t;
		
		System.out.println("Enter the Celcius");
		Scanner obj = new Scanner(System.in);
		t = obj.nextDouble();
		
		f=t*1.8+32;
		
		System.out.println("Temp in celcius is : " +f);
		
		
	}

}
