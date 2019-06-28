package TowerDefense;

public class Constants {
	public static final int MAP_WIDTH = 17; // keep the dimensions odd for best map generation results
	public static final int MAP_HEIGHT = 17;
	public static final int TURN_COUNT = 200;
	public static final int MIN_PATH_LENGTH = 30;

	public static final int PLAYER_MONEY = 550;
	public static final int PLAYER_LIVES = 10;

	public static final int GUNTOWER_COST = 100;
	public static final double[] GUNTOWER_DAMAGE = { 5, 8, 15, 30 };
	public static final double[] GUNTOWER_RANGE = { 3, 4, 5, 6 };
	public static final double[] GUNTOWER_RELOAD = { 5, 4, 3, 2 };
	public static final int FIRETOWER_COST = 100;
	public static final double[] FIRETOWER_DAMAGE = { 2, 3, 5, 7 };
	public static final double[] FIRETOWER_RANGE = { 1.5, 2, 2.3, 2.5 };
	public static final double[] FIRETOWER_RELOAD = { 8, 7, 6, 5 };
	public static final int GLUETOWER_COST = 70;
	public static final double[] GLUETOWER_DAMAGE = { 8, 15, 25, 40 }; // duration of slowdown effect
	public static final double[] GLUETOWER_RANGE = { 3, 4, 5, 6 };
	public static final double[] GLUETOWER_RELOAD = { 4, 3, 2, 1 };
	public static final int HEALTOWER_COST = 100;
	public static final double[] HEALTOWER_DAMAGE = { 5, 8, 15, 30 };
	public static final double[] HEALTOWER_RANGE = { 3, 4, 5, 6 };
	public static final double[] HEALTOWER_RELOAD = { 5, 4, 3, 2 };
	public static final int[] TOWER_UPGRADE_COSTS = { 50, 100, 150, 0 };

	public static final int[] SPAWN_START = { 1, 12, 22 };
	public static final int[] SPAWN_STEP = { 2, 3, 5 };
	public static final int[] SPAWN_SPEED = { 10, 12, 5 };
	public static final int[] SPAWN_BASE_HP = { 10, 10, 16 };
	public static final int[] SPAWN_INCREASE_HP = { 4, 0, 6 };
}
