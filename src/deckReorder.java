import java.util.Arrays;

public class deckReorder {
    public static void main(String[] args) {
        int[] arr = {17,13,11,2,3,5,7};
        solution(arr);
    }

    static int[] solution(int[] deck) {
        Arrays.sort(deck);
        int[] r = new int[deck.length];
        System.out.println(Arrays.toString(deck));

        for (int i=0; i < deck.length; i+=2) {
            r[0]=deck[0];
        }
        return new int[]{1};
    }
}
