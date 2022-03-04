# Project 3 - Pacman 

### Team 7 Members
- Ivana Sanchez Diaz
- Asfandyar Khan
- Yoel Popovici
- Josue Proano 

## Pacman Class

### get_valid_moves()
#### Description
Using Pacman's current location, this function checks if Pacman can move 1 step up,down,left,right and adds those directions to a list.  If a wall is located in one of those directions the location is not added to the list.
#### Test 
Placing Pacman at location (9,11) the valid locations should be (9,12) (10,11) and we check that those moves are inside the list returned by the method. 

---




## Ghost Class
### get_valid_moves()
#### Description
Using Ghost's current location, this function checks if Pacman can move 1 step up,down,left,right and adds those directions to a list.  If a wall is located in one of those directions the location is not added to the list.
#### Test 
Placing Ghost at location (9,11) the valid locations should be (9,12) (10,11) and we check that those moves are inside the list returned by the method. We also check for location (10,12) which returns false. 

---

## Map Class 
### move(String name, Location loc, Type type)
#### Description
Using the name, loc, and type this method will update Pacman or Ghost types locations in the field, locations, and components.  This method also checks that the location parameter is within the map bounds.  Also checking that type is of type PACMAN or GHOST.  
#### Test 
Testing two valid locations (1,2) (1,1) where Pacman can be placed, (0,0) which is a wall returning false, and (23,15) which is out of bounds. 

---


## Extra Info 
### Map 
Helps visualize how the tests are run based on coordinates. 
<img src ="https://github.com/cmsc389T-spring22/Team7/blob/main/Projects/P3/map/map.png" width="600" height="600">
