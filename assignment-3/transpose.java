public class transpose {
    public static void main(String[] args) {
        int trans [][] = {{1,2},{4,5},{8,9}};


        for (int i=trans.length-1;i>=0;i--){
            for (int j=trans[i].length-1;j>=0;j--){
                System.out.println(trans[i][j]);
            }

        }

    }
}
