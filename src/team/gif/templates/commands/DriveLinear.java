package team.gif.templates.commands;

import team.gif.templates.OI;
import team.gif.templates.RobotMap;

/**
 *
 * @author Patrick
 */
public class DriveLinear extends CommandBase {
    private int steps;
    
    public DriveLinear() {
        requires(drivetrain);
        steps = 0;
    }
    
    //Overloaded method for use in Auto
    public DriveLinear(int ticks) {
        requires(drivetrain);
        steps = ticks;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
        RobotMap.leftEncoder.reset();
        RobotMap.rightEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        int leftDist = drivetrain.getLeftDist();
        int rightDist = drivetrain.getRightDist();
        
        if (steps == 0) //driver input
        {
        	drivetrain.moveLeft(OI.leftStick.getY());
        	drivetrain.moveRight(OI.rightStick.getY());
        }
        else if (((leftDist + rightDist) / 2) < steps) //until desired distance is achieved
        {
        	drivetrain.moveLeft(1);
        	drivetrain.moveRight(1);
        }
        else //stop
        {
        	drivetrain.moveLeft(0);
        	drivetrain.moveRight(0);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
