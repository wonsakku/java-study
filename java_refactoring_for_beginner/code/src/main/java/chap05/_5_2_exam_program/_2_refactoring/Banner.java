package chap05._5_2_exam_program._2_refactoring;

public class Banner {

    private final String _content;

    public Banner(String _content) {
        this._content = _content;
    }

    public void print(int times){
        printBorder();
        printContent(times);
        printBorder();
    }

    private void printContent(int times) {
        for(int i = 0; i < times; i++){
            System.out.println("|" + _content + "|");
        }
    }

    private void printBorder() {
        // 테두리 출력
        System.out.print("+");
        for(int i = 0 ; i < _content.length() ; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
