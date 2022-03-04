import numpy as np 
import matplotlib.pyplot as plt

file = open("input.txt", "r")

matrix = []

"""read values in file""" 
for line in file:
    lin = []

    for char in line: 

        if char != '\n': 
            lin.append(int(char))
    
    matrix.append(lin)

"""rotate matrix read in from input file by 90-CCW"""
rotated = [list(r) for r in list(zip(*matrix))[::-1]]

mat = np.asarray(rotated)
#print(mat)

fig, ax = plt.subplots() 
min_val, max_val = 0 , 24

ax.matshow(mat, cmap = plt.cm.Blues, clim=(0))
# ax.set_xlabel('x - coordinate', fontsize=20)
# ax.set_ylabel('y - coordinate', fontsize = 20 )
ax.set_xticks(list(range(24)))
ax.set_yticks(list(range(24)))

for i in range(24): 
    for j in range(25): 
        c = (i,j)
        ax.text(i,j,str(c), va = 'center', ha= 'center')

fig.set_size_inches(20,20,forward=True)
plt.xlabel('x - coordinate', fontsize = 20)
plt.ylabel('y - coordinate', fontsize = 20 )
plt.savefig('map.png', bbox_inches = 'tight')
