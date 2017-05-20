package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(400, 400);
		sleep(3100);
		driveDirect(0, 105);
		sleep(3700);
		driveDirect(400, 400);
		sleep(9000);
		driveDirect(0, 105);
		sleep(3100);
		driveDirect(400, 400);
		sleep(3500);
		
	}

	public void loop() {
	
	}
}
