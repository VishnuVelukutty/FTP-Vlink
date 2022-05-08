import java.util.Scanner;
public class order {
    public static void main(String[] args) {
        int num1,num2,num3 ;
        //int num ;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number");
        num1 =obj.nextInt();
        num2 =obj.nextInt();
        num3 =obj.nextInt();
        




        // // n1=4,n2=3,n3=2

        if(num1 > num2 && num2 > num3){
            System.out.println("Decreasing order");

        }
        // n1 = 1 , n2 = 2 , n3 =3
        else if (num3 > num2 && num2 > num1 ){
            System.out.println("Increasing order");
        }
        else{
            System.out.println("Random order");
        }

    }
}
