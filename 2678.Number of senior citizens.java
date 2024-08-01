class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String s=details[i];
            char[] ch = s.toCharArray();
            int a=Character.getNumericValue(ch[11]);
            int b=Character.getNumericValue(ch[12]);
            
            if(a>6 || (a==6 && b>0)){
                count ++;
            }
        }
        return count;
    }
}
