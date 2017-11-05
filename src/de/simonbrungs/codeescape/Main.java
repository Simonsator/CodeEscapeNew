package de.simonbrungs.codeescape;

public abstract class Main implements Dogbot {

	public void run() {
		intelligentMove(11);
		turnRight();
		move();
		pickUp();
		intelligentMove(2);
	}

	private void turnSoOftenLeft(int pTurnSoOften) {
		for (int i = pTurnSoOften; i != 0; i--)
			turnLeft();
	}

	private void intelligentMove(int pMax, boolean pLeft, int pChangeIn) {
		if (pMax == 0)
			return;
		while (!isMovePossible()) {
			if (pChangeIn == 0)
				pLeft = !pLeft;
			if (pLeft)
				turnLeft();
			else turnRight();
			pChangeIn--;
		}
		move();
		intelligentMove(pMax - 1, pLeft, pChangeIn);
	}

	private void intelligentMove(int pMax) {
		while (isMovePossible()) {
			if (pMax == 0)
				return;
			move();
			pMax--;
		}
		turnRight();
		intelligentMove(pMax);
	}
}
