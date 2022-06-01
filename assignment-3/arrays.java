
public class arrays {
	public static void main (String args[]) {
		int [] myNum = {20,30,25,35,60,-16,100};
		int sum=0;
		double avg;
		
		for (int i=0;i<myNum.length;i++) {
			//System.out.println(myNum[i]);
			sum += myNum[i];
			System.out.println(sum);
			
		}
		avg = sum/myNum.length;
		System.out.println(avg);
	}

}
