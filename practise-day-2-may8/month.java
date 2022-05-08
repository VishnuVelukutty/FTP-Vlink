import java.util.*;

public class month {
    public static void main(String[] args) {
        int monthnum;
        System.out.println("Enter month number");
        Scanner obj = new Scanner(System.in);
        monthnum = obj.nextInt();

        if (monthnum >= 1 && monthnum <= 12) {
            if (monthnum <= 7) {
                if (monthnum % 2 != 0) {
                    System.out.println("31 Days");
                } 
                else {
                    System.out.println("30 Days");
                }
            }
                if (monthnum > 7) {
                   // System.out.println("This is not working");
                    if (monthnum % 2 == 0) {
                        System.out.println("31 Days");
                    }
                    else {
                        System.out.println("30 Days");
                    }
                } 
                

        
            }
        else {

            System.out.println("Invalid Input");
        }

    }

}
