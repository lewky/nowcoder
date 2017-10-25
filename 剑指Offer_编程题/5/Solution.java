/*
	题目：用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型。
*/

/*
	思路：1、入列时，stack1入栈，需要先判断stack2是否为空，若不为空则将
	stack2中的元素先转移到stack1中。这样才能保证队列的先进先出。
		  2、出列时，将stack1中的元素全部转移到stack2，接着stack2出栈。
*/
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
		int size = stack2.size();
        if(size > 0){
            for(int i = 0 ; i<size; i++)
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }
    
    public int pop() {
		int size = stack1.size();
    	for(int i = 0; i<size; i++){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}