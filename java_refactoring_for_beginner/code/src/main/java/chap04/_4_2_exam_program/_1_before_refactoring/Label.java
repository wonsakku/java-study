package chap04._4_2_exam_program._1_before_refactoring;

public class Label {

    private final String _label;

    public Label(String _label) {
        this._label = _label;
    }

    public void display() {
        System.out.println("display : " + _label);
    }

    @Override
    public String toString() {
        return "\"" + _label + "\"";
    }
}
