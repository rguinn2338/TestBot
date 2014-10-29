package team.gif.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.templates.RobotMap;
import team.gif.templates.commands.DriveLinear;

/**
 *
 * @author Patrick
 */
public class Drivetrain extends Subsystem {
    
    public void moveLeft(double speed) {
        RobotMap.frontLeft.set(speed);
        RobotMap.rearLeft.set(speed);
    }
    
    public void moveRight(double speed) {
        RobotMap.frontRight.set(speed);
        RobotMap.rearRight.set(speed);
    }
    
    public double getLeftDist() {
        return RobotMap.leftEncoder.get();
    }
    
    public double getRightDist() {
        return RobotMap.rightEncoder.get();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveLinear());
    }
}
