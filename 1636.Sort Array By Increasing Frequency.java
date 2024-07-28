class Solution {
    public int[] frequencySort(int[] nums) {
    Map<Integer,Integer> hm= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){

            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
     Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        
 Arrays.sort(numsArray, (a, b) -> {
            if (!hm.get(a).equals(hm.get(b))) {
                return hm.get(a) - hm.get(b); 
            } else {
                return b - a;
            }
        });
        
        
        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }
}

