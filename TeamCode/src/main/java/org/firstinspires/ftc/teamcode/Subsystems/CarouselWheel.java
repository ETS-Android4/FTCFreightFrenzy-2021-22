package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Utility.*;

public abstract class CarouselWheel extends Subsystem {
    public static CRServo carouselMotor;

    public static void initialize() {
        carouselMotor = hm.get(CRServo.class, "CarouselMotor");
    }

    public static void setPower(double pow){
        carouselMotor.setPower(pow);
    }
}
