package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Utility.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;

@TeleOp(name = "Qual2: TeleOp")
public class Qual2 extends LinearOpMode{

    double ly, lx, rx, flpow, frpow, blpow, brpow, max;

    @Override
    public void runOpMode() {

        Subsystem.initialize(hardwareMap, telemetry);
        // Intake.initialize();
        Drivetrain.initialize();
        Claw.initialize();
        FourBar.initialize();

        waitForStart();


        while (opModeIsActive()) {


            ly = -gamepad1.left_stick_y;
            lx = gamepad1.left_stick_x;
            rx = gamepad1.right_stick_x;

            flpow = ly + lx + rx;
            frpow = ly - lx - rx;
            blpow = ly - lx + rx;
            brpow = ly + lx - rx;

            max = Math.max(Math.max(Math.abs(flpow), Math.abs(frpow)),
                    Math.max(Math.abs(blpow), Math.abs(brpow)));

            flpow /= max;
            frpow /= max;
            blpow /= max;
            brpow /= max;

            Drivetrain.frontLeft.setPower(flpow);
            Drivetrain.frontRight.setPower(frpow);
            Drivetrain.backLeft.setPower(blpow);
            Drivetrain.backRight.setPower(brpow);

            /* FourBar LT and RT

             */
            if(gamepad1.left_trigger>=0.5) {
                FourBar.up();
            }
            if(gamepad1.right_trigger>=0.5){
                FourBar.down();
            }

            if (gamepad1.a) {

                Claw.isOpen = !Claw.isOpen;
                Claw.openClaw();
            }

/*
            //intake code on dpad1
            if (gamepad1.dpad_right){
                Intake.setPower(1);
            }
            if (gamepad1.dpad_left){
                Intake.setPower(-1);
            }
            if (gamepad1.dpad_down){
                Intake.setPower(0);
            }
            */

        }
    }
}