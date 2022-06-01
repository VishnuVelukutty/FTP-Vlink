import java.util.Scanner;
public class count{

public static void main(String[] args) {
    
    int n,in,pos=0,neg=0,zero=0;
    System.out.println("Enter a number");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();



    for (int x=1;x<=n;x++){
        System.out.println("Enter a number ");
        in = obj.nextInt();
        if (in>0){
            pos++;
        }
        else if (in<0){
            neg++;
        }
        else{
            zero++;
        }


    }

    System.out.println("positive number "+pos+ " negative number" +neg+ " Zeroes" +zero );


}



}
