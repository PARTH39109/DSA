class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] result = new int[n];
        int k=0,count=0;

        for(int i=0;i<n;i++) {
            result[k++]=heights[i];
        }
        Arrays.sort(result);

        k=0;
        for(int i=0;i<n;i++) {
            if(result[k++]!=heights[i])
            {count++ ;}
        }
        return count;

    }
}