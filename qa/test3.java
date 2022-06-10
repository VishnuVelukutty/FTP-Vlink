package qa;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
    

            Scanner s = new Scanner(System.in);
    
            System.out.println("enter number of elements");
    
            int n=s.nextInt();
    
            int arr[]=new int[n];
    
    
            for(int i=0;i<n;i++){
                System.out.println("enter elements");

                arr[i]=s.nextInt();
    
            }
   
            
            
            int sum=0,avg=0,mm=0,t=0 , max =arr[0],min = arr [0];
            for(int i: arr){ 
                if(i > max){
                    max = i;
                }
                if(i<min){
                    min = i;
                }


                mm=max+min;
                sum = (sum+i);
                t=sum-mm;

                avg = t / n;
    
            }
            System.out.println("max is : "+max);
            System.out.println("min is : "+min);
            System.out.println("Sum is " + sum);
            System.out.println("total is " + t);
            System.out.println("MM is " + mm);


            System.out.println("Average is " + avg);

    
    
        }
    
}
