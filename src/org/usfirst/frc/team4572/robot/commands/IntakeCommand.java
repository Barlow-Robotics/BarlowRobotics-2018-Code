package org.usfirst.frc.team4572.robot.commands;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class IntakeCommand extends Command {

	public IntakeCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.intakeSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (OI.logitech.getRawButton(4)) {
			Robot.intakeSubsystem.activateIntake(0.7);
		}
		else if(OI.logitech.getRawButton(5)) {
			Robot.intakeSubsystem.activateIntake(-0.7);	
		}
		else if(!(SmartDashboard.getNumber("LIDAR Distance", 100) < 30.0)){
			Robot.intakeSubsystem.activateIntake(0.0);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;

	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
