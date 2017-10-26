/*
	题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
	输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
	例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
	NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/

/*
	思路：旋转数组有个特点：最大值和最小值是相邻的，通过遍历比较相邻两个元素
	可以找到最小值；如果旋转后和旋转前是同一个数组则返回第一个元素。
*/
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
		int size = array.length;
        if(size == 0){
            return 0;
        }
		for(int i = 0; i < size-1; i++){
			if(array[i] > array[i+1]){
				return array[i+1];
			}
		}
		return array[0];
    }

	/*
		看了评论有网友说这道题主要考察的是二分法，时间复杂度只有O(logN)
	*/
	/*
    public int minNumberInRotateArray(int [] array) {
    	int size = array.length;
        if(size == 0){
            return 0;
        }
		int left = 0;
		int right = size - 1;
		int middle = 0;
		while(array[left] >= array[right]){
			if(right - left <= 1){
				return array[right];
			}
			middle = (left+right)/2;
			if(array[middle] >= array[left]){
				left = middle;
			}
			if(array[middle] <= array[right]){
				right = middle;
			}
		}
		return array[0];
    }
	*/
}