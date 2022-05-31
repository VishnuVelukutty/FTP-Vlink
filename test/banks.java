public class banks {

   static double roi(double p , double r,double y){
       double si = ((p*r*y)/100);
       return si;
       //System.out.println("Simple Interest is" + si);
    }

    public static void main(String[] args) {
        double p=100,r=2.5,y=3;
        System.out.println(roi(p,r,y));


    }

}
