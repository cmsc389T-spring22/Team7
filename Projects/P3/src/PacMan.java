import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		//get different location coordinates around pacman's curr location
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
		//other types are valid for movig (Ex. ghost, cherry etc)
		for (Location dir : possible){

			if(myMap.getLoc(dir) != null && myMap.getLoc(dir).contains(Map.Type.WALL)) {
				continue;
			}

			valid.add(dir);
		}
		return valid;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
