package org.usfirst.frc.team3130.robot.subsystems;

import org.usfirst.frc.team3130.robot.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

import org.usfirst.frc.team3130.robot.commands.*;

//==========================================
//motor has a quad encoder
//make limit switches on the top and bottom
//==========================================

public class CannonAdjust extends PIDSubsystem {
    
	private static Talon m_angleController;
	private static Encoder m_angleEncoder; 
	private static DigitalInput m_limitSwitchBottom;
	
	//maybe exists, maybe not
	private static DigitalInput m_limitSwitchTop;
	
	//instantiation for our cannon adjuster
	private static CannonAdjust m_pInstance;
	public static CannonAdjust GetInstance()
	{
	    if(m_pInstance == null) m_pInstance = new CannonAdjust();
	    return m_pInstance;
	}

	private CannonAdjust() {
		super("CannonAdjust", 1.0, 0.0, 0.0);
		m_angleController = new Talon(RobotMap.PWM_CANNON);
		m_angleEncoder = new Encoder(RobotMap.PWM_ENCODERA, RobotMap.PWM_ENCODERB);
		m_limitSwitchBottom = new DigitalInput(RobotMap.DIO_SWITCH_BOTTOM);//NOT CORRECT
		m_limitSwitchTop = new DigitalInput(RobotMap.DIO_SWITCH_TOP);//NOT CORRECT
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new Changle());
    }
    
    
    //function to move cannon up or down
    public static void moveCannon() {
    	
    }

	@Override
	protected double returnPIDInput() {
		
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		
	}
    
}

