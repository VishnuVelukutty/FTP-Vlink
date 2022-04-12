    // 6. Write a program that reads a positive integer, n, 
    // from the user and then displays the sum of all of the integers from 1 to n. 
    // The sum of the first n positive integers can be computed using the formula: sum = (n)(n + 1)/2

import java.util.Scanner;
public class positive {
    public static void main(String args []){
        int n,sum;

        System.out.println("Enter a positive integer");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        sum=((n)*(n+1))/2;
        System.out.println("the sum of n integers: "+sum);



    }
    
}
