package org.usfirst.frc.team3130.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	//ports for the motors :)
	public static final int PWM_LEFTMOTOR = 0;
	public static final int PWM_RIGHTMOTOR = 1;
	public static final int PWM_CANNON = 2;
	
	//Relay Ports
	public static final int RLY_CANNON = 0;
	
	//DIO values
	public static final int DIO_CANNONENCODERa = 0;
	public static final int DIO_CANNONENCODERb = 1;
	public static final int DIO_CANNONBOTTOM = 2;
	
	//User Input
	public static final int BTN_FIRECANNON = 6;
	public static final int AXS_CANNONANGLE = 1;
}
