/*
	题目：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
*/

/*
	思路：递归是最常见的方式，另一种方式是循环
*/
public class Solution {
    public int Fibonacci(int n) {
		if(n == 1 || n == 2){
            return 1;
        }
        if( n > 2){
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        return 0;
    }

	//这是循环的方式
	/*
	public int Fibonacci(int n) {
		int a = 1;
        int b = 1;
        int temp = 0;

        if( n == 1 || n == 2)
        	return 1;
        while(n > 2){
            n--;
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
	*/
}