/*
	题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
	求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/

/*
	思路：这和之前的跳台阶(斐波那契数列)的分析类似，假如有n个台阶，如果
	一开始跳一阶，则有f(n-1)种跳法；如果一开始跳2阶则有f(n-2)种跳法，直到
	一开始跳n阶有f(n-n)=f(0)=1种跳法，加起来就是：f(n)=f(n-1)+f(n-2)+...+f(1)+f(0)
	分析n-1个台阶也是一样的，共有f(n-1)=f(n-2)+...+f(1)+f(0)
	可以得出f(n)=f(n-1)+f(n-1)=2*f(n-1)
	此时是递归的思路，接着我们可以发现，后一个数是前一个数的两倍，而f(0)=f(1)=1,f(2)=2...
	这等于在求等比数列，而比值为2
*/

public class Solution {
    public int JumpFloorII(int target) {
        int result = 1;
        if(target == 0)
            return result;
        if(target >= 1)
            return result << --target;
        return result;
    }
}