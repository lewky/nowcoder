/*
	题目：给定一个double类型的浮点数base和int类型的整数exponent。
	求base的exponent次方。
*/

/*
	思路：这道题并不是让你直接使用API提供的方法，而是自己去模拟实现
	求指数的过程，有一个简单的方法是直接去一个个乘以自己，时间复杂度是O(N)。
	后来看到以下这种方式，时间复杂度是O(logN)，可能会比较难以理解。
	假设求5^11，指数11的二进制是1011，可以拆分为2^3+2^1+2^0；
	即5^11=5^(2^3+2^1+2^0)=5^(2^3)*5^(2^1)*5^(2^0)；这时候一个循环11次乘以自己的计算
	就变成了只需要乘以3次的计算，但是这里的2^3要怎么计算呢？规律如下：
	1 * 5^1 = 5^1 = 5^(2^0)
	5^1*5^1 = 5^2 = 5^(2^1)
	5^2*5^2 = 5^4 = 5^(2^2)
	5^4*5^4 = 5^8 = 5^(2^3)
	...
	于是就有了以下代码中的&1位运算和base *= base以及n >>= 1操作。
*/

public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        int n = 0;
		if(exponent == 0){
            return 1;
        }else if(exponent < 0){
            if(base == 0){
                throw new RuntimeException("指数为负数时，底数不能为0");
            }
            n = -exponent;
        }else{
            n = exponent;
        }
        while(n != 0){
            if((n & 1) == 1){
                result *= base;
            }
            base *= base;
            n >>= 1;
        }
        return exponent>=0?result:(1/result);
    }
}