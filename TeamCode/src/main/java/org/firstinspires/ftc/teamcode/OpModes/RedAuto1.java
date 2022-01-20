package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

        import org.firstinspires.ftc.teamcode.Subsystems.*;
        import org.firstinspires.ftc.teamcode.Utility.Subsystem;

@Autonomous(name = "RedAuto1")
public class RedAuto1 extends LinearOpMode {

    @Override
    public void runOpMode() {
        Subsystem.initialize(hardwareMap, telemetry);
        Drivetrain.initialize();
        Intake.initialize();
        LinearSlides.initialize();
        CarouselWheel.initialize();

        waitForStart();

        Drivetrain.strafeLeft(0.5, 47);
        Drivetrain.driveForward(0.5, 23.5);
        // We are just stopping here for now until we test this code.
    }

}