package Array;

public class Main {

    public static void main(String[] args) {
        // 取有语义
        int[] scores = new int[]{100, 99, 66};
//        for (int i = 0; i < scores.length; i ++) {
//            System.out.println(scores[i]);
//        }
        for (int score: scores) {
            System.out.println(score);
        }

        scores[1] = 20;
        for (int score: scores) {
            System.out.println(score);
        }
    }
}