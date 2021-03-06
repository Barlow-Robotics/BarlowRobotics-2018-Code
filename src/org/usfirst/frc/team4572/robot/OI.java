/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4572.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	//Playstation Controller Variable
    public static Joystick playstation = new Joystick(RobotMap.Controllers.PLAYSTATION_PORT);
    
    //Logitech Controller
    public static Joystick logitech = new Joystick(RobotMap.Controllers.LOGITECH_PORT);
    
    //Gyroscope Variable
    //public static AnalogGyro analogGyro = new AnalogGyro(RobotMap.GYROSCOPE_PORT);
    
    
    public static double getPlaystationX(){
    	return playstation.getX();
    }
    public static double getPlaystationY(){
    	return playstation.getY();
    }
    public static double getPlaystationZ(){
    	return playstation.getZ();
    }
    
//    public static double getGyro(){
//    	return analogGyro.getAngle();
//    }
//    
	/** 
	* There are a few additional built in buttons you can use. Additionally,
	* by subclassing Button you can create custom triggers and bind those to
	* commands the same as any other Button.
	*
	* TRIGGERING COMMANDS WITH BUTTONS
	* Once you have a button, it's trivial to bind it to a button in one of
	* three ways:
	*
	* Start the command when the button is pressed and let it run the command
	* until it is finished as determined by it's isFinished method.
	* button.whenPressed(new ExampleCommand());
	*
	* Run the command while the button is being held down and interrupt it once
	* the button is released.
	* button.whileHeld(new ExampleCommand());
	*
	* Start the command when the button is released and let it run the command
	* until it is finished as determined by it's isFinished method.
	* button.whenReleased(new ExampleCommand());
	*/
}
