class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xorOfNums = 0;
        for(int num: nums) {
            xorOfNums = xorOfNums ^ num;
        }
        
        int firstNumber = 0;
        
        int mask = (xorOfNums & (-xorOfNums));
            
        for(int num: nums) {
            if((num & mask) == 0) {
                firstNumber = firstNumber ^ num;
            }
        }
        
        int secondNumber = xorOfNums ^ firstNumber;
        
        return new int[]{firstNumber, secondNumber};
    }
}