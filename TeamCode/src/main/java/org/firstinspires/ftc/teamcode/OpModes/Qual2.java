/* DO NOT USE - OUTDATED */

/*
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
        LinearSlides.initialize();

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

            /* FourBar LT and RT  */
/*
            if(gamepad1.left_trigger>=0.5) {
                LinearSlides.up();
            }
            if(gamepad1.right_trigger>=0.5){
                LinearSlides.down();
            }

            // Claw - A button
            if (gamepad1.a && !Constants.clawQueued)
                Constants.clawQueued = true;
            else if (!gamepad1.a && Constants.clawQueued) {
                Constants.clawQueued = false;
                if (!Claw.isOpen) {
                    Claw.openClaw();
                }
                else {
                    Claw.closeClaw();
                }
            }
        }
    }
}

 */