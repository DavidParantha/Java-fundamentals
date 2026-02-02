package opps.example.array.one_d;

public class Arrayclassone {
    public static void main(String[] args){
        int [] arr = new int[5];
        arr[4]=10;
        System.out.println(arr[4]);
        System.out.println(arr.length);
        for(int i = 0;i<arr.length;i++){
            arr[i]=i*i;
            System.out.println(arr[i]);

        }
        for (int i = 0; i<arr.length;i++){
//            System.out.println(arr[i]);
        }

    }
}
