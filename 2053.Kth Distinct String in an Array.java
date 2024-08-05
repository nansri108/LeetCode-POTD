class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> hm=new LinkedHashMap<>();
        int count=0;
        for(int i=0; i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        Set<String>keyset=hm.keySet();
        for(String s: keyset){
            if(hm.get(s)==1){
              count++;
              if(count==k){
                return s;
              } 
         }
        }
        return "";
    }
}
