class Solution {
    public boolean checkIfExist(int[] arr) {
        int i,j,n=arr.length;

        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if(arr[i]==2*arr[j] && i!=j)
                {
                    return true ;
                }
            }
        }
        return false ;

    }
}