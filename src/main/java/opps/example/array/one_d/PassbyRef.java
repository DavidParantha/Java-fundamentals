package opps.example.array.one_d;

public class PassbyRef {

    public static void main(String[] args){
        int arr[]={23,345,45,54,50};
        int n = 20;
        new PassbyRef().book(n,arr);
        System.out.println(arr);
        System.out.println(n);
        System.out.println(arr[0]);

    }
    void book(int n, int[] arr){
        n=100;
        arr[0]=-1;
        System.out.println(arr);
    }
}
