// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class USB{
        public static final int DRIVER_CONTROLLER = 0;      // Driver Controller USB ID
        public static final int OPERATOR_CONTROLLER = 1;    // Operator controller USB ID
        public static final int OPERATOR_LY = 1;
        public static final int OPERATOR_LX = 0;
        public static final int OPERATOR_RY = 5;
        public static final int OPERATOR_RX = 4;
        public static final int OPERATOR_RT = 3;
        public static final int OPERATOR_LT = 2;
    }

    public final class WRIST{
        public static final int ID = 12;
        public static final double MAX_SPEED_UP = 0.3;
        public static final double MAX_SPEED_DOWN = 0.2;
        public static final double POSITION_TOLERANCE = 0.05;
        public static final double UP_POSITION = -9;
        public static final double DOWN_POSITION = 0;
                
        public static final double kP = 0;
        public static final double kI = 0;
        public static final double kD = 0;
    }

    public final class ELBOW{
        public static final int ID = 11;
        public static final boolean INVERTED = false;
        public static final double MAX_SPEED = 0.2;
        public static final double POSITION_TOLERANCE = 0.05;
        public static final double UP_POSITION = -9;
        public static final double DOWN_POSITION = 0;
                
        public static final double kP = 0;
        public static final double kI = 0;
        public static final double kD = 0;
    }

    public final class SHOULDER{
        public static final int LEFT = 9;
        public static final int RIGHT = 10;
        public static final boolean LEFT_INVERTED = false;
        public static final boolean RIGHT_INVERTED = true;
        public static final double MAX_SPEED = 0.2;
                
        public static final double kP = 0.09;
        public static final double kI = 0.1;
        public static final double kD = 0.03;
    }

    public final class ModuleConstants{
        public static final double kWheelDiameterMeters = 0.10;
        public static final double kDriveMotorGearRatio = 1/ 6.75;
        public static final double kTurningMotorGearRatio = 1 / 21.42857142857143;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurnEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurnEncoderRPM2RadPerSec = kTurnEncoderRot2Rad / 60;
        public static final double kPTurning = 0.6;
    }

    public final class Sensors{
      public static final int GYRO_ID = 16;
    }
    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(21.25); 
        // Distance between right and left wheel centers
        public static final double kWheelBase = Units.inchesToMeters(27.125);
        // Distance between front and back wheel centers
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        public static final int kFrontLeftDriveMotorPort = 8;
        public static final int kFrontLeftTurningMotorPort = 7;

        public static final int kBackLeftDriveMotorPort = 6;
        public static final int kBackLeftTurningMotorPort = 5;

        public static final int kFrontRightDriveMotorPort = 2;
        public static final int kFrontRightTurningMotorPort = 1;

        public static final int kBackRightDriveMotorPort = 4;
        public static final int kBackRightTurningMotorPort = 3;

        public static final boolean kFrontLeftTurningEncoderReversed = false;
        public static final boolean kBackLeftTurningEncoderReversed = false;
        public static final boolean kFrontRightTurningEncoderReversed = false;
        public static final boolean kBackRightTurningEncoderReversed = false;

        public static final boolean kFrontLeftDriveReversed = false;  //  inner wheel has the bevel gear
        public static final boolean kBackLeftDriveReversed = true;   //
        public static final boolean kFrontRightDriveReversed = true;  //  reverses stuff
        public static final boolean kBackRightDriveReversed = false;   //

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 12;   //  absoluteposition -0.498535 rotations
        public static final int kBackLeftDriveAbsoluteEncoderPort = 15;    //  absoluteposition -0.005127 rotations
        public static final int kFrontRightDriveAbsoluteEncoderPort = 13;  //  absoluteposition -0.485840 rotations
        public static final int kBackRightDriveAbsoluteEncoderPort = 14;   //  absoluteposition  0.000244 rotations

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = true;     // 12
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = true;      // 14
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = true;    // 13
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = true;     // 15

        public static double gryoDegrees = 360;

        // public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 2.244; //-0.31787109375
        // public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 4.040;  //0.343017578125
        // public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 5.355; //0.220458984375
        // public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 1.179; //0.310546875

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 0.0;
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 0.0 ;
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 0.0;
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 0.0;

        public static final double kPhysicalMaxSpeedMetersPerSecond = 4.4;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 1.5;
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 4;
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;

        public static final double kSlowButtonDriveModifier = 0.25;
        public static final double kSlowButtonTurnModifier = 0.5;
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 8;
        public static final double kMaxAngularSpeedRadiansPerSecond = DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 1;

        public static final double kDeadband = 0.05;
    }

}
