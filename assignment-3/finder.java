import java.util.Scanner;
public class finder {
	public static void main(String args[]) {
		int [] myArray = {17,18,20,19,21,23};
		System.out.println("Enter a number to find : ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		
		for (int i = 0; i<myArray.length;i++) {
			if (x == myArray[i]) {
				System.out.println("It is present ");
			}
			else {
				System.out.println("It is not present");
			}
		}
	}

}
// only print if number is present or not