package team.gif.templates;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;

public class RobotMap {
    
    public static Jaguar
        frontLeft = new Jaguar(1),
        frontRight = new Jaguar(2),
        rearLeft = new Jaguar(3),
        rearRight = new Jaguar(4);
    
    public static Encoder
        leftEncoder = new Encoder(1, 2),
        rightEncoder = new Encoder(3, 4);
}
