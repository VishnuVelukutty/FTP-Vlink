import java.util.*;
public class multiple {
 
 public static void main(String[] args) {
    int n1,n2;

    Scanner obj =new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    n1 = obj.nextInt();
    n2=obj.nextInt();

    if(n2%n1 == 0){
        System.out.println("It is a multiple");
    }
    else{
        System.out.println("It is not a multiple");
    }
} 
     
}
