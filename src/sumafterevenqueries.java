import java.util.Arrays;

public class sumafterevenqueries {
    static int[] solution(int[] A, int[][] queries) {
        int index;
        int diff;
        int update;
        int answerIndex=0;
        int[] answer=new int[A.length];
        for (int[] query : queries) {
            index = query[1];
            diff = query[0];
            A[index]+=diff;
            update=0;
            for (int i : A) {
                if (i % 2 == 0) {
                    update+=i;
//                    System.out.println(i);
                }
            }
            answer[answerIndex]=update;
            answerIndex++;
            System.out.println(Arrays.toString(answer));
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int q[][] = { {1, 0} , { -3, 1} , {-4,0} , {2,3} };
        solution(arr,q);
    }
}
