/*
	题目：
	在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	每一列都按照从上到下递增的顺序排序。请完成一个函数，
	输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/

/*
	解题思路：
	二维数组类似于一个二维矩阵，这样一个规定了排序的二维矩阵，
	从其左下角开始判断，如果比左下角的数值小就向上移动，反之就向右移动。
	由于二维数组的第二维长度不一定等长，所以每次都要判断是否会下标越界。
	比如输入这样一个二维数组，并查找是否存在5或7：
	{
		{1,3,5},
		{2,4}, 
		{3,6,8,9}
	}
*/

public class Solution {
    public boolean find(int target, int [][] array) {
        int i = array.length - 1;
        int j = 0;
        int k = 0;
        while(i >= 0){
            k = array[i].length;
            if(j >= k){
                i--;
				continue;
            }
            if(target == array[i][j]){
                return true;
            }else if(target > array[i][j]){
                j++;
            }else if(target < array[i][j]){
            	i--;
            }
        }
        return false;
    }
}