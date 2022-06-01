import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

            
            int f1=0,f2=1,f,c;

            System.out.println("Enter a number");
            Scanner obj = new Scanner(System.in);
            c = obj.nextInt();


            
            for(int i=1;i<=c;++i){
            
            f=f1+f2;
            System.out.println(f1);
            f1=f2;
            f2=f;
            
            }
            
            
            }
    

    }

