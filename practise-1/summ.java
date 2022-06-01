public class summ {
    public static void main(String[] args) {
        int even=0,odd=0;
        int [] arr1= {1,2,3,4,5,6};
        for(int a : arr1){
            if(a%2==0){
                even+=a;
            }
            else{
                odd+=a;
            }
        }

        System.out.println("Even "+even);
        System.out.println("Odd "+odd);
    }
}
