package org.usfirst.frc.team3130.robot.subsystems;

import org.usfirst.frc.team3130.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vroom extends Subsystem {

	//instantiation for our driving system
	private static Vroom m_pInstance;
    public static Vroom GetInstance()
    {
    	if(m_pInstance == null) m_pInstance = new Vroom();
    	return m_pInstance;
    }
    
    //create the needed drive components
    //m_ means that it is a member of a class
    private static RobotDrive m_drive;
    private static Talon m_leftMotor;
	private static Talon m_rightMotor;
	
	private Vroom() {
		
		m_leftMotor = new Talon(RobotMap.CAN_LEFTMOTORFRONT);
		m_rightMotor = new Talon(RobotMap.CAN_LEFTMOTORREAR);
		
	}
	
    public void initDefaultCommand() {
    	
    }
}

