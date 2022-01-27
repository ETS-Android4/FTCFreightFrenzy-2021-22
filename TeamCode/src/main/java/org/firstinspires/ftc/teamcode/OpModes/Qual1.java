/* DO NOT USE - OUTDATED */

/*
package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.*;
import org.firstinspires.ftc.teamcode.Utility.Subsystem;

@TeleOp(name = "Qual1")
public class Qual1 extends LinearOpMode {

    double ly, lx, rx, flpow, frpow, blpow, brpow, max;

    @Override
    public void runOpMode() {

        Subsystem.initialize(hardwareMap, telemetry);
        Intake.initialize();
        Drivetrain.initialize();

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

            //intake code on dpad1
            if (gamepad1.dpad_right){
                Intake.setPower(1);
            }
            if (gamepad1.dpad_left){
                Intake.setPower(-1);
            }
            if (gamepad1.dpad_down) {
                Intake.setPower(0);
            }
        }
    }
}
 */