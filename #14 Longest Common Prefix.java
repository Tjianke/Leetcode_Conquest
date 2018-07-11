class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int length = strs.length;
        if(length == 0){
            return "";
        }
        String bigger = strs[0];
        //function that helps to find the shortest element in a string
        for(int len = 1; len< strs.length; len++){
            if(strs[len].length()>bigger.length()){
                
            }else{
                bigger = strs[len];
            }
        }
        String result = "";
        if(bigger == ""){
            return bigger;
        }
        for(int i = 0; i< bigger.length();i++){
            for(int j = 1; j<strs.length;j++ ){
                boolean test = strs[j-1].charAt(i) == strs[j].charAt(i);
                if (test != true){
                    return result;
                }
                
            }
            result+=bigger.charAt(i);
        }
        return result;
    }
}