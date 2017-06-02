package org.usfirst.frc.team3130.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //CAN ports
	public static final int CAN_PNMBOARD = 1;
	
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
	
	//Button List
	public static final int LST_BTN_A = 1;
	public static final int LST_BTN_B = 2;
	public static final int LST_BTN_X = 3;
	public static final int LST_BTN_Y = 4;
	public static final int LST_BTN_LBUMPER = 5;
	public static final int LST_BTN_RBUMPER = 6;
	public static final int LST_BTN_BACK = 7;
	public static final int LST_BTN_START = 8;
	public static final int LST_BTN_RJOYSTICKPRESS = 9;
	public static final int LST_BTN_LJOYSTICKPRESS = 10;

	//Axis List
	public static final int LST_AXS_LJOYSTICKX = 0;
	public static final int LST_AXS_LJOYSTICKY = 1;
	public static final int LST_AXS_LTRIGGER = 2;
	public static final int LST_AXS_RTRIGGER = 3;
	public static final int LST_AXS_RJOYSTICKX = 4;
	public static final int LST_AXS_RJOYSTICKY = 5;

	//POV Degress List
	public static final int LST_POV_UNPRESSED = -1;
	public static final int LST_POV_N = 0;
	public static final int LST_POV_NE = 45;
	public static final int LST_POV_E = 90;
	public static final int LST_POV_SE = 135;
	public static final int LST_POV_S = 180;
	public static final int LST_POV_SW = 225;
	public static final int LST_POV_W = 270;
	public static final int LST_POV_NW = 315;
	
	//User Input
	public static final int BTN_FIRECANNON = LST_BTN_RBUMPER;
	public static final int AXS_CANNONANGLE = LST_BTN_A;
}
