class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] resultArr = new int[queries.length];
        
        int[] xorArr = new int[arr.length];
        xorArr[0] = arr[0];
        
        for(int index=1; index<arr.length; index++) {
            xorArr[index] = xorArr[index-1] ^ arr[index];
        }
        
        for(int index=0; index < queries.length; index++) {
            int[] query = queries[index];
            int left = query[0];
            int right = query[1];
            
            int leftBound = left == 0 ? 0 : xorArr[left - 1];
            int rightBound = xorArr[right];
            
            resultArr[index] = leftBound ^ rightBound;
        }
        return resultArr;
    }
}