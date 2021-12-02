package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.teamcode.Utility.*;
public abstract class Claw extends Subsystem{
    private static Servo left;
    private static Servo right;
    private static double open = 0.5;
    private static double close = 0.5;
    public static boolean isOpen;

    public static void initialize() {

        //This keeps track of the current state of the claw.
        isOpen = true;

        // Hardware Map
        left = hm.get(Servo.class, "LeftServo");
        right = hm.get(Servo.class, "RightServo");

        // Rollers
        right.setDirection(Servo.Direction.REVERSE);
    }
    public static void openClaw() {
        left.setPosition(open);
        right.setPosition(open);
        //isOpen = !isOpen
    }
    public static void closeClaw() {
        left.setPosition(close);
        right.setPosition(close);
    }

}
