import lejos.nxt.*;

class Thread1 extends RobotThread {
    public void run() {
        while (running) {
        }
    }
}

public class program {
	public static void main(String arg[]) {
        Thread1 thread1 = new Thread1();
        Button.ESCAPE.waitForAnyPress();
        RobotThread.running = false;
	}
}

class RobotThread extends Thread {
    public static boolean running = true;

    public static LightSensor lightSensor = new LightSensor(SensorPort.S1);
    public static TouchSensor touchSensor = new TouchSensor(SensorPort.S2);
    public static UltrasonicSensor ultraSensor = new UltrasonicSensor(SensorPort.S3);
    public static SoundSensor soundSensor = new SoundSensor(SensorPort.S4);

    public static NXTRegulatedMotor motorA = Motor.A;
    public static NXTRegulatedMotor motorB = Motor.B;
    public static NXTRegulatedMotor motorC = Motor.C;
    public RobotThread() {
    	start();
    }
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
