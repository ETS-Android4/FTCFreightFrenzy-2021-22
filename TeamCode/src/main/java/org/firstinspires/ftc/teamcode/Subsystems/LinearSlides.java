package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.Utility.*;

public abstract class LinearSlides extends Subsystem {

    private static DcMotorEx leftMotor;
    private static DcMotorEx rightMotor;
    //private static double power = 0.5;
    private static double maxSpeed = 0.5;

    public static void initialize() {

        // Hardware Map
        leftMotor = hm.get(DcMotorEx.class, "LLS");
        rightMotor = hm.get(DcMotorEx.class, "RLS");
        leftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

   /*
   public static void up() {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    public static void down() {
        leftMotor.setPower(-power);
        rightMotor.setPower(-power);
    }
    */

    public static void up(double LT){
        double power = LT * maxSpeed;

        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    public static void down(double LT){
        double power = LT * maxSpeed;

        leftMotor.setPower(-power);
        rightMotor.setPower(-power);
    }

}
