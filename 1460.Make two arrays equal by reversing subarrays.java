class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    var temp = new int[1001];

    for (var n : arr) temp[n]++;
    for (var n : target) temp[n]--;

    return Arrays.equals(temp, new int[1001]);
  }
}
