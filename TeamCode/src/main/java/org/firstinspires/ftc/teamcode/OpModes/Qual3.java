/** CHANGES TO MAKE:
 * - drive is way too sensitive
 * - intake faster
 * - carousel wheel not working
 */

package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Utility.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;

@TeleOp(name = "Qual3: TeleOp")
public class Qual3 extends LinearOpMode {

    double ly, lx, rx, flpow, frpow, blpow, brpow, max;

    @Override
    public void runOpMode() {

        /* INITIALIZATION */
        Subsystem.initialize(hardwareMap, telemetry);
        Drivetrain.initialize();
        Intake.initialize();
        //LinearSlides.initialize();
        CarouselWheel.initialize();

        /* WAIT FOR START BUTTON PRESSED */
        waitForStart();

        /* MAIN TELEOP LOOP */
        while (opModeIsActive()) {

            /* DRIVETRAIN CODE - JOYSTICKS */
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

            /* LINEAR SLIDES - LEFT AND RIGHT TRIGGERS */
            /*
            if(gamepad1.left_trigger>=0.1) {
                LinearSlides.up(gamepad1.left_trigger);
            }
            else if(gamepad1.right_trigger>=0.1){
                LinearSlides.down(gamepad1.right_trigger);
            }
            else LinearSlides.up(0);
            */

            /* INTAKE - A & B BUTTONS */
            if (gamepad1.a){
                Intake.setPower(1);
            }
            else if (gamepad1.b) {
                Intake.setPower(-1);
            }
            else {
                Intake.setPower(0);
            }

            /* CAROUSEL WHEEL - X BUTTON */
            if (gamepad1.x){
                CarouselWheel.setPower(1);
            }
            else {
                CarouselWheel.setPower(0);
            }

            /* END TELEOP LOOP */
        }
    }
}
