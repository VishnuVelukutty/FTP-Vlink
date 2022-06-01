import java.util.Scanner;
public class shapes {
    public static void main(String args []){
        int n;

        System.out.println("Enter number sides");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
        if (n >=3 && n <= 10){
        if(n==3){
            System.out.println("Your shape is Triangle");
        }
        else if (n==4) {
            System.out.println("Your shape is Square");
        }
        else if (n==5){
            System.out.println("Your shape is Pentagon ");
        }
        else if (n==6){
            System.out.println("Your shape is Hexagon ");
        }
        else if (n==7){
            System.out.println("Your shape is Heptagon");
        }
        else if (n==8){
            System.out.println("Your shape is Octagon ");
        }
        else if (n==9){
            System.out.println("Your shape is Nonagon");
        }
        else if (n==10){
            System.out.println("Your shape is Decagon ");
        }
    }
        else {
            System.out.println("Enter a valid input");
        }

    }

    
}
