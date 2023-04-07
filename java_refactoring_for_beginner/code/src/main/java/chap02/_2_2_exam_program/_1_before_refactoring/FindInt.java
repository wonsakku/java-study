package chap02._2_2_exam_program._1_before_refactoring;

public class FindInt {

    public static boolean find(int[] data, int target){
        boolean flag = false;

        for (int i = 0; i < data.length && !flag; i++) {
            if(data[i] == target){
                flag = true;
            }
        }

        return flag;
    }
}
