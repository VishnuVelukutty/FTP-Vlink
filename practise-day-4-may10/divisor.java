

public class divisor {
    public static void main(String[] args) {
        MyCalculator n=  new MyCalculator();
       

        
        System.out.println( n.divisor_sum(6));
    }

    
}
interface AdvancedArithmetic {
    public int divisor_sum(int n);
}
public class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}





/*                            class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        if (n <= 1) { return n; }

        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }

        return res;
    }
}
          */              