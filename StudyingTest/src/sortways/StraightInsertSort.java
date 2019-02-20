package sortways;

public class StraightInsertSort {

	public static void main(String[] args) {
		int[] nums = new int[7];
		nums[0] = 10;
		nums[1] = 2;
		nums[2] = 11;
		nums[3] = 15;
		nums[4] = 14;
		nums[5] = 1;
		nums[6] = 0;
		
		insertSort(nums);
		for(int num :nums) {
			System.out.println(num);
		}

	}
	public static int[] insertSort(int[] nums) {
		int count = 1;
		for(int i = 1;i< nums.length ; i++) {
			//判断无序区第一元素和有序区最大元素大小。满足调用，不满足直接略过不更改位置
			if(nums[i]>nums[i-1]) {
				int temp = nums[i];
				int j = 0;
				//保存,将有序区的向后移动
				 //System.arraycopy(nums, i-1, nums, i, nums.length-i);
				for(j = i -1 ;j>=0&&temp>nums[j];j--) {
					//nums[j+1] =nums[j];
				}
				System.arraycopy(nums, j+1, nums, i-1,i);
				System.out.println(j+"第"+(count-1)+"次交换");
				
				nums[j+1] =temp;
			}
			System.out.println("第"+count+"次排序");
			count++;
		}
		return nums;
	}

}
