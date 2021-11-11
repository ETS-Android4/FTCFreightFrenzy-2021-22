package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Utility.Subsystem;

public abstract class Intake extends Subsystem {

    private static DcMotorEx left;
    private static DcMotorEx right;

    public static void initialize() {

        // Hardware Map
        left = hm.get(DcMotorEx.class, "LeftIntake");
        right = hm.get(DcMotorEx.class, "RightIntake");

        // Rollers
        right.setDirection(DcMotor.Direction.REVERSE);
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public static void setPower(double pow) {
        left.setPower(pow);
        right.setPower(pow);
    }
}
