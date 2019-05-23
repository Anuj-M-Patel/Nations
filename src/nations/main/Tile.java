package nations.main;
import nations.terrains.Terrain;
import nations.units.Unit;
import nations.improvements.Improvement;
import nations.nations.Nation;

public class Tile {

	private int production;
	private int gold;
	private int food;
	private Terrain terrain;
	private Nation owner;
	private Improvement improvement;
	private Unit unit;
	
	public Tile(Terrain terrain) {
		production = terrain.getProduction();
		gold = terrain.getGold();
		food = terrain.getFood();
		improvement = null;
		unit = null;
	}
	
	public int getProduction() {
		return production;
	}
	
	public int getGold() {
		return gold;
	}

	public int getFood() {
		return food;
	}
	
	public void setOwner(Nation nation) {
		owner = nation;
	}
	
	public void setImprovement(Improvement improvement) {
		this.improvement = improvement;
	}
	
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	public void update() {
		if (improvement != null) {
			production = terrain.getProduction() + improvement.getProduction(); 
			gold = terrain.getGold() + improvement.getGold(); 
			food = terrain.getFood() + improvement.getFood();
		}
		else {
			production = terrain.getProduction();
			gold = terrain.getGold();
			food = terrain.getFood();
		}
	}
	
}
