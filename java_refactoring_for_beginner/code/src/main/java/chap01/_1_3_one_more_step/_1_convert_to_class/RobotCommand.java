package chap01._1_3_one_more_step._1_convert_to_class;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "[RobotCommand: " + _name + "]";
    }
}
