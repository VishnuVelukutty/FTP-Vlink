package qa;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        int ip,op =0,r;
        Scanner i = new Scanner(System.in);
        System.out.println("Input a 4 digit number: ");
        ip = i.nextInt();
    
        for(;ip!=0;ip/=10){
            r = ip %10;
            op=op*10+r;
        }

        System.out.println(op);

    }
   
}