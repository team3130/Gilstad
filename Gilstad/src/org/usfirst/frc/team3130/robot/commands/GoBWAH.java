package org.usfirst.frc.team3130.robot.commands;

import org.usfirst.frc.team3130.robot.OI;
import org.usfirst.frc.team3130.robot.subsystems.Vroom;

import edu.wpi.first.wpilibj.command.Command;


public class GoBWAH extends Command {

    public GoBWAH() {
    	requires(Vroom.GetInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double moveSpeed = -OI.stickL.getY();
    	double turnSpeed = -OI.stickR.getX();
    	double turnThrottle = (-0.5 * OI.stickR.getRawAxis(3)) + 0.5;
    	
    	//Explicitly turning on Quadratic inputs for drivers, as all other systems will use nonQuadratic
    	Vroom.DriveArcade(moveSpeed, turnSpeed * turnThrottle, true);
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
