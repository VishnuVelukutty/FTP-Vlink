public class maxmax {
        public static void main(String[] args) {
            
            int [] aArr = {25, 14, 56, 15, 36, 56, 77,
                18, 29, 49};
                int max1=aArr[0];
    
    
                for (int i =0 ; i<aArr.length;i++) {
                    if (aArr[i] > max1) {
                        max1 = aArr[i];
                    }
                }
                
                System.out.println(max1);

                int max2 = aArr[0];
    
                for (int i =0 ; i<aArr.length;i++) {
                    if (aArr[i] != max1 && aArr[i] > max2 ) {
                        max2 = aArr[i];
                    }
                }
                
                System.out.println(max2);
    
                
        }
        
    }
