import java.util.*;
public class sumnavg {
    public static void main(String[] args) {
        //using arrays ?
        // functions
    int ip=0,num=0,sum=0,avg;
    System.out.println("Enter the number of input");
    Scanner obj = new Scanner (System.in);
    ip = obj.nextInt();

    for (int i=0;i<ip;i++ ){
       
        System.out.println(" Enter an a number ");
        num = obj.nextInt();
        sum+=num;


    }
    System.out.println("Sum of the number"+sum);
    avg=sum/ip;
    System.out.println("average of te number"+avg);
    }
    
}
