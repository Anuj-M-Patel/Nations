package nations.main;

import java.util.ArrayList;

import nations.buildings.Building;
import nations.improvements.Improvement;
import nations.improvements.NoImprovement;
import nations.nations.Nation;
import nations.terrains.Terrain;
import nations.units.Unit;

public class City {

	private int production;
	private int gold;
	private int food;
	private int science;
	private int population;
	private boolean isCoastal;
	private Nation owner;
	private ArrayList<Tile> tiles;
	private ArrayList<Building> buildings;
	
	public City(ArrayList<Tile> tiles) {
		this.tiles = tiles;
		production = 0;
		gold = 0;
		food = 0;
		for (Tile tile : tiles) {
			production += tile.getProduction();
			gold += tile.getGold();
			food += tile.getFood();
		}
		science = population / 2 + 1;
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
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public void addTile(Tile tile) {
		tiles.add(tile);
	}
	
	public void update() {
		production = 0;
		gold = 0;
		food = 0;
		for (Tile tile : tiles) {
			production += tile.getProduction();
			gold += tile.getGold();
			food += tile.getFood();
		}
		science = population / 2 + 1;
		for (Building building : buildings) {
			production += building.getProduction();
			gold += building.getGold();
			food += building.getFood();
			science += building.getScience();
		}
	}
	
}
