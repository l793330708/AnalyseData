package sortways;
/**
 * 希尔排序
 * 内部使用插入排序，外部通过增量创建序列内部排序
 * @author Administrator
 *
 */
public class shellSort {
	public static void main(String[] args) {
		int[] nums = new int[7];
		nums[0] = 10;
		nums[1] = 2;
		nums[2] = 11;
		nums[3] = 15;
		nums[4] = 14;
		nums[5] = 1;
		nums[6] = 0;
		
		shellSortSort(nums);
		for(int num :nums) {
			System.out.println(num);
		}
	}
	public static void shellSortSort(int[] nums) {
		int i,j,temp,d; //d为当前增量
		int increment = nums.length/3; //increment为初始增量
		for(int m = increment;m>=1;m--) {
			d=m;
			for(i = d;i < nums.length;i++) {
				//分别插入各组有序区域
				if(nums[i]<nums[i-d]) {
					temp = nums[i];
					j = i;
					do {
						nums[j]  = nums [j - d];
						j = j-d;
						if(j-d<0)
							break;
					}while(j>0 && temp <nums[j-d]);
					nums[j] = temp;
					}
				}
			}
		}
	}
	

