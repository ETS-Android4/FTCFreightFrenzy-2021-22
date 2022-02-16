package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Subsystems.CarouselWheel;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.LinearSlides;
import org.firstinspires.ftc.teamcode.Utility.Subsystem;


    @Autonomous(name = "Red Park - Right Side")
    public class RedAutoRight extends LinearOpMode {

        @Override
        public void runOpMode() {

            /* INITIALIZATION */
            Subsystem.initialize(hardwareMap, telemetry);
            Drivetrain.initialize();
            Intake.initialize();
            LinearSlides.initialize();
            CarouselWheel.initialize();

            /* WAIT FOR START BUTTON PRESSED */
            waitForStart();

            /* BEGIN AUTO */
            /* This tells the robot to head toward the alliance storage unit with the preloaded freight.
            In addition, we are determining where the robot should head next, if anywhere. */
            Drivetrain.strafeLeft(0.5, 70.5);
            sleep(300);
            Drivetrain.driveForward(0.5, 23.5);
            sleep(150);
            Intake.setPower(0.5);
            // We are just stopping here for now until we test this code.

            /* END AUTO */
        }
    }

