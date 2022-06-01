public class power{
    public static void main(String args[]) {

        int base=5, pow=3,result=1;
        for(double y=1;y<=pow;y++){
            result*=base;
        }
        System.out.println("Power: "+result);
        
    }
}