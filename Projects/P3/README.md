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
