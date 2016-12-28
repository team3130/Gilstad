package org.usfirst.frc.team3130.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3130.robot.commands.*;

//==========================================
//motor has a quad encoder
//make limit switches on the top and bottom
//==========================================

public class CannonAdjust extends Subsystem {
    
	//instantiation for our cannon adjuster
		private static CannonAdjust m_pInstance;
	    public static CannonAdjust GetInstance()
	    {
	    	if(m_pInstance == null) m_pInstance = new CannonAdjust();
	    	return m_pInstance;
	    }

    public void initDefaultCommand() {
        setDefaultCommand(new Changle());
    }
}

