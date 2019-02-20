package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;
/**
 * 复写插入排序
 * @author Administrator
 *
 */
public class MyInsertSort {

	public static void main(String[] args) {
		int[] nums = GetArrayUtil.get();
		insertSort(nums);
		PrintArrayUtil.print(nums);

	}
	//10,20,30
	public static void insertSort(int[] nums) {
		//降序
		for(int i =0;i<nums.length-1 ;i++) {
			//判断无序区第一和有序区最小的关系
			if(nums[i]<nums[i+1]) {
				int temp = nums[i+1];
				int j;
				for( j= 0;j< i ;j++) {
					if(nums[i+1]>nums[j]) {
						//此时记录出j值
						break;
					}
					
				}
				//数组应在插入位置，复制到插入位置向后移动的一位，长度为 j（插入位置）到i+1（无序区第一项位置）的长度
				System.arraycopy(nums, j, nums, j+1, i+1-j);
				nums[j] = temp;
			}
		}
	}

}
