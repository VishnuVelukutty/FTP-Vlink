import java.util.Scanner;
public class weird {
    public static void main(String args []){
        int n;

        System.out.println("Enter a number");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        else if (n%2==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }
        else if (n%2==0 && n>20){
            System.out.println("Not Weird");
        }
        else{
                System.out.println("enter valid input");
        }

    }
    
}
