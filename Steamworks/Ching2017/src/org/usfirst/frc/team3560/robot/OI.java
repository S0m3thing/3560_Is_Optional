package org.usfirst.frc.team3560.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI  {
	/**
     * CREATING BUTTONS
     *One type of button is a joystick button which is any button on a joystick.
     *You create one by telling it which joystick it's on and which button
     *number it is.
     *Joystick stick = new Joystick(port);
     *Button button = new JoystickButton(stick, buttonNumber);
    
     *There are a few additional built in buttons you can use. Additionally,
     *by subclassing Button you can create custom triggers and bind those to
     *commands the same as any other Button.
    
     * TRIGGERING COMMANDS WITH BUTTONS
     *Once you have a button, it's trivial to bind it to a button in one of
     *three ways:
    
     *Start the command when the button is pressed and let it run the command
     *until it is finished as determined by it's isFinished method.
     *button.whenPressed(new ExampleCommand());
    
     *Run the command while the button is being held down and interrupt it once
     *the button is released.
     *button.whileHeld(new ExampleCommand());
    
     *Start the command when the button is released  and let it run the command
     *until it is finished as determined by it's isFinished method.
     *button.whenReleased(new ExampleCommand());
	 * @return 
	*/
	public Joystick driveStick, toolStick;
	public OI() {
		 driveStick = new Joystick(RobotMap.JoyMap.DRIVESTICK);
		 toolStick = new Joystick(RobotMap.JoyMap.TOOLSTICK);
		}
	  //////////////////////////////////////////////////////////////////////////////
	 //                           DriveStick Checks                              //
	//////////////////////////////////////////////////////////////////////////////
		/**
		 * Used to return the drivePad's right joystick y-axis value
		 * 
		 * @return Returns y-value from right joystick on the drivePad
		 */
		public double getDriveRightY() {
			double joy = driveStick.getRawAxis(RobotMap.JoyMap.RIGHT_ANALOG_Y);
			if (Math.abs(joy) < 0.10)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the drivePad's left joystick y-axis value
		 * 
		 * @return Returns y-value from left joystick on the drivePad
		 */
		public double getDriveLeftY() {
			double joy = driveStick.getRawAxis(RobotMap.JoyMap.LEFT_ANALOG_Y);
			if (Math.abs(joy) < 0.10)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the drivePad's right joystick x-axis value
		 * 
		 * @return Returns x-value from right joystick on the drivePad
		 */
		public double getDriveRightX() {
			double joy = driveStick.getRawAxis(RobotMap.JoyMap.RIGHT_ANALOG_X);
			if (Math.abs(joy) < 0.2)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the drivePad's left joystick x-axis value
		 * 
		 * @return Returns x-value from left joystick on the drivePad
		 */
		public double getDriveLeftX() {
			double joy = driveStick.getRawAxis(RobotMap.JoyMap.LEFT_ANALOG_X);
			if (Math.abs(joy) < 0.2)
				return 0.0;
			else
				return joy;
		}
		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveRightTrigger() {
			return driveStick.getRawButton(RobotMap.buttonMap.RIGHT_TRIGGER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveLeftTrigger() {
			return driveStick.getRawButton(RobotMap.buttonMap.LEFT_TRIGGER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveRightBumper() {
			return driveStick.getRawButton(RobotMap.buttonMap.RIGHT_BUMPER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveLeftBumper() {
			return driveStick.getRawButton(RobotMap.buttonMap.LEFT_BUMPER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveXButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.X_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveAButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.A_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveBButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.B_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveYButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.Y_BUTTON);
		}


		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveLeftAnalogButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.LEFT_ANALOG_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getDriveRightAnalogButton() {
			return driveStick.getRawButton(RobotMap.buttonMap.RIGHT_ANALOG_BUTTON);
		}
		  ///////////////////////////////////////////////////////////////////////////////
		 //                           ToolStick Checks                                //
		///////////////////////////////////////////////////////////////////////////////
		public double getToolRightY() {
			double joy = toolStick.getRawAxis(RobotMap.JoyMap.RIGHT_ANALOG_Y);
			if (Math.abs(joy) < 0.05)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the toolPad's left joystick y-axis value
		 * 
		 * @return Returns y-value from left joystick on the toolPad
		 */
		public double getToolLeftY() {
			double joy = toolStick.getRawAxis(RobotMap.JoyMap.LEFT_ANALOG_Y);
			if (Math.abs(joy) < 0.05)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the toolPad's right joystick x-axis value
		 * 
		 * @return Returns x-value from right joystick on the toolPad
		 */
		public double getToolRightX() {
			double joy = toolStick.getRawAxis(RobotMap.JoyMap.RIGHT_ANALOG_X);
			if (Math.abs(joy) < 0.05)
				return 0.0;
			else
				return joy;
		}

		/**
		 * Used to return the toolPad's left joystick x-axis value
		 * 
		 * @return Returns x-value from left joystick on the toolPad
		 */
		public double getToolLeftX() {
			double joy = toolStick.getRawAxis(RobotMap.JoyMap.LEFT_ANALOG_X);
			if (Math.abs(joy) < 0.05)
				return 0.0;
			else
				return joy;
		}
		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolRightTrigger() {
			return toolStick.getRawButton(RobotMap.buttonMap.RIGHT_TRIGGER);
			
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolLeftTrigger() {
			return toolStick.getRawButton(RobotMap.buttonMap.LEFT_TRIGGER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolRightBumper() {
			return toolStick.getRawButton(RobotMap.buttonMap.RIGHT_BUMPER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolLeftBumper() {
			return toolStick.getRawButton(RobotMap.buttonMap.LEFT_BUMPER);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolXButton() {
			return toolStick.getRawButton(RobotMap.buttonMap.X_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolAButton() {
			return toolStick.getRawButton(RobotMap.buttonMap.A_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolBButton() {
			return toolStick.getRawButton(RobotMap.buttonMap.B_BUTTON);
		}

		/**
		 * @return Returns corresponding value (true or false) when button is
		 *         pressed
		 */
		public boolean getToolYButton() {
			return toolStick.getRawButton(RobotMap.buttonMap.Y_BUTTON);
		}


			
}

