package de.simonbrungs.codeescape;

public interface Dogbot {
	void move();

	void turnLeft();

	void turnRight();

	boolean isMovePossible();

	void rest();

	void pickUp();

	String read();

	void write(String pToWrite);
}
