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
		//code duplicate from PacMan.java
		//get different location coordinates around ghost's curr location
		Location up = myLoc.shift(-1,0);
		Location down = myLoc.shift(1,0);
		Location right = myLoc.shift(0,1);
		Location left = myLoc.shift(0,-1);
		//add locations to possible ArrayLIst we will iterate over
		ArrayList<Location> possible = new ArrayList<Location>();
		possible.add(up);
		possible.add(down);
		possible.add(right);
		possible.add(left);

		ArrayList<Location> valid = new ArrayList<Location>();
		//iterate over each possible location and use map function to check if pacman can move
		//based on the premise that the location isnt null or that a wall is not found at a location
		//other types are valid for moving (Ex. pacman, cherry etc)
		for (Location dir : possible){

			if(myMap.getLoc(dir) != null && myMap.getLoc(dir).contains(Map.Type.WALL)) {
				continue;
			}

			valid.add(dir);
		}
		return valid;
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
		
			if (myLoc == null) {
				return false;
			}
		
			//GHOST
			int xx = myLoc.x;
			int yy = myLoc.y;
			//null checks on locations getLoc
	
			// y+1
			Location check1 = new Location(xx, yy+1);
	
			// y-1
			Location check2 = new Location(xx, yy-1);
	
			// x+1
			Location check3 = new Location(xx+1, yy);
	
			// x-1
			Location check4 = new Location(xx+1, yy);
	
			if (myMap.getLoc(check1).contains(Map.Type.PACMAN) 
					&& myMap.getLoc(check1) != null) {
				return true;
			} else if (myMap.getLoc(check2).contains(Map.Type.PACMAN)
					&& myMap.getLoc(check2) != null) {
				return true;
			} else if (myMap.getLoc(check3).contains(Map.Type.PACMAN)
					&& myMap.getLoc(check3) != null) {
				return true;
			} else if (myMap.getLoc(check4).contains(Map.Type.PACMAN)
					&& myMap.getLoc(check4) != null) {
				return true;
			} else {
				return false;
			}
	}

	public boolean attack() {
		return false;
	}
}
