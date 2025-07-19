package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@Autonomous(name = "AssignmentSampleCode", group = "Robot")
public class AssignmentSampleCode extends LinearOpMode {

    public DcMotorEx backRight;
    public DcMotorEx backLeft;

    //Ticks is motor rate * the ratio provided by Gobilda.
    public final double ticks = 537.7;
    //Circumference is based on the wheel size.
    public final double circumference = 301.59;
    @Override
    public void runOpMode() {
        backRight = hardwareMap.get(DcMotorEx.class, "right_front_drive");
        backLeft = hardwareMap.get(DcMotorEx.class, "left_front_drive");

        backRight.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        telemetry.addData("Status", "Ended");
    }
}
