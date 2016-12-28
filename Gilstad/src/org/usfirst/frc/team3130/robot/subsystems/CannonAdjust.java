package org.usfirst.frc.team3130.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CannonAdjust extends Subsystem {
    
	//instantiation for our cannon adjuster
		private static CannonAdjust m_pInstance;
	    public static CannonAdjust GetInstance()
	    {
	    	if(m_pInstance == null) m_pInstance = new CannonAdjust();
	    	return m_pInstance;
	    }

    public void initDefaultCommand() {
        
    }
}

