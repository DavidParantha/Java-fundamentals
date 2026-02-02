package opps.example.array.one_d.twod;

public class caution {
    public static void main(String[] args){
        int [][]mat={
                {2,54,65},
                {23,453,3}
        };
        int [][] cloned = new int[mat.length][];
        for(int i=0;i<cloned.length;i++){
            cloned[i]=mat[i].clone();

        }
        mat[0][0]=20;
        System.out.println(cloned[0][0]);
    }
}
