class KthLargest {
 PriorityQueue<Integer>pq;
 int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int n : nums){
            add(n);
        }
    }
    
    public int add(int val) {
        if(pq.size()<k || val>pq.peek()){
          pq.offer(val);
          if(pq.size()>k){
            pq.poll();
          }
        }
        return pq.peek();
    }
}
