package org.firstinspires.ftc.teamcode.Ironclad;

import com.disnodeteam.dogecv.Dogeforia;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;

import java.util.ArrayList;
import java.util.List;

import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection.BACK;

public class VarRepo {

    public static final float mmPerInch        = 25.4f;
    public static final float mmFTCFieldWidth  = (12*6) * mmPerInch;       // the width of the FTC field (from the center point to the outer panels)
    public static final float mmTargetHeight   = (6) * mmPerInch;

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;
    public DcMotor horzSlide = null;
    public DcMotor vertSlide = null;
    public DcMotor linActuator = null;
    public DcMotor boxWinch = null;

    public Servo release = null;
    public double serv = 0;

    public CRServo Box = null;

    public BNO055IMU imu;

    public Orientation angles;
    public Acceleration gravity;

    public WebcamName webcamName;

    public GoldAlignDetector detector = new GoldAlignDetector();
    public static final VuforiaLocalizer.CameraDirection CAMERA_CHOICE = BACK;

    public OpenGLMatrix lastLocation = null;
    public boolean targetVisible;
    public Dogeforia vuforia;
    public List<VuforiaTrackable> allTrackables = new ArrayList<VuforiaTrackable>();

    public HardwareMap hwm = null;
    public Telemetry tele = null;
    public ElapsedTime period = new ElapsedTime();
    public float pitch;
    public float heading;


}