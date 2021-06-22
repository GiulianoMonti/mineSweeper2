# mineSweeper2
Minesweeper from hyperskill trying to fix my old code

Minesweeper de hyperskill(jetbrains academy), proyecto que habia hecho cuando empece a programar, tratando de fixear algunas cosas feas del viejo codigo


abajo todo el ejemplo de como funciona,

ingresar coordenadas y opcion mine or free ( free para espacios libres y mine para dejar una flag en donde se supone que hay una mina... if true se gana)



info 
In this final stage, your program should contain the following additional functionality:

Print the current state of the minefield starting with all unexplored cells at the beginning, ask the player for their next move with the message Set/unset mine marks or claim a cell as free:, treat the player's move according to the rules, and print the new minefield state. Ask for the player's next move until the player wins or steps on a mine. The player's input contains a pair of cell coordinates and a command: mine to mark or unmark a cell, free to explore a cell.

If the player explores a mine, print the field in its current state, with mines shown as X symbols. After that, output the message You stepped on a mine and failed!.

Generate mines like in the original game: the first cell explored with the free command cannot be a mine; it should always be empty. You can achieve this in many ways – it's up to you.

Use the following symbols to represent each cell's state:

. as unexplored cells

/ as explored free cells without mines around it

Numbers from 1 to 8 as explored free cells with 1 to 8 mines around them, respectively

X as mines

* as unexplored marked cells



