package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Utility.Constants;
import org.firstinspires.ftc.teamcode.Utility.Subsystem;

public abstract class Drivetrain extends Subsystem {

    // Characteristics / Variables
    public static DcMotorEx frontLeft;
    public static  DcMotorEx frontRight;
    public static  DcMotorEx backRight;
    public static  DcMotorEx backLeft;

    // Constants
    private static final double WHEEL_DIAMETER_INCHES = 4;
    private static final double WHEEL_CIRCUMFERENCE_INCHES = WHEEL_DIAMETER_INCHES * Math.PI;
    private static final double TICKS_PER_REV = Constants.NEVEREST_ORBITAL_20_TICKS_PER_REV;
    private static final double GEAR_REDUCTION = 1;
    private static final double TICKS_PER_INCH = (TICKS_PER_REV * GEAR_REDUCTION) / WHEEL_CIRCUMFERENCE_INCHES;

    // Behaviors / Functions
    public static void initialize()
    {
        frontLeft = hm.get(DcMotorEx.class, "FrontLeft");
        frontRight = hm.get(DcMotorEx.class, "FrontRight");
        backRight = hm.get(DcMotorEx.class, "BackRight");
        backLeft = hm.get(DcMotorEx.class, "BackLeft");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public static void forward(double power, double inches) {

        // 1. Convert inches to ticks
        // 2. Stop and reset drive encoders
        // 3. Set target position
        // 4. Set zero-power behavior
        // 5. While busy, set drive power
        // 6. Stop motors
        // 7. Update run mode
    }

}