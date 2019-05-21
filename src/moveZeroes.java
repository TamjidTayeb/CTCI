import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,1,0,3,0};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] A) {
        int pointer=0;
        int temp;

        for (int i =0; i<A.length; i++) {
            if(A[i]!=0){
                if (i==pointer) {
                    pointer++;
                } else {
                    temp = A[pointer];
                    A[pointer] = A[i];
                    A[i] = temp;
                    pointer++;
                }
            }
        }
        return A;
    }

}
