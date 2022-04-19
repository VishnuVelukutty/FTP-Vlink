public class indexer {
    public static void main(String[] args) {
        int [] myArr = {75, 4, 56, 5, 36, 100, 77, 18,
            29, 94};


            int x=100;
            for (int i =0 ; i<myArr.length;i++){
                if (x == myArr[i]){
                    System.out.println(i);
                }
            }


    }
}
