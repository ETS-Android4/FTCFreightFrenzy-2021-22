package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Utility.*;

public abstract class CarouselWheel extends Subsystem {
    public static DcMotorEx carouselMotor;

    public static void initialize() {
        carouselMotor = hm.get(DcMotorEx.class, "CarouselMotor");
    }

    public static void setPower(double pow){
        carouselMotor.setPower(pow);
    }
}
