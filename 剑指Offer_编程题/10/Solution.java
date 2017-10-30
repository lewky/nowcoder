/*
	题目：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
	请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/

/*
	思路：其实这也是斐波那契数列，用归纳法分析：
	对于一个2*n的大矩形，有f(n)种方法；
	假如一开始用一个2*1来覆盖，那么就有f(n-1)种方法；
	假如一开始用两个1*2来覆盖，那么就有f(n-2)种方法；
	也就是说，f(n)=f(n-1)+f(n-2)
*/

public class Solution {
    public int RectCover(int target) {
        int temp = 0;
        int a = 1;
        int b = 2;
         
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        while(target > 2){
            target--;
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}