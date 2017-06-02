package org.usfirst.frc.team3130.robot.subsystems;

import org.usfirst.frc.team3130.robot.RobotMap;
import org.usfirst.frc.team3130.robot.commands.DefaultDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Chassis extends Subsystem {

	//instantiation for our driving system
	private static Chassis m_pInstance;
    public static Chassis GetInstance()
    {
    	if(m_pInstance == null) m_pInstance = new Chassis();
    	return m_pInstance;
    }
    
    //create the needed drive components
    //m_ means that it is a member of a class
    private static RobotDrive m_drive;
    private static Talon m_leftMotor;
	private static Talon m_rightMotor;
	
	private Chassis()
	{	
		//define objects
		m_leftMotor = new Talon(RobotMap.PWM_LEFTMOTOR);
		m_rightMotor = new Talon(RobotMap.PWM_RIGHTMOTOR);
		m_drive = new RobotDrive(m_leftMotor, m_rightMotor);
		m_drive.setSafetyEnabled(true);
		
		//display stuff on drive station
		LiveWindow.addActuator("Vroom", "Left Talon", m_leftMotor);
		LiveWindow.addActuator("Vroom", "Right Talon", m_rightMotor);
		
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new DefaultDrive());
    }
    
    public static void DriveArcade(double move, double turn, boolean squaredInputs)
    {
    	m_drive.arcadeDrive(move, turn, squaredInputs);
    }
    
    public static void DriveTank(double moveL, double moveR, boolean squaredInputs)
    {
    	m_drive.tankDrive(moveL, moveR, squaredInputs);
    }
}

