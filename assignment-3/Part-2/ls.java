import java.util.Scanner;
public class ls {
    public static void main(String[] args) {
           
            int n,in,big=0,small=0;
            System.out.println("Enter a number");
            Scanner obj = new Scanner(System.in);
            n = obj.nextInt();
        
        
        
            for (int x=1;x<=n;x++){
                System.out.println("Enter a number ");
                in = obj.nextInt();
                if (in>big){
                    big=in;
                }
                else if (in<small){
                    small=in;
                }
        
        
            }
        
            System.out.println("Big number "+big+ " Small number" +small);
        
        
        }
        

    }
