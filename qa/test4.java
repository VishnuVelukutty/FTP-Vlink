package qa;

public class test4 {

    public static void main(String[] args) {
      
       
        int[] nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        int [] op=re(nums);
        
        for (int i : nums) {
            System.out.println(op[i]);
        } 

	}

    public static void swapper(int[] nums, int i, int j) {
        int t_nums = nums[i];
        nums[i] = nums[j];
        nums[j] = t_nums;
    }

    public static int[] re(int[] nums)
	{
		for (int i = 1; i < nums.length; i += 2)
		{
			if (nums[i - 1] > nums[i]) {
				swapper(nums, i - 1, i);
			}

			if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
				swapper(nums, i + 1, i);
			}
		}
        return nums;
     
	}


    }

