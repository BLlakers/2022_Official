// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Endgame;

public class WinchCommand extends CommandBase {
  Endgame m_Endgame;

  public WinchCommand(Endgame _Endgame) {
    m_Endgame = _Endgame;

    addRequirements(m_Endgame);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_Endgame.winchMotor.getSelectedSensorPosition() < 4096) {
      m_Endgame.winch();
    }

  }
  
  
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
