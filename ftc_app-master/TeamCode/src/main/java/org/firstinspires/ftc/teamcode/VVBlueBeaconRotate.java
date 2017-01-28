package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.hardware.DcMotor;

        import static org.firstinspires.ftc.teamcode.MethodSlave.encoderTurn;
/**
 * Created by Fluff on 1/28/2017.
 */


    //sets program name and group on phone, and groups are in alphabetic order
    @Autonomous(name="Blue Beacon Rotate", group="Test")
    public class VVBlueBeaconRotate extends LinearOpMode {

        //initialize motors, servos, booleans, and sensors
        DcMotor leftMotor;
        DcMotor rightMotor;


        @Override
        public void runOpMode() throws InterruptedException {
            //initializes components to names on phone
            leftMotor = hardwareMap.dcMotor.get("left");
            rightMotor = hardwareMap.dcMotor.get("right");

            //waits for user to press start
            waitForStart();

            encoderTurn(24.736, 1.0, true, leftMotor, rightMotor, opModeIsActive());
            sleep(2000);
            encoderTurn(28.0835, 1.0, false, leftMotor, rightMotor, opModeIsActive());
        }


    }


