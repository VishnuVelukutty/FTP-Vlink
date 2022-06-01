public class dup {
    public static void main(String[] args) {
        String str = "aabbccdd";
        char[] arr = str.toCharArray();
        String op = "";

        for(char c : arr){
            if(op.indexOf(c)==-1){
                op+=c;
            
            }
        }
        System.out.println(op);
    }
}
