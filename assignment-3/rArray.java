public class rArray {
    public static void main(String[] args) {
        int [] sArr = {75, 4, 56, 5, 36, 65, 77, 18,
            29, 94} ;

        int [] rArr = new int[10];
        rArr = sArr;

            for (int i=sArr.length-1;i>=0;i--){
                System.out.println(rArr[i]);
            }
            

            

    }
}
