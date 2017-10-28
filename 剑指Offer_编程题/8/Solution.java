/*
	题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
	求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/

/*
	思路：其实这也是一个斐波那契数列。
	对于f(n)来说：
	假设一开始跳一格台阶，那么就有f(n-1)种跳法；
	假设一开始跳两格台阶，那么就有f(n-2)种跳法；
	所以f(n)=f(n-1)+f(n-2)
	对于斐波那契数列可以用递归或者循环来求，这里使用循环
*/
public class Solution {
    public int JumpFloor(int target) {
		int a = 1;
        int b = 2;
        int temp = 0;
        
        if(target == 1)
            return a;
        if(target == 2)
            return b;
        while(target > 2){
            target--;
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}