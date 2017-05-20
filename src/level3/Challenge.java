package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(900, 900);
		sleep(1200);
		driveDirect(0, 105);
		sleep(2300);
		driveDirect(900, 900);
		sleep(1200);
		driveDirect(105, 0);
		sleep(1900);
		driveDirect(900, 900);
		sleep(1200);
		driveDirect(0, 105);
		sleep(1900);
		driveDirect(900, 900);
		sleep(1000);
		driveDirect(105, 0);
		sleep(2000);
		driveDirect(900, 900);
		sleep(3000);
		
	}

	public void loop() {
	
	}
}
