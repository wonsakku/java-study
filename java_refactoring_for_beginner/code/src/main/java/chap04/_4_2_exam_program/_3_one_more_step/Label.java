package chap04._4_2_exam_program._3_one_more_step;

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

    public static Label newNull(){
        return NullLabel.getInstance();
    }

    private static class NullLabel extends Label{
        private static final NullLabel singleton = new NullLabel();
        private static NullLabel getInstance(){
            return singleton;
        }

        public NullLabel() {
            super("none");
        }

        @Override
        public void display() {

        }

        @Override
        public boolean isNull() {
            return true;
        }
    }
}
