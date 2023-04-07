package chap01._1_3_one_more_step._1_convert_to_class;

public class Robot {
    private final String _name;
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(RobotCommand command){
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
