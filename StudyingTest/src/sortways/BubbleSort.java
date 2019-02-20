package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = GetArrayUtil.get();
		bubble(nums);
		PrintArrayUtil.print(nums);
	}
	public static void bubble(int[] nums) {
		int tmp;
		for(int i = 0;i< nums.length-1 ;i++) {
			for(int j = 0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
	}

}
