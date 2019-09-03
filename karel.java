/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 * 
 * Assignment link: https://see.stanford.edu/materials/icspmcs106a/07-assignment-1-karel.pdf
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	
	private void moveToWall() {
		while(frontIsClear()) {
			move();
		}
	}
	
	private void pickUpBeeper() {
		if (beepersPresent()) {
			pickBeeper();
		}
	}
	
	private void turnToWest() {
		while (notFacingWest()) {
			turnLeft();
		}
	}
	
	private void turnToNorth() {
		while (notFacingNorth()) {
			turnLeft();
		}
	}
	
	public void run() {
		moveToWall();
		turnRight();
		move();
		turnLeft();
		move();
		pickUpBeeper();
		turnToWest();
		move();
		turnToNorth();
		moveToWall();
		turnToWest();
		moveToWall();
	}

}
