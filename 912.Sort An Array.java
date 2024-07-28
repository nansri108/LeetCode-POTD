class Solution {
    public int[] sortArray(int[] nums) {
        int si=0;
        int ei=nums.length-1;
        mergeSort(nums,si,ei);
        return nums;
    }
    private void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
        private void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArray[i] = nums[left + i];
        for (int i = 0; i < n2; ++i)
            rightArray[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            nums[k++] = leftArray[i++];
        }

        while (j < n2) {
            nums[k++] = rightArray[j++];
        }
    }
}
