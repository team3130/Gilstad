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
	
	private static final double RATIO_TICKSPERINCH = 7*71*Math.PI*(1.9+.05);	//Winch Diamater ~1.9, Rope Radius ~.05
	
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
		m_angleEncoder = new Encoder(RobotMap.DIO_CANNONENCODERa, RobotMap.DIO_CANNONENCODERb);
		m_limitSwitchBottom = new DigitalInput(RobotMap.DIO_CANNONBOTTOM);
		
		m_angleEncoder.setDistancePerPulse(1.0/RATIO_TICKSPERINCH);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new CannonAngle());
    }
    
    
    //function to move cannon up or down
    public static void moveCannon(double dir) {
    	if(m_limitSwitchBottom.get()){
    		m_angleEncoder.reset();
    		if(dir < 0) dir = 0;
    	}
    	m_angleController.set(dir);
    }

	@Override
	protected double returnPIDInput() {
		return m_angleEncoder.get();
	}

	@Override
	protected void usePIDOutput(double output) {
		moveCannon(output);
	}
    
	public static void holdCannon(){
		GetInstance().getPIDController().setSetpoint(m_angleEncoder.get());
		GetInstance().getPIDController().enable();
	}
	
	public static void releaseCannon(){
		GetInstance().getPIDController().disable();
	}
	
}

