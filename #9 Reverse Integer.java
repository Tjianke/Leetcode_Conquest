import java.util.*;
import java.math.*;
class Solution {
    public int reverse(int x) {
        if(x>(Math.pow(2,32)-1) || x < (-1)*Math.pow(2,32)){
            return 0;
        }
		Boolean negative = false;
		if (x<0){
			x = x * -1;
			negative = true;
		}
		
		int len = Integer.toString(x).length();
		
		int[] result=new int[len];
		
		long result1 = 0L;
		for(int i = 0; i<len; i++){
			int k = Dismantle(x)[i];
			result1 += k*(long)Math.pow(10,len-1-i);
		}
		if (!negative){
			if((result1 > Math.pow(2,31)-1) || result1 < (-1) * Math.pow(2,31)){
				return 0;
			}

			return (int)result1;	
		}else{
			if((Math.pow(2,31) < result1) || (result1 < (-Math.pow(2,31)+1))){
				return 0;
			}

			return (int)result1 * -1;
		}
		
	}
	//dismantle all the char into an arraylist;
	private int[] Dismantle(int num){
		int[] dismantled = new int[Integer.toString(num).length()];
		
		for(int length = 0; length < Integer.toString(num).length(); length++){
			dismantled[length] = num/(int)Math.pow(10, length) % 10; 
		}
		return dismantled;
	}
		
}