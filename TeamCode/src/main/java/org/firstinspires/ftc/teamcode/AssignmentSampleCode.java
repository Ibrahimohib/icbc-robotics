package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "AssignmentSampleCode", group = "Robot")
public class AssignmentSampleCode extends LinearOpMode {

    public DcMotorEx backRight = null;
    public DcMotorEx backLeft = null;
    public DcMotorEx frontLeft = null;
    public DcMotorEx frontRight = null;

    //Ticks is motor rate * the ratio provided by Gobilda.
    public final double ticks = 537.7;
    //Circumference is based on the wheel size.
    public final double circumference = 301.59;
    @Override
    public void runOpMode() {
        backRight = hardwareMap.get(DcMotorEx.class, "right_back_drive");
        backLeft = hardwareMap.get(DcMotorEx.class, "left_back_drive");
        frontLeft = hardwareMap.get(DcMotorEx.class, "left_front_drive");
        frontRight = hardwareMap.get(DcMotorEx.class, "right_front_drive");

        frontRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        telemetry.addData("Status", "Ended");
    }
}
