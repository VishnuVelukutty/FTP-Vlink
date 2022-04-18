
public class maxnum {
	public static void main (String args []) {
		int [] maxArray = {25,14,13,40,32,72};
		
		int max = 0;
		
		for (int i =0 ; i<maxArray.length;i++) {
			if (maxArray[i] > max) {
				max = maxArray[i];
			}
		}
		
		System.out.println(max);
	}

}
