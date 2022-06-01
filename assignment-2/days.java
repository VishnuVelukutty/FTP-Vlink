import java.util.Scanner;
public class days {
    public static void main(String args []){
        int n;

        System.out.println("Enter a month");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
        if (n <= 12){
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12 ){
            System.out.println("31 Days");
        }
        else if (n==4 || n==6 || n==9 || n==11) {
            System.out.println("30 Days");
        }
        else {
                System.out.println("28 or 29");
        }
    }
        else {
            System.out.println("Enter a valid input");
        }

    }

    
}
