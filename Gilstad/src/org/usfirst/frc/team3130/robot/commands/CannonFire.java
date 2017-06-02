package org.usfirst.frc.team3130.robot.commands;

import org.usfirst.frc.team3130.robot.subsystems.Cannon;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CannonFire extends Command {

	Timer timer;
	
    public CannonFire() {
        requires(Cannon.GetInstance());
        timer = new Timer();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Cannon.setCannon(true);
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() > SmartDashboard.getNumber("Cannon Fire Time",0.5);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Cannon.setCannon(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
