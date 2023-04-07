package chap01._1_2_exam_program._2_refactoring;

public class Robot {
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    private final String _name;

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(int command){
        if(command == COMMAND_WALK){
            System.out.println(_name + " walks.");
        }else if(command == COMMAND_STOP){
            System.out.println(_name + " stops.");
        }else if(command == COMMAND_JUMP){
            System.out.println(_name + " jumps.");
        }else{
            System.out.println("command error. command = " + command);
        }
    }
}
