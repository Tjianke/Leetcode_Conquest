class Solution {
    public String convert(String s, int numRows) {
		String Strtar = "";
		int len = s.length();
		if (numRows == 1) {
			return s;
		}
		if(numRows == 2) {
			for(int i = 1; i<=2 ; i++) {
				for(int j =i; j<= len; j+= 2*numRows-2) {
					Strtar+= s.charAt(j-1);
				}
			}
			return Strtar;
		}
		for(int j =1; j<= len; j+= 2*numRows-2) {
		Strtar+= s.charAt(j-1); 
		}
		for(int i = 2; i < numRows & i > 1;i++) {
			//n = 1 
			int currow = 2;
			for(int j =i; j<= len; j+= 2*numRows-2) {
			int midnum = j+2*numRows-2-2*(i-1);
			Strtar+= s.charAt(j-1); 
			if(midnum <= len) {
				Strtar+=s.charAt(midnum-1);
				}
			}
			currow= currow +1;
		}
		for(int j =numRows; j<= len ; j+= 2*numRows-2) {
			Strtar+= s.charAt(j-1); 
			}
		
		return Strtar;
	
	}
}