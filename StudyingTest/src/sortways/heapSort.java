package sortways;

import arrayUtil.GetArrayUtil;
import arrayUtil.PrintArrayUtil;
/**
 * 堆排序
 * @author Administrator
 *
 */
public class heapSort {

	public static void main(String[] args) {
		int[] nums = GetArrayUtil.get();
		new heapSort().heapSortF(nums);
		PrintArrayUtil.print(nums);
	}
	public void createHeap(int[] data ,int low,int high) {
		if((low<high) &&(high < data.length)){
			int j = 0;
			int k = 0;
			int tmp = 0; 
			for (int i = high / 2;i>= low; --i){
				tmp = data[i];
				k = i;
				j = 2 * k + 1;
				while(j <= high) {
						if((j<high)&&(j+1 <=high)&&(data[j]<data[j+1])) {
							++j;
							}
						if(tmp < data[j]) {
							data[k] = data[j];
							k = j;
							j = 2*k +1;
						}else {
							break;
						}
					}
				data[k] = tmp;
					
			}
		}
	}
	public int[] heapSortF(int[] data) {
		int tmp = 0;
		createHeap(data, 0, data.length-1);
		for(int i =data.length -1 ;i>0;--i) {
			tmp = data[0];
			data[0] = data[i];
			data[i] = tmp;
			createHeap(data, 0, i - 1);
		}
		return data;
	}
}
