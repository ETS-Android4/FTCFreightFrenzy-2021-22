package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Utility.Subsystem;

public abstract class Drivetrain extends Subsystem {

    // Characteristics / Variables
    public static DcMotorEx frontLeft;
    public static  DcMotorEx frontRight;
    public static  DcMotorEx backRight;
    public static  DcMotorEx backLeft;

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
}