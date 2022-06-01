public class equal {
    public static void main(String[] args) {
        String str = "aabbccdd";
        int n=3;
        int len = str.length();

        int split = len/n; ;

        for(int i=0;i<len;i++){
            
            if(i%split == 0){
                System.out.println();
                System.out.print(str.charAt(i));
            }
        }

    
    }
}
