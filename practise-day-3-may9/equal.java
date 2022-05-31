public class equal {
    public static void main(String[] args) {
        String str = "aabbccdd";
        int n=5,temp=0;
        int len = str.length();

        int split = len/n; 
        String part= "";
        String [] op = new String [n];

        if(len%split != 0){
            System.out.println("Uneven");
        }           
            else{
                for(int i=0;i<len;i+=split){
                    part = str.substring(i,i+split);
                    op[temp] = part;
                    temp++;

            }

            for(int )
        }

    
    }
}
