package chap01._1_3_one_more_step._2_enum;

public class Robot {
    private final String _name;
    public enum Command{
        WALK, STOP, JUMP
    }

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(Robot.Command command){
        if(command == Command.WALK){
            System.out.println(_name + " walk.");
        }else if(command == Command.STOP){
            System.out.println(_name + " stop.");
        }else if(command == Command.JUMP){
            System.out.println(_name + " jump.");
        } else{
            System.out.println("command error. command = " + command);
        }
    }
}
