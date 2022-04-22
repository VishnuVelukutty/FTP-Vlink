public class amstrong {
    public static void main(String[] args) {
        int n,  r,  sum = 0;

        for(int i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print("Amstrong numbers are "+i+" ");
            }
            sum = 0;
        }
    }
}
