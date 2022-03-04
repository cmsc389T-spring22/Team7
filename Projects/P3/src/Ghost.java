import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		//GHOST
		int xx = myLoc.x;
		int yy = myLoc.y;

		// y+1
		Location check1 = new Location(xx, yy+1);

		// y-1
		Location check2 = new Location(xx, yy-1);

		// x+1
		Location check3 = new Location(xx+1, yy);

		// x-1
		Location check4 = new Location(xx+1, yy);

		if (myMap.getLoc(check1).contains(Map.Type.PACMAN)) {
			return true;
		} else if (myMap.getLoc(check2).contains(Map.Type.PACMAN)) {
			return true;
		} else if (myMap.getLoc(check3).contains(Map.Type.PACMAN)) {
			return true;
		} else if (myMap.getLoc(check4).contains(Map.Type.PACMAN)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean attack() {
		return false;
	}
}
