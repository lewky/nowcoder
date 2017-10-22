/*
	题目：
	请实现一个函数，将一个字符串中的空格替换成“%20”。
	例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy.
*/

/*
	解题思路：
	逐位判断字符是否为' '，是就拼接为"%20"，否则就拼接原字符。
*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
		if(str == null){
            return null;
        }
        StringBuffer target = new StringBuffer("");
        int i = 0;
		int len = str.length();
        char c = ' ';
        for(; i < len; i++){
            c = str.charAt(i);
            if(c != ' '){
                target.append(c); 
            }else{
                target.append("%20");
            }
        }
        return target.toString();
    }

	/*
		看到其他朋友的解答，是直接调用String的replaceAll()
		另外，replaceAll()支持正则表达式
	*/
	public String replaceSpace(StringBuffer str) {
		if(str == null){
            return null;
        }
		String s = str.toString().replaceAll(" ", "%20");
		return s;
	}
}