package chap01._1_2_exam_program._1_before_refactoring;

public class Robot {

    private final String _name;

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(int command){
        if(command == 0){
            System.out.println(_name + " walks.");
        }else if(command == 1){
            System.out.println(_name + " stops.");
        }else if(command == 2){
            System.out.println(_name + " jumps.");
        }else{
            System.out.println("command error. command = " + command);
        }
    }
}
