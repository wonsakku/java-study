package chap02._2_2_exam_program._2_refactoring_break;

public class FindInt {
    public static boolean find(int[] data, int target){
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if(data[i] == target){
                found = true;
                break;
            }
        }

        return found;
    }
}
