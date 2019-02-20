package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;

public class StraightInsertSort {
/**
 * 直接插入排序,判断无序区的第一个元素与有序区的关系，假设为升序，i>i-1时不改变位置，有序区域直接+1， i<i-1时
 * 在有序区判断出插入元素的idx，在将有序区的元素idx向后+1，将插入元素插入到arr中
 * 类似于ArrayList的insert的操作
 * 适用于小规模的数据或基本有序
 * @param args
 */
	public static void main(String[] args) {
		int[] nums = GetArrayUtil.get();
		insertSort(nums,2);
		PrintArrayUtil.print(nums);

	}
	public static void insertSort(int[] nums,int sort) {
		
		 nums = (sort==1) ? insertSort(nums):insertSort1(nums);
	}
	/**
	 * 
	 * @param nums 排序数组
	 * @param desc 1为降序，2为升序
	 * @return
	 */
	public static int[] insertSort(int[] nums) {
		System.out.println("降序");
		//int count = 1;
		for(int i = 1;i < nums.length ; i++) {
			//判断无序区第一元素和有序区最大元素大小。满足调用，不满足直接略过不更改位置
			//此时i为无序区第一元素
			if(nums[i]>nums[i-1]) {
				int temp = nums[i];
				int j = 0;
				//保存,将有序区的向后移动
				 //System.arraycopy(nums, i-1, nums, i, nums.length-i);
				for(j = i -1 ;j>=0&&temp>nums[j];j--) {
					//nums[j+1] =nums[j];
				}
				System.arraycopy(nums, j+1, nums, j+2,i-1-j);
				
				
				nums[j+1] =temp;
			}
		
			
		}
		return nums;
	}
	
	public static int[] insertSort1(int[] nums) {
		System.out.println("升序");
		//int count = 1;
		for(int i = 1;i < nums.length ; i++) {
			//判断无序区第一元素和有序区最大元素大小。满足调用，不满足直接略过不更改位置
			
			if(nums[i]<nums[i-1]) {
				int temp = nums[i];
				int j = 0;
				//保存,将有序区的向后移动
				 //System.arraycopy(nums, i-1, nums, i, nums.length-i);
				for(j = i -1 ;j>=0&&temp<nums[j];j--) {
					//nums[j+1] =nums[j];
				}
				System.arraycopy(nums, j+1, nums, j+2,i-1-j);
				//System.arraycopy(nums, j+1, nums, i-1,i-1);
				
				
				nums[j+1] =temp;
			}
			
			
		}
		return nums;
	}

}
