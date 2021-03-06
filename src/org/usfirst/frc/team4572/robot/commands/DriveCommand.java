package org.usfirst.frc.team4572.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.DriveSubsystem;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	DriveSubsystem.m_robotDrive.setSafetyEnabled(false);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	DriveSubsystem.mecanumDrive();
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
