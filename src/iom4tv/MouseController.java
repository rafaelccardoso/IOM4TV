package iom4tv;

import java.awt.Point;
import java.awt.MouseInfo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.AWTException;

/**
 *
 * @author Rafael Cardoso
 */
public class MouseController {

    private Robot robot;

    public MouseController() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public Point getPosition() {
        Point cursor = MouseInfo.getPointerInfo().getLocation();
        return cursor;
    }

    public void centerCursor() {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) resolucao.getWidth();
        int alt = (int) resolucao.getHeight();
        robot.mouseMove((int) lar / 2, (int) alt / 2);
    }
}
