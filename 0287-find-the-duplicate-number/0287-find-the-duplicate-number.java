class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            int crtIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[crtIndex]){
                swap(arr,i,crtIndex);
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] != (j+1)){
            return arr[j];
        }
    }
    return -1;
}
    private static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
