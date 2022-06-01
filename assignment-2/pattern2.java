public class pattern2{
    public static void main(String[] args) {
		int k=0;
        int x=5;
		for (int i = 1; i <= x; i++) {
            k++;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}


    }