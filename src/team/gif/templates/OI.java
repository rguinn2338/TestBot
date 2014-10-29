
package team.gif.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public static Joystick leftStick = new Joystick(1);
    public static Joystick rightStick = new Joystick(2);
    
    public OI() {
        
    }
}

