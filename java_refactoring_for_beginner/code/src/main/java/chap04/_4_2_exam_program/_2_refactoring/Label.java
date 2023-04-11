package chap04._4_2_exam_program._2_refactoring;

public class Label {

    private final String _label;

    public Label(String _label) {
        this._label = _label;
    }

    public void display() {
        System.out.println("display : " + _label);
    }

    public boolean isNull(){
        return false;
    }
    @Override
    public String toString() {
        return "\"" + _label + "\"";
    }
}
