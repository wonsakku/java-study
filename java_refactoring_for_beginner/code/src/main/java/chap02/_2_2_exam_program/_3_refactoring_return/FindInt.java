package chap02._2_2_exam_program._3_refactoring_return;

public class FindInt {
    public static boolean find(int[] data, int target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }

        return false;
    }
}
