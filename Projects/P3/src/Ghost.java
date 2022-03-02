import java.util.HashSet;
import java.util.ArrayList;

public class Ghost {
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

		ArrayList<Location> validMoves = get_valid_moves();

		for (Location loc : validMoves) {
			if (!myMap.getLoc(loc).contains(Map.Type.WALL)) {
				myLoc = loc;
				myMap.move("ghost", loc, Map.Type.GHOST);
				return true;
			}
		}

		return false;
	}

	public boolean is_pacman_in_range() {
		return false;
	}

	public boolean attack() {
		return false;
	}
}
