package com.codingame.game;

import com.codingame.gameengine.core.AbstractSoloPlayer;

import TowerDefense.Attacker;
import TowerDefense.Tower;

public class Player extends AbstractSoloPlayer {
	private int money = 350;
	private int lives = 10;

	@Override
	public int getExpectedOutputLines() {
		return 1;
	}

	public int getMoney() {
		return money;
	}

	public void kill(Attacker a) {
		this.money += a.getMoney();
	}

	public boolean buy(Tower tower) {
		if (money < tower.getCost())
			return false;
		money -= tower.getCost();
		return true;
	}

	public String getPlayerInput() {
		return money + " " + lives;
	}

	public void loseLife() {
		lives--;
	}

	public boolean isDead() {
		return lives <= 0;
	}
}
