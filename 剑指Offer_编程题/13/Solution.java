/*
	题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
	使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
	并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/

/*
	思路：有两种做法，一个是时间换空间，类似于排序算法来解决，比如说相邻交换奇偶数；
	一个是空间换时间，新建一个数组来存储偶数，最后放回原来的数组中。这种方法比较容易理解。
*/

public class Solution {
    public void reOrderArray(int [] array) {
        int temp = 0;
        int len = array.length;
        int[] evens = new int[len];
        int index = 0;
        for (int i = 0; i < len; i++){
            if ((array[i] & 1) == 1){
                array[temp] = array[i];
                temp++;
            } else {
                evens[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++){
            array[temp] = evens[i];
            temp++;
        }
    }
}