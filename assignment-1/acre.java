// 5. Create a program that reads the length and width of a farmer’s field from the
// user in feet. Display the area of the field in acres. Hint: There are 43,560 square
// feet in an acre. 

// not converted to feet 

import java.util.Scanner;

public class acre{
    public static void main(String args[]){
        int l,w,acres;

        System.out.println("Enter length and width");
        Scanner obj= new Scanner(System.in);
        l = obj.nextInt();
        w = obj.nextInt();

        acres = (l * w)/43560;

        System.out.println("Total acres is "+acres);

    }
}
