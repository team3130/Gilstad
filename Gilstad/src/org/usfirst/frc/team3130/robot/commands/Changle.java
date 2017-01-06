package org.usfirst.frc.team3130.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3130.robot.OI;
import org.usfirst.frc.team3130.robot.RobotMap;
import org.usfirst.frc.team3130.robot.subsystems.*;

/**
 *
 */
public class Changle extends Command {

	private static boolean held;
	
    public Changle() {
        requires(CannonAdjust.GetInstance());
        held = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double dir = OI.gamepad.getRawAxis(RobotMap.AXS_CANNONANGLE);
    	if(Math.abs(dir) < .1){
    		if(!held){
    			CannonAdjust.holdCannon();
    			held = true;
    		}
    	}
    	else{
    		held = false;
    		CannonAdjust.releaseCannon();
    		CannonAdjust.moveCannon(dir);
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
