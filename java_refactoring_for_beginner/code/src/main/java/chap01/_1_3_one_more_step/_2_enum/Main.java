package chap01._1_3_one_more_step._2_enum;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOP);
        robot.order(Robot.Command.JUMP);
    }
}
