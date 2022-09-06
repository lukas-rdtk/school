import java.awt.*;

public class MouseBot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        while (true) {
            robot.mouseMove(400, 400);
            Thread.sleep(60000);
        }
    }
}
