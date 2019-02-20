package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;
/**
 * 选择排序
 * @author Administrator
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = GetArrayUtil.get();
		selectSort(nums);
		PrintArrayUtil.print(nums);
	}
	/**
	 * min为最小值
	 * idx为最小值位置
	 * @param nums
	 */
	public static void selectSort(int[] nums) {
		int min;
		int idx = 0;
		//min为当前最小
		for(int j = 0;j<nums.length-1;j++) {
			min = nums[j];
			for(int i =j+1;i<nums.length;i++) {
				
				if(nums[i] < min ) {
					min = nums[i];
					idx = i;
				}
			}
			nums[idx] = nums[j];
			nums[j] = min;
		}
		
	}

}
