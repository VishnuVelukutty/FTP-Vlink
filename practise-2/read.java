import java.util.*;
public class read {
    public static void main(String[] args) {
        int ip,count=0;
        System.out.println("Enter a number");
        Scanner obj = new Scanner (System.in);
        ip = obj.nextInt();
        
        if(ip < 0){
            System.out.println("Invalid output");
        }
        else if (ip == 0){
            System.out.println(1);
        }
        else{
           while(ip > 0){ 
            count++;
            ip=ip/10;
          
// System.out.println("Splitting "+ip);
        }
        System.out.println("Number of digits is " +count);
    }
}
}
