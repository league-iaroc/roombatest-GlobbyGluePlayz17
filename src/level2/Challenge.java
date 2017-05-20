package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(500, 500);
		sleep(2900);
		driveDirect(0, 105);
		sleep(2800);
		driveDirect(500, 500);
		sleep(4500);
		driveDirect(105, 0);
		sleep(2500);
		driveDirect(500, 500);
		sleep(2900);
	}

	public void loop() {
	
	}
}
