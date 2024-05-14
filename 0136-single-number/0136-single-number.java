class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNum = 0;
        for(int num: nums) {
            uniqueNum = uniqueNum ^ num;
        }
        return uniqueNum;
    }
}