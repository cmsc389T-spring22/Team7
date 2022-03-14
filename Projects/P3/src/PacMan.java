import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
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

		// get different location coordinates around pacman's curr location
		Location up = myLoc.shift(-2, 0);
		Location down = myLoc.shift(2, 0);
		Location right = myLoc.shift(0, 2);
		Location left = myLoc.shift(0, -2);

		// add locations to possible ArrayLIst we will iterate over
		ArrayList<Location> possible = new ArrayList<Location>();
		possible.add(up);
		possible.add(down);
		possible.add(right);
		possible.add(left);

		ArrayList<Location> valid = new ArrayList<Location>();
		// iterate over each possible location and use map function to check if pacman
		// can move
		// based on the premise that the location isnt null or that a wall is not found
		// at a location
		// other types are valid for movig (Ex. ghost, cherry etc)
		for (Location dir : possible) {

			// System.out.println(dir);

			if (myMap.getLoc(dir) != null && myMap.getLoc(dir).contains(Map.Type.WALL)) {
				continue;
			}

			valid.add(dir);
		}
		return valid;

	}

	public boolean move() {

		// get all valid locations for pacman where it could be moved to next
		ArrayList<Location> validMoves = get_valid_moves();
		HashSet<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < validMoves.size(); i++) {
			
			int move = random.nextInt(validMoves.size());
			
			if (!set.contains(move)) {
				if (myMap.getLoc(validMoves.get(move)) != null) {
					if (!myMap.getLoc(validMoves.get(move)).contains(Map.Type.WALL)) {
						set.add(move);
						myLoc = validMoves.get(move);
						myMap.move("pacman", myLoc, Map.Type.PACMAN);
						return true;
					}
				}
			} else {
				i--;
			}
		}
		
		return false;
	}

	public boolean is_ghost_in_range() { 

		
		if (myLoc == null) {
			return false;
		}
		
		//PACMAN
		int xx = myLoc.x;
		int yy = myLoc.y;

		// y+1
		Location check1 = new Location(xx, yy-1);

		// y-1
		Location check2 = new Location(xx, yy+1);

		// x+1
		Location check3 = new Location(xx-1, yy);

		// x-1
		Location check4 = new Location(xx+1, yy);
		


		if (myMap.getLoc(check1).contains(Map.Type.GHOST) 
				&& (myMap.getLoc(check2) != null)) {
			return false;
		} else if (myMap.getLoc(check2).contains(Map.Type.GHOST)
				&& (myMap.getLoc(check3) != null)) {
			return false;
		} else if (myMap.getLoc(check3).contains(Map.Type.GHOST)
				&& (myMap.getLoc(check3) == null)) {
			return true;
		} else if (myMap.getLoc(check4).contains(Map.Type.GHOST)
				&& (myMap.getLoc(check2) == null)) {
			return true;
		} else {
			return false;
		}

	}

	public JComponent consume() { 
		if(myMap != null && myLoc != null && myMap.getLoc(myLoc) != null){
			if(myMap.getLoc(myLoc).contains(Map.Type.COOKIE )){
				return myMap.eatCookie("pacman");
			}
			return null;
		}
 		return null;
	}
}
