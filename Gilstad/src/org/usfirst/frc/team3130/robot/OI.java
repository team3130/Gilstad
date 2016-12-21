package org.usfirst.frc.team3130.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Instance Handling
	private static OI m_pInstance;
	public static OI GetInstance()
	{
		if(m_pInstance == null) m_pInstance = new OI();
		return m_pInstance;
	}
	
    
	
	//Define Input Devices
	public static Joystick stickL;
	public static Joystick stickR;
	public static Joystick gamepad;
	
	private OI()
	{
		//Initialize Input Devices
		stickL = new Joystick(0);
		stickR = new Joystick(1);
		gamepad = new Joystick(2);
	}
}

