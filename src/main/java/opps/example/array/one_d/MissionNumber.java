package opps.example.array.one_d;

public class MissionNumber {
    public static void main(String[] args){
        int []nums= {1,5,3,2};
        int ans= 0;
        for(int i = 1;i<=5;i++){
            ans^=i;
        }
        for(int i = 0;i<nums.length;i++){
            ans ^=nums[i];

        }
        System.out.println(ans);
    }
}
