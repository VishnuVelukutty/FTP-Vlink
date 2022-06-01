public class twod {
    public static void main(String[] args) {
        int twod[][] ={{1,2},{4,5},{8,9}};

        int sum = 0;

        for (int i=0; i<twod.length; i++ ){
            for (int j=0; j<twod[i].length; j++){
                sum+=twod[i][j];
                System.out.println(sum);
            }

        }


    }
}
