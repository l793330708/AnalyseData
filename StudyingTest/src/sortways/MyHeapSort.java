package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;

/**
 * 模仿堆排序重写
 * @author Administrator
 *
 */
public class MyHeapSort {
	public static void main(String[] args) {
		int[] arr= GetArrayUtil.get();
		for(int j = arr.length/2 - 1 ;j>=0 ;j --) {
			//构建Heap
			createHeap(arr, j, arr.length);
		
		}
		for(int k = arr.length-1 ;k>0 ;k--) {
			swap(arr,0,k);
			createHeap(arr, 0, k);
		}
		PrintArrayUtil.print(arr);
	}
	
	
	
	/**
	 * 交换数组位置
	 * @param a
	 * @param b
	 */
	public static void swap(int[] nums,int a,int b ) {
		//位异或运算，相同为假，不同为真 a^a = 0 b^b = 0
		//		  1、交换律
		//		　　2、结合律（即（a^b）^c==a^（b^c））
		//		　　3、对于任何数x，都有x^x=0，x^0=x
		//		　　4、自反性AXORBXORB=Axor0=A
				//a = a^b
				//b = b^a^b
				//a = a^b^a
		nums[a]=nums[a]^nums[b]; //
		nums[b]=nums[b]^nums[a]; //b = a
		nums[a]=nums[a]^nums[b]; // a^b^a = 0^b = b
	}
	/**
	 * 构建最大（小）堆，此处为最大堆,满足条件时构建以i为根节点的二叉树
	 * @param nums
	 * @param i
	 * @param length
	 */
	public static void createHeap(int[] nums,int i,int length) {
		//构建完全二叉树，并创建符合规则的最大（小）堆
		//存取根节点的值
		int temp = nums[i];
		//判断根节点下方的子女是否大 初始值为根节点的左叶子节点
		for(int k = 2*i+1 ; k<length ; k = 2*k + 1) {
			//判断叶子节点的个数以及大小，使k指向更大的叶子节点
			if((k+1<length)&&nums[k]<nums[k+1]) {
				k++;
			}
			//此时k指向更大的子孙
			//如果该节点比根节点要大则交换位置
			if(temp < nums[k]) {
				swap(nums,i,k);
				// 如果子节点更换了,判断更换后子节点是否满足条件
				i = k;
			}else {
				break;
			}
			
			
		}
	}
}
