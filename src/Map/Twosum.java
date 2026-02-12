package test.Map;

public class Twosum {
    public static void main (String[] args){
        int [] arr = {2,7,11,15};
        int target = 9;
        new Twosum().twosum(arr, target);
    }
    int [] twosum(int[] arr,int target){
        for(int i = 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
