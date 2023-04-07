package chap01._1_2_exam_program._2_refactoring;

public class Main {
    public static void main(String[] args) {
        final Robot robot = new Robot("Andrew");
        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);
    }
}
