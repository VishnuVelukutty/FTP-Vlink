public class transpose {
    public static void main(String[] args) {
        int og [][] = {{1,2},{4,5},{8,9}};
        int trans [][]= new int [3][3] ;


        // for (int i=trans.length-1;i>=0;i--){
        //     for (int j=trans[i].length-1;j>=0;j--){
        //         System.out.println(trans[i][j]);
        for(int i=0;i<og.length;i++){    
            for(int j=0;j<og[i].length;j++){    
            trans[i][j]=og[j][i];  
            }    
            }    
            }

        }
