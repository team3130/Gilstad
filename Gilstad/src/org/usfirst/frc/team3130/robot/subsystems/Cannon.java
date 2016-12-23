package org.usfirst.frc.team3130.robot.subsystems;

import org.usfirst.frc.team3130.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cannon extends Subsystem {
    
	//instantiation for our cannon
	private static Cannon m_pInstance;
    public static Cannon GetInstance()
    {
    	if(m_pInstance == null) m_pInstance = new Cannon();
    	return m_pInstance;
    }

    //Define private variables
    private static Relay m_cannonSolenoid;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    private Cannon()
    {
    	m_cannonSolenoid = new Relay(RobotMap.RLY_CANNON);
    	m_cannonSolenoid.setDirection(Direction.kForward);
    }
    
    public static void setCannon(boolean on)
    {
    	if(on) m_cannonSolenoid.set(Value.kOn);
    	else m_cannonSolenoid.set(Value.kOff);
    }
}

