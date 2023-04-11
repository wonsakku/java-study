package chap04._4_2_exam_program._2_refactoring;

public class NullLabel extends Label {

    public NullLabel(){
        super("(none)");
    }

    @Override
    public void display() {

    }

    @Override
    public boolean isNull() {
        return true;
    }


}
