package opps.example.array.one_d;

public class Search {

    public static void main(String[] args) {


        int[] numsort = {1, 2, 3, 4, 5, 8, 10};
        int target = 2;
        int i = 0, j = numsort.length - 1;
        int index = -1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (target == numsort[mid]) {
                index = mid;
                break;
            } else if (target < numsort[mid]) {
                j = mid - 1;
            } else
                i = mid + 1;
        }
        System.out.println(index);
    }
}



//        for (int i = 0; i < numsort.length; i++) {
//            if (numsort[i] == target) {
//                System.out.println("Found target at index: " + i);
//                return;
//            }
//        }
//
//        System.out.println("Target not found");
//    }
//}