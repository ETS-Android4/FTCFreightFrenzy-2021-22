package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.Utility.*;

public abstract class FourBar extends Subsystem {

    private static DcMotorEx motor;
    private static double power = 0.5;

    public static void initialize() {

        // Hardware Map
        motor = hm.get(DcMotorEx.class, "FourBar");



    }

    public static void up() {
        motor.setPower(power);
    }

    public static void down() {
        motor.setPower(-power);
    }



}
