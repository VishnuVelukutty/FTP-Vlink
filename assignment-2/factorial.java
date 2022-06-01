public class factorial{
    public static void main(String args[]) {

        int x=5,fact=1;
        for(int y=1;y<=x;y++){
            fact*=y;
        }
        System.out.println("Factorial: "+fact);
        
    }
}