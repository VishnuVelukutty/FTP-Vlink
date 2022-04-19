public class maxmin {
    public static void main(String[] args) {
        
        int [] aArr = {25, 14, 56, 15, 36, 56, 77,
            18, 29, 49};
            int max=aArr[0],min=aArr[0];


            for (int i =0 ; i<aArr.length;i++) {
                if (aArr[i] > max) {
                    max = aArr[i];
                }
            }
            
            System.out.println(max);

            for (int i =0 ; i<aArr.length;i++) {
                if (aArr[i] < min) {
                    min = aArr[i];
                }
            }
            
            System.out.println(min);

            
    }
    
}
