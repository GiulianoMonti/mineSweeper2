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

Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: the user loses after exploring a cell that contains a mine

How many mines do you want on the field? > 10

 |123456789|
-|---------|
1|.........|
2|.........|
3|.........|
4|.........|
5|.........|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 3 2 free

 |123456789|
-|---------|
1|.1///1...|
2|.1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 1 1 free

 |123456789|
-|---------|
1|11///1...|
2|.1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 1 2 mine

 |123456789|
-|---------|
1|11///1...|
2|*1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 8 8 free

 |123456789|
-|---------|
1|11///1...|
2|*1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|.......1.|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 8 free

 |123456789|
-|---------|
1|11///1...|
2|*1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|......11.|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 6 8 free

 |123456789|
-|---------|
1|11///1...|
2|*1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.........|
8|.....211.|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 2 7 free

 |123456789|
-|---------|
1|11///1...|
2|*1//12...|
3|11//1....|
4|////1....|
5|11111....|
6|.........|
7|.3.......|
8|.....211.|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 5 6 free

 |123456789|
-|---------|
1|11///1X..|
2|X1//12...|
3|11//1X...|
4|////1....|
5|11111....|
6|.X..X....|
7|.3X...X..|
8|.X..X211.|
9|...X.....|
-|---------|
You stepped on a mine and failed!
Example 2: the user wins by marking all mines correctly

How many mines do you want on the field? > 8

 |123456789|
-|---------|
1|.........|
2|.........|
3|.........|
4|.........|
5|.........|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 5 5 free

 |123456789|
-|---------|
1|..1//1...|
2|111//2...|
3|/////1...|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23.1//111|
8|..21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 2 1 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1...|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23.1//111|
8|..21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 3 7 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1...|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23*1//111|
8|..21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 2 8 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1...|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23*1//111|
8|.*21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 1 8 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1...|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 3 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1*..|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 8 3 free

 |123456789|
-|---------|
1|.*1//1...|
2|111//2...|
3|/////1*1.|
4|/////11..|
5|//////1..|
6|/111//1..|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 9 3 free

 |123456789|
-|---------|
1|.*1//1...|
2|111//2.31|
3|/////1*1/|
4|/////111/|
5|//////111|
6|/111//1..|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 8 6 mine

 |123456789|
-|---------|
1|.*1//1...|
2|111//2.31|
3|/////1*1/|
4|/////111/|
5|//////111|
6|/111//1*.|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 2 free

 |123456789|
-|---------|
1|.*1//1...|
2|111//2231|
3|/////1*1/|
4|/////111/|
5|//////111|
6|/111//1*.|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 1 mine

 |123456789|
-|---------|
1|.*1//1*..|
2|111//2231|
3|/////1*1/|
4|/////111/|
5|//////111|
6|/111//1*.|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 9 1 mine

 |123456789|
-|---------|
1|.*1//1*.*|
2|111//2231|
3|/////1*1/|
4|/////111/|
5|//////111|
6|/111//1*.|
7|23*1//111|
8|**21/////|
9|..1//////|
-|---------|
Congratulations! You found all the mines!
Example 3: the user wins by exploring all safe cells

How many mines do you want on the field? > 5

 |123456789|
-|---------|
1|.........|
2|.........|
3|.........|
4|.........|
5|.........|
6|.........|
7|.........|
8|.........|
9|.........|
-|---------|
Set/unset mines marks or claim a cell as free: > 5 5 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|..1//1.21|
5|111//1...|
6|/////1.21|
7|/////111/|
8|111//////|
9|..1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 1 9 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|..1//1.21|
5|111//1...|
6|/////1.21|
7|/////111/|
8|111//////|
9|1.1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 1 4 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|1.1//1.21|
5|111//1...|
6|/////1.21|
7|/////111/|
8|111//////|
9|1.1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 4 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|1.1//1121|
5|111//1...|
6|/////1.21|
7|/////111/|
8|111//////|
9|1.1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 7 5 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|1.1//1121|
5|111//11..|
6|/////1.21|
7|/////111/|
8|111//////|
9|1.1//////|
-|---------|
Set/unset mines marks or claim a cell as free: > 8 5 free

 |123456789|
-|---------|
1|/////////|
2|/////111/|
3|111//1.1/|
4|1.1//1121|
5|111//112.|
6|/////1.21|
7|/////111/|
8|111//////|
9|1.1//////|
-|---------|
Congratulations! You found all the mines!
