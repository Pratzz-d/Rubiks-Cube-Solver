import java.io.FileWriter;


public class Cube {
	private Cubie[][][] cubiePos = new Cubie[3][3][3];
	/*public Cube() {
		//Up, Front Row
		cubiePos[0][0][0] = new Cubie(0,0,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('R','L'), new CubieColor('G','F')}, true, false);
		cubiePos[1][0][0] = new Cubie(1,0,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('G','F')}, false, true);
		cubiePos[2][0][0] = new Cubie(2,0,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('G','F'), new CubieColor('O','R')}, true, false);

		//Front, E Row
		cubiePos[0][0][1] = new Cubie(0,0,1, 
				new CubieColor[]{ new CubieColor('R','L'), new CubieColor('G','F')}, false, true);
		cubiePos[1][0][1] = new Cubie(1,0,1, 
				new CubieColor[]{ new CubieColor('G','F')}, false, false);
		cubiePos[2][0][1] = new Cubie(2,0,1, 
				new CubieColor[]{ new CubieColor('G','F'), new CubieColor('O','R')}, false, true);

		//Down, Front Row
		cubiePos[0][0][2] = new Cubie(0,0,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('R','L'), new CubieColor('G','F')}, true, false);
		cubiePos[1][0][2] = new Cubie(1,0,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('G','F')}, false, true);
		cubiePos[2][0][2] = new Cubie(2,0,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('G','F'), new CubieColor('O','R')}, true, false);

		//Up, S Row
		cubiePos[0][1][0] = new Cubie(0,1,0, 
				new CubieColor[]{ new CubieColor('R','L'), new CubieColor('Y','U')}, false, true);
		cubiePos[1][1][0] = new Cubie(1,1,0, 
				new CubieColor[]{ new CubieColor('Y','U')}, false, false);
		cubiePos[2][1][0] = new Cubie(2,1,0, 
				new CubieColor[]{ new CubieColor('Y','U'), new CubieColor('O','R')}, false, true);

		//E, S Row
		cubiePos[0][1][1] = new Cubie(0,1,1, 
				new CubieColor[]{ new CubieColor('R','L')}, false, false);
		cubiePos[1][1][1] = new Cubie(1,1,1, 
				new CubieColor[]{ new CubieColor('A','A')}, //Just giving random, non-legitimate values for color and direction
				false, false);
		cubiePos[2][1][1] = new Cubie(2,1,1, 
				new CubieColor[]{ new CubieColor('O','R')}, false, false);

		//Down, S Row
		cubiePos[0][1][2] = new Cubie(0,1,2, 
				new CubieColor[]{ new CubieColor('R','L'), new CubieColor('W','D')}, false, true);
		cubiePos[1][1][2] = new Cubie(1,1,2, 
				new CubieColor[]{ new CubieColor('W','D')}, false, false);
		cubiePos[2][1][2] = new Cubie(2,1,2, 
				new CubieColor[]{ new CubieColor('W','D'), new CubieColor('O','R')}, false, true);

		//Up, Back Row
		cubiePos[0][2][0] = new Cubie(0,2,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('R','L'), new CubieColor('B','B')}, true, false);
		cubiePos[1][2][0] = new Cubie(1,2,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('B','B')}, false, true);
		cubiePos[2][2][0] = new Cubie(2,2,0, 
				new CubieColor[]{ new CubieColor('Y','U') , new CubieColor('B','B'), new CubieColor('O','R')}, true, false);

		//E, Back Row
		cubiePos[0][2][1] = new Cubie(0,2,1, 
				new CubieColor[]{ new CubieColor('R','L'), new CubieColor('B','B')}, false, true);
		cubiePos[1][2][1] = new Cubie(1,2,1, 
				new CubieColor[]{ new CubieColor('B','B')}, false, false);
		cubiePos[2][2][1] = new Cubie(2,2,1, 
				new CubieColor[]{ new CubieColor('B','B'), new CubieColor('O','R')}, false, true);

		//Down, Back Row
		cubiePos[0][2][2] = new Cubie(0,2,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('R','L'), new CubieColor('B','B')}, true, false);
		cubiePos[1][2][2] = new Cubie(1,2,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('B','B')}, false, true);
		cubiePos[2][2][2] = new Cubie(2,2,2, 
				new CubieColor[]{ new CubieColor('W','D') , new CubieColor('B','B'), new CubieColor('O','R')}, true, false);

	}*/
	
	public Cube() {
        reader r = new reader();
        String c = r.reading();
        //Up, Front Row
        cubiePos[0][0][0] = new Cubie(0,0,0,
                new CubieColor[]{ new CubieColor(c.charAt(42),'U') , new CubieColor(c.charAt(29),'L'), new CubieColor(c.charAt(0),'F')}, true, false);
        cubiePos[1][0][0] = new Cubie(1,0,0,
                new CubieColor[]{ new CubieColor(c.charAt(43),'U') , new CubieColor(c.charAt(1),'F')}, false, true);
        cubiePos[2][0][0] = new Cubie(2,0,0,
                new CubieColor[]{ new CubieColor(c.charAt(44),'U') , new CubieColor(c.charAt(2),'F'), new CubieColor(c.charAt(9),'R')}, true, false);

        //Front, E Row
        cubiePos[0][0][1] = new Cubie(0,0,1,
                new CubieColor[]{ new CubieColor(c.charAt(32),'L'), new CubieColor(c.charAt(3),'F')}, false, true);
        cubiePos[1][0][1] = new Cubie(1,0,1,
                new CubieColor[]{ new CubieColor(c.charAt(4),'F')}, false, false);
        cubiePos[2][0][1] = new Cubie(2,0,1,
                new CubieColor[]{ new CubieColor(c.charAt(5),'F'), new CubieColor(c.charAt(12),'R')}, false, true);

        //Down, Front Row
        cubiePos[0][0][2] = new Cubie(0,0,2,
                new CubieColor[]{ new CubieColor(c.charAt(45),'D') , new CubieColor(c.charAt(35),'L'), new CubieColor(c.charAt(6),'F')}, true, false);
        cubiePos[1][0][2] = new Cubie(1,0,2,
                new CubieColor[]{ new CubieColor(c.charAt(46),'D') , new CubieColor(c.charAt(7),'F')}, false, true);
        cubiePos[2][0][2] = new Cubie(2,0,2,
                new CubieColor[]{ new CubieColor(c.charAt(47),'D') , new CubieColor(c.charAt(8),'F'), new CubieColor(c.charAt(15),'R')}, true, false);

        //Up, S Row
        cubiePos[0][1][0] = new Cubie(0,1,0,
                new CubieColor[]{ new CubieColor(c.charAt(28),'L'), new CubieColor(c.charAt(39),'U')}, false, true);
        cubiePos[1][1][0] = new Cubie(1,1,0,
                new CubieColor[]{ new CubieColor(c.charAt(40),'U')}, false, false);
        cubiePos[2][1][0] = new Cubie(2,1,0,
                new CubieColor[]{ new CubieColor(c.charAt(41),'U'), new CubieColor(c.charAt(10),'R')}, false, true);

        //E, S Row
        cubiePos[0][1][1] = new Cubie(0,1,1,
                new CubieColor[]{ new CubieColor(c.charAt(31),'L')}, false, false);
        cubiePos[1][1][1] = new Cubie(1,1,1,
                new CubieColor[]{ new CubieColor('A','A')}, //Just giving random, non-legitimate values for color and direction
                false, false);
        cubiePos[2][1][1] = new Cubie(2,1,1,
                new CubieColor[]{ new CubieColor(c.charAt(13),'R')}, false, false);

        //Down, S Row
        cubiePos[0][1][2] = new Cubie(0,1,2,
                new CubieColor[]{ new CubieColor(c.charAt(34),'L'), new CubieColor(c.charAt(48),'D')}, false, true);
        cubiePos[1][1][2] = new Cubie(1,1,2,
                new CubieColor[]{ new CubieColor(c.charAt(49),'D')}, false, false);
        cubiePos[2][1][2] = new Cubie(2,1,2,
                new CubieColor[]{ new CubieColor(c.charAt(50),'D'), new CubieColor(c.charAt(16),'R')}, false, true);

        //Up, Back Row
        cubiePos[0][2][0] = new Cubie(0,2,0,
                new CubieColor[]{ new CubieColor(c.charAt(36),'U') , new CubieColor(c.charAt(27),'L'), new CubieColor(c.charAt(20),'B')}, true, false);
        cubiePos[1][2][0] = new Cubie(1,2,0,
                new CubieColor[]{ new CubieColor(c.charAt(37),'U') , new CubieColor(c.charAt(19),'B')}, false, true);
        cubiePos[2][2][0] = new Cubie(2,2,0,
                new CubieColor[]{ new CubieColor(c.charAt(38),'U') , new CubieColor(c.charAt(18),'B'), new CubieColor(c.charAt(11),'R')}, true, false);

        //E, Back Row
        cubiePos[0][2][1] = new Cubie(0,2,1,
                new CubieColor[]{ new CubieColor(c.charAt(30),'L'), new CubieColor(c.charAt(23),'B')}, false, true);
        cubiePos[1][2][1] = new Cubie(1,2,1,
                new CubieColor[]{ new CubieColor(c.charAt(22),'B')}, false, false);
        cubiePos[2][2][1] = new Cubie(2,2,1,
                new CubieColor[]{ new CubieColor(c.charAt(21),'B'), new CubieColor(c.charAt(14),'R')}, false, true);

        //Down, Back Row
        cubiePos[0][2][2] = new Cubie(0,2,2,
                new CubieColor[]{ new CubieColor(c.charAt(51),'D') , new CubieColor(c.charAt(33),'L'), new CubieColor(c.charAt(26),'B')}, true, false);
        cubiePos[1][2][2] = new Cubie(1,2,2,
                new CubieColor[]{ new CubieColor(c.charAt(52),'D') , new CubieColor(c.charAt(25),'B')}, false, true);
        cubiePos[2][2][2] = new Cubie(2,2,2,
                new CubieColor[]{ new CubieColor(c.charAt(53),'D') , new CubieColor(c.charAt(24),'B'), new CubieColor(c.charAt(17),'R')}, true, false);
	}
	
	public void turn (String turn) {
		//See the first case (B) to understand how all cases work
		char[] preChange; //Directions prior to turning
		char[] postChange; //What the directions change to after the turn
		Cubie[][] matrix = new Cubie[3][3]; //matrix to be rotated
		
		switch(turn) {
		case "B":
			preChange = new char[] {'B', 'U', 'R', 'D', 'L'};
			postChange = new char[] {'B', 'L', 'U', 'R', 'D'};
			//Transfer cubie data into matrix to be rotated
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[Math.abs(j-2)][2][i];
				}
			}
			//Rotate the matrix
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			//Reset the actual cube's cubies to those of the rotated matrix
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[Math.abs(j-2)][2][i] = matrix[i][j];
				}
			}
			break;
		
		case "B'":
			preChange = new char[] {'B', 'U', 'R', 'D', 'L'};
			postChange = new char[] {'B', 'R', 'D', 'L', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[Math.abs(j-2)][2][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[Math.abs(j-2)][2][i] = matrix[i][j];
				}
			}
			break;
			
		case "D" :
			preChange = new char[] {'D', 'L', 'B', 'R', 'F'};
			postChange = new char[] {'D', 'F', 'L', 'B', 'R'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][i][2];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][i][2] = matrix[i][j];
				}
			}
			break;
			
		case "D'" :
			preChange = new char[] {'D', 'F', 'L', 'B', 'R'};
			postChange = new char[] {'D', 'L', 'B', 'R', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][i][2];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][i][2] = matrix[i][j];
				}
			}
			break;
			
		case "E" :
			preChange = new char[] {'L', 'B', 'R', 'F'};
			postChange = new char[] {'F', 'L', 'B', 'R'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][i][1];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][i][1] = matrix[i][j];
				}
			}
			break;
			
		case "E'" :
			preChange = new char[] {'F', 'L', 'B', 'R'};
			postChange = new char[] {'L', 'B', 'R', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][i][1];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][i][1] = matrix[i][j];
				}
			}
			break;
			
		case "F": 
			preChange = new char[] {'F', 'U', 'R', 'D', 'L'};
			postChange = new char[] {'F', 'R', 'D', 'L', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][0][i];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][0][i] = matrix[i][j];
				}
			}
			break;
			
		case "F'":
			preChange = new char[] {'F', 'U', 'R', 'D', 'L'};
			postChange = new char[] {'F', 'L', 'U', 'R', 'D'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][0][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][0][i] = matrix[i][j];
				}
			}
			break;
		
		case "L": 
			preChange = new char[] {'L', 'B', 'D', 'F', 'U'};
			postChange = new char[] {'L', 'U', 'B', 'D', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[0][Math.abs(j-2)][i];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[0][Math.abs(j-2)][i] = matrix[i][j];
				}
			}
			break;
			
		case "L'": 
			preChange = new char[] {'L', 'U', 'B', 'D', 'F'};
			postChange = new char[] {'L', 'B', 'D', 'F', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[0][Math.abs(j-2)][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[0][Math.abs(j-2)][i] = matrix[i][j];
				}
			}
			break;
			
		case "M": 
			preChange = new char[] {'B', 'D', 'F', 'U'};
			postChange = new char[] {'U', 'B', 'D', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[1][Math.abs(j-2)][i];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[1][Math.abs(j-2)][i] = matrix[i][j];
				}
			}
			break;
			
		case "M'": 
			preChange = new char[] {'U', 'B', 'D', 'F'};
			postChange = new char[] {'B', 'D', 'F', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[1][Math.abs(j-2)][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[1][Math.abs(j-2)][i] = matrix[i][j];
				}
			}
			break;
			
		case "R": 
			preChange = new char[] {'R', 'U', 'B', 'D', 'F'};
			postChange = new char[] {'R', 'B', 'D', 'F', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[2][j][i];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[2][j][i] = matrix[i][j];
				}
			}
			break;
			
		case "R'": 
			preChange = new char[] {'R', 'B', 'D', 'F', 'U'};
			postChange = new char[] {'R', 'U', 'B', 'D', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[2][j][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[2][j][i] = matrix[i][j];
				}
			}
			break;
			
		case "S": 
			preChange = new char[] {'U', 'R', 'D', 'L'};
			postChange = new char[] {'R', 'D', 'L', 'U'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][1][i];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][1][i] = matrix[i][j];
				}
			}
			break;
			
		case "S'":
			preChange = new char[] {'U', 'R', 'D', 'L'};
			postChange = new char[] {'L', 'U', 'R', 'D'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][1][i];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][1][i] = matrix[i][j];
				}
			}
			break;
		
		case "U" :
			preChange = new char[] {'U', 'F', 'L', 'B', 'R'};
			postChange = new char[] {'U', 'L', 'B', 'R', 'F'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][Math.abs(i-2)][0];
				}
			}
			matrix = rotateMatrix(matrix, 90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][Math.abs(i-2)][0] = matrix[i][j];
				}
			}
			break;
			
		case "U'" :
			preChange = new char[] {'U', 'L', 'B', 'R', 'F'};
			postChange = new char[] {'U', 'F', 'L', 'B', 'R'};
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					matrix[i][j] = cubiePos[j][Math.abs(i-2)][0];
				}
			}
			matrix = rotateMatrix(matrix, -90, preChange, postChange);
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					cubiePos[j][Math.abs(i-2)][0] = matrix[i][j];
				}
			}
			break;				

		case "x":
			performMoves("R M' L'");
			//turn("R"); turn("M'"); turn("L'");
			break;

		case "x'":
			performMoves("R' M L");
			//turn("R'"); turn("M"); turn("L");
			break;

		case "y":
			performMoves("U E' D'");
			//turn("U"); turn("E'"); turn("D'");
			break;

		case "y'":
			performMoves("U' E D");
			//turn("U'"); turn("E"); turn("D");
			break;

		case "z":
			performMoves("F S B'");
			//turn("F"); turn("S"); turn("B'");
			break;

		case "z'":
			performMoves("F' S' B");
			//turn("F'"); turn("S'"); turn("B");
			break;

		}


	}

	private Cubie[][] rotateMatrix(Cubie[][] orig, int degrees, char[] preChange,
			char[] postChange) {
		Cubie[][] rotated = new Cubie[3][3];
		if(degrees == 90) {
			//Transpose the matrix
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					rotated[i][j] = orig[j][i];
				}
			}
			//Reverse all the rows
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<rotated[0].length/2; j++) {
					Cubie tempCubie = rotated[i][3-j-1];
					rotated[i][3-j-1] = rotated[i][j];
					rotated[i][j] = tempCubie;
				}
			}
		}
		else if(degrees == -90) {
			//Transpose the matrix
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					rotated[i][j] = orig[j][i];
				}
			}
			
			//Reverse all the columns
			for(int i = 0; i<rotated[0].length/2; i++) {
				for(int j = 0; j<3; j++) {
					Cubie tempCubie = rotated[3-i-1][j];
					rotated[3-i-1][j] = rotated[i][j];
					rotated[i][j] = tempCubie;
				}
			}
		}
		
		//Change the direction of all colors appropriately as well before returning the array
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				CubieColor[] tempColors = rotated[i][j].getColors();
				for(int k = 0; k<tempColors.length; k++) {
					int index = 6;
					for(int x = 0; x < preChange.length; x++) {
						if(tempColors[k].getDir() == preChange[x]) {
							index = x;
						}
					}
					if(index<postChange.length)
						tempColors[k].setDir(postChange[index]);
				}
				rotated[i][j].setColors(tempColors);
			}
		}
		return rotated;
	}
	
	public String performMoves(String moves) {
		for(int i = 0; i<moves.length(); i++) {
			if(moves.substring(i, i+1) != " ") { //Only check if there is a meaningful character
				if(i != moves.length()-1) {
					if(moves.substring(i+1, i+2).compareTo("2") == 0) {
						//Turning twice ex. U2
						turn(moves.substring(i, i+1)); 
						turn(moves.substring(i, i+1));
						i++; //Skip the "2" for the next iteration
					}
					else if(moves.substring(i+1,i+2).compareTo("'") == 0) {
						//Making a counterclockwise turn ex. U'
						turn(moves.substring(i, i+2));
						i++; //Skip the apostrophe for the next iteration
					}
					else {
						//Regular clockwise turning
						turn(moves.substring(i, i+1));
					}
				}
				else {
					//Nothing is after the turn letter, so just perform the turn
					turn(moves.substring(i, i+1));
				}
			}
		}
		return moves;
	}

	public void reverseMoves(String moves) {
		for(int i = 0; i<moves.length(); i++) {
			if(moves.substring(i, i+1) != " ") { //Only check if there is a meaningful character
				if(i != moves.length()-1) {
					if(moves.substring(i+1, i+2).compareTo("2") == 0) {
						//Turning twice ex. U2
						turn(moves.substring(i, i+1)); 
						turn(moves.substring(i, i+1));
						i++; //Skip the "2" for the next iteration
					}
					else if(moves.substring(i+1,i+2).compareTo("'") == 0) {
						//Making a clockwise turn ex. U
						turn(moves.substring(i, i+1));
						i++; //Skip the apostrophe for the next iteration
					}
					else {
						//Counterclockwise turning
						turn(moves.substring(i, i+1) + "'");
					}
				}
				else {
					//Nothing is after the turn letter, so perform counterclockwise turn
					turn(moves.substring(i, i+1) + "'");
				}
			}
		}
	}
	
	public String optimizeMoves(String moves) {
		for(int i = 0; i<moves.length(); i++) {
			String move = moves.substring(i, i+1);
			if(!move.equals(" ") && !move.equals("'") && !move.equals("2")) { //Only check if there is a meaningful turn/rotation
				if(i <= moves.length()-3) {
					if(moves.substring(i+1, i+2).compareTo("2") == 0) { //Double turn
						if(i <= moves.length()-4 && moves.charAt(i+3) == moves.charAt(i)) {
							if(i <= moves.length()-5) {
								if(moves.substring(i+4, i+5).compareTo("2") == 0) {
									//Ex. "U2 U2" gets negated
									moves = moves.substring(0, i) + moves.substring(i+5);
									i--;
								} else if(moves.substring(i+4, i+5).compareTo("'") == 0) {
									//Ex. "U2 U'" --> "U"
									moves = moves.substring(0, i) + moves.substring(i, i+1) 
									+ moves.substring(i+5);
									i--;
								} else {
									//Ex. "U2 U" --> "U'"
									moves = moves.substring(0, i) + moves.substring(i, i+1) + "'" 
											+ moves.substring(i+4);
									i--;
								}
							} else {
								//Ex. "U2 U" --> "U'"
								moves = moves.substring(0, i) + moves.substring(i, i+1) + "'" 
										+ moves.substring(i+4);
								i--;
							}
						}
					}
					else if(moves.substring(i+1,i+2).compareTo("'") == 0) { //Clockwise turn
						if(i <= moves.length()-4 && moves.charAt(i+3) == moves.charAt(i)) {
							if(i <= moves.length()-5) {
								if(moves.substring(i+4, i+5).compareTo("2") == 0) {
									//Ex. "U' U2" --> "U"
									moves = moves.substring(0, i) + moves.substring(i, i+1) 
									+ moves.substring(i+5);
									i--;
								} else if(moves.substring(i+4, i+5).compareTo("'") == 0) {
									//Ex. "U' U'" --> "U2"
									moves = moves.substring(0, i) + moves.substring(i, i+1) + "2" 
											+ moves.substring(i+5);
									i--;
								} else {
									//Ex. "U' U" gets negated
									moves = moves.substring(0, i) + moves.substring(i+4);
									i--;
								}
							} else {
								//Ex. "U' U" gets negated
								moves = moves.substring(0, i) + moves.substring(i+4);
								i--;
							}
						}
					}
					else { //Clockwise turn
						if(i <= moves.length()-3 && moves.charAt(i+2) == moves.charAt(i)) {
							if(i <= moves.length()-4) {
								if(moves.substring(i+3, i+4).compareTo("2") == 0) {
									//Ex. "U U2" --> "U' "
									moves = moves.substring(0, i) + moves.substring(i, i+1) + "'" 
											+ moves.substring(i+4);
									i--;
								} else if(moves.substring(i+3, i+4).compareTo("'") == 0) {
									//Ex. "U U'" gets negated
									moves = moves.substring(0, i) + moves.substring(i+4);
									i--;
								} else {
									//Ex. "U U" --> "U2"
									moves = new String(moves.substring(0, i) + moves.substring(i, i+1) + "2" 
											+ moves.substring(i+3));
									i--;
								}
							} else {
								//Ex. "U U" --> "U2"
								moves = new String(moves.substring(0, i) + moves.substring(i, i+1) + "2" 
										+ moves.substring(i+3));
								i--;
							}
						}

					}
				}
			}
		}

		return moves;	
	}
	
	public void scramble(String scramble) {
		//Rotate the cube to get white on top, then return cube to original position at end of scramble
		performMoves("z2 " + scramble + " z2");
	}

	public String makeWhiteCross() {
		String moves = new String();

		while(numWhiteEdgesOriented() != 0) { //Turn sunflower into cross until no white edges remain in the U layer
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(cubiePos[i][j][0].isEdgeCubie()) {
						CubieColor[] tempColors = cubiePos[i][j][0].getColors();
						if(tempColors[0].getColor() == 'W' || tempColors[1].getColor() == 'W') {
							for(int k = 0; k<2; k++) {
								//Check for when the white edge is matched up with the respective face and turn it down
								if((tempColors[k].getColor() == 'R' && tempColors[k].getDir() == 'L') ||
										(tempColors[k].getColor() == 'G' && tempColors[k].getDir() == 'F') ||
										(tempColors[k].getColor() == 'O' && tempColors[k].getDir() == 'R')||
										(tempColors[k].getColor() == 'B' && tempColors[k].getDir() == 'B')) {
									moves+=performMoves(cubiePos[i][j][0].verticalFace(i, j) + "2 ") ;
								}
							}
						}
					}
				}	
			}
			//Turn U to try lining up edges that have not been turned down yet
			moves+=performMoves("U ");
		}
		return optimizeMoves(moves);
	}

	public String makeSunflower() {
		String moves = new String();

		//Brings up white edges in D Layer with white facing down
		if(numWhiteEdgesOriented() < 5) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(cubiePos[i][j][2].isEdgeCubie()) {
						if(cubiePos[i][j][2].getDirOfColor('W') == 'D') {
							moves += prepareSlot(i, j, 0, 'W');
							//Get the vertical plane in which the cubie lies
							char turnToMake = cubiePos[i][j][2].verticalFace(i, j);
							moves += performMoves("" + turnToMake + "2 ");
						}
					}
				}
			}
		}

		//Orients white edges in D Layer with white NOT facing down
		if(numWhiteEdgesOriented() < 5) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(cubiePos[i][j][2].isEdgeCubie()) {
						if(cubiePos[i][j][2].getDirOfColor('W') != 'A' && cubiePos[i][j][2].getDirOfColor('W') != 'D') {
							char vert = cubiePos[i][j][2].verticalFace(i, j);
							moves += prepareSlot(i, j, 0, 'W');
							if(vert == 'F') {
								moves += performMoves("F' U' R ");
							} else if(vert == 'R') {
								moves += performMoves("R' U' B ");
							} else if(vert == 'B') {
								moves += performMoves("B' U' L ");
							} else if(vert == 'L') {
								moves += performMoves("L' U' F ");
							}
						}
					}
				}

			}
		}

		//Brings up white edges in E Layer
		//This one is filled with many if blocks because there are eight different possible orientations for 
		//white edges in the E Layer, with none sharing a common move to bring it into the U layer.
		if(numWhiteEdgesOriented() < 5) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(cubiePos[i][j][1].isEdgeCubie()) {
						CubieColor[] tempColors = cubiePos[i][j][1].getColors();
						for(int k = 0; k<2; k++) {
							if(tempColors[k].getColor() == 'W') {
								/* Depending on the position of the edge, one of the vertical planes it lies
								 * in must be cleared of white edges before bringing it up */
								if(i == 0 && j == 0) {
									if(tempColors[k].getDir() == 'L') {
										moves += prepareSlot(1, 0, 0, 'W') + performMoves("F ");
									} else {
										moves += prepareSlot(0, 1, 0, 'W') + performMoves("L' ");
									}
								}
								else if(i == 2 && j == 0) {
									if(tempColors[k].getDir() == 'F') {
										moves += prepareSlot(2, 1, 0, 'W') + performMoves("R ");
									} else {
										moves += prepareSlot(1, 0, 0, 'W') + performMoves("F' ");
									}
								}
								else if(i == 2 && j == 2) {
									if(tempColors[k].getDir() == 'B') {
										moves += prepareSlot(2, 1, 0, 'W') + performMoves("R' ");
									} else {
										moves += prepareSlot(1, 2, 0, 'W') + performMoves("B ");
									}
								}
								else {
									if(tempColors[k].getDir() == 'B') {
										moves += prepareSlot(0, 1, 0, 'W') + performMoves("L ");
									} else {
										moves += prepareSlot(1, 2, 0, 'W') + performMoves("B' ");
									}
								}
							}
						}
					}
				}

			}
		}

		//Fix any edges that are incorrectly oriented in the U Layer
		//For the sake of reducing movecount, I assigned a set of moves for each position,
		//but a solver may simply make U turns to bring the edge in front and perform "F U' R"
		if(numWhiteEdgesOriented() < 5) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(cubiePos[i][j][0].isEdgeCubie()) {
						if(cubiePos[i][j][0].getDirOfColor('W') != 'A' && cubiePos[i][j][0].getDirOfColor('W') != 'U') {
							char vert = cubiePos[i][j][0].verticalFace(i, j);
							if(vert == 'F') {
								moves += performMoves("F U' R ");
							} else if(vert == 'R') {
								moves += performMoves("R U' B ");
							} else if(vert == 'B') {
								moves += performMoves("B U' L ");
							} else if(vert == 'L') {
								moves += performMoves("L U' F ");
							}
						}
					}
				}

			}
		}

		//If fewer than 4 white edges reached the top layer by the end of this, some white edge was missed
		//(This might happen, say, if bringing an edge up from the E Layer unintentionally brings down an incorrectly
		// oriented edge in the U Layer)
		//Recurse to oriented remaining white edges
		if(numWhiteEdgesOriented() < 4) {
			moves += makeSunflower();
		}

		return optimizeMoves(moves);
	}

	public String prepareSlot(int x, int y, int z, char color) {
		int numUTurns = 0;
		CubieColor[] tempColor = cubiePos[x][y][z].getColors();
		while((tempColor[0].getColor() == color || tempColor[1].getColor() == color) && numUTurns < 5){
			//Keep turning U until the position (x, y, z) is not occupied by a white edge
			performMoves("U");
			tempColor = cubiePos[x][y][z].getColors();
			numUTurns++;
		}

		//Return appropriate amount of U turns
		if(numUTurns == 0 || numUTurns == 4) {
			return "";
		}
		else if(numUTurns == 1) {
			return "U ";
		}
		else if (numUTurns == 2) {
			return "U2 ";
		}
		else return "U' ";
	}

	public int numWhiteEdgesOriented() {
		int numOriented = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(cubiePos[i][j][0].isEdgeCubie()) {
					if(cubiePos[i][j][0].getDirOfColor('W') == 'U') {
						numOriented++;
					}
				}
			}
		}
		return numOriented;
	}

	public String finishWhiteLayer() {
		String moves = new String();
		//At least check once for corners to be inserted/fixed, and repeat as necessary
		moves+=insertCornersInU();
		moves+="\n";
		moves+=insertMisorientedCorners();
		moves+="\n";
		while(whiteCornerinU()) {
			moves+=insertCornersInU();
			moves+="\n";
			moves+=insertMisorientedCorners();
			moves+="\n";
		}
		return optimizeMoves(moves);
	}

	public boolean whiteCornerinU() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(cubiePos[i][j][0].isCornerCubie()) {
					//If a cubie does not have a color, getDirOfColor returns 'A'
					if(cubiePos[i][j][0].getDirOfColor('W') != 'A') 
						return true;
				}
			}
		}
		return false;
	}

	public String insertCornersInU() {
		String moves = new String();

		for(int y = 0; y<3; y++) {
			for(int x = 0; x<3; x++) {
				if(cubiePos[x][y][0].isCornerCubie() && cubiePos[x][y][0].isWhiteCorner()) {
					//Make U turns until cubie is at (2, 0, 0)
					if(x==0) {
						if(y==0) {
							moves+=performMoves("U' "); 
						}
						else {
							moves+=performMoves("U2 "); 
						}
					}
					else {
						if(y==2) {
							moves+=performMoves("U "); 
						}
					}
					//Set x and y = 0 for the next loop to avoid using while loop
					y=0; x=0;

					//Get cubie above respective slot in first layer
					int numUTurns = 0;
					int yRotations = 0;
					while(!whiteCornerPrepared()) { 
						performMoves("U y'"); numUTurns++; yRotations++;
					}
					if(numUTurns == 1) {
						moves += "U ";
					} else if(numUTurns == 2) {
						moves += "U2 ";
					} else if(numUTurns == 3) {
						moves += "U' ";
					}
					if(yRotations == 1) {
						moves+="y' ";
					} else if(yRotations == 2) {
						moves += "y2 ";
					} else if(yRotations == 3) {
						moves += "y ";
					}

					//Insert the cubie
					int numSexyMoves = 0; 
					//Don't worry, the algorithm "R U R' U'" is commonly referred to as the sexy move in the cubing community
					while(!cornerInserted(2, 0, 2)){ 
						performMoves("R U R' U'"); numSexyMoves++;
					}
					if(numSexyMoves == 5) { //5 sexy moves can be condensed into "U R U' R'"
						moves += "U R U' R' ";
					}
					else {
						for(int k = 0; k<numSexyMoves; k++) {
							moves += "R U R' U' ";
						}
					}
				}
			}
		}

		return moves;
	}

	public String insertMisorientedCorners() {
		String moves = new String();
		for(int i = 0; i<4; i++) {
			moves += performMoves("y ");
			if(!cornerInserted(2,0,2)) {
				if(cubiePos[2][0][2].isWhiteCorner()) {
					if(!cornerInserted(2,0,2)) {
						//Use R U R' U' to get corner to U layer, then insert it in appropriate slot
						moves+=performMoves("R U R' U' ");
						moves+=insertCornersInU();
					}
				}
			}
		}
		return moves;
	}

	public boolean whiteCornerPrepared() {
		boolean whiteUp = false; 

		//Figure out whether the corner cubie is even a white corner
		if(cubiePos[2][0][0].isCornerCubie() && cubiePos[2][0][0].getDirOfColor('W') == 'A') {
			return false;
		}

		//If the cubie is a white corner, figure out whether the white sticker is facing up
		if(cubiePos[2][0][0].getDirOfColor('W') == 'U')
			whiteUp = true;

		//Based on whether white is up, check accordingly if the corner is above the appropriate slot
		if(whiteUp) {
			return (cubiePos[2][0][0].getColorOfDir('R') == cubiePos[1][0][1].getColors()[0].getColor() && 
					cubiePos[2][0][0].getColorOfDir('F') == cubiePos[2][1][1].getColors()[0].getColor()	);
		}
		else {
			/*Either the color on the right of the cubie matches its respective center piece OR
			 *the color on the front of the cubie matches its respective center piece 
			 *It is not possible for both to match because if white is not facing up, it will either be facing front or right
			 */
			return (cubiePos[2][0][0].getColorOfDir('R') == cubiePos[2][1][1].getColors()[0].getColor() || 
					cubiePos[2][0][0].getColorOfDir('F') == cubiePos[1][0][1].getColors()[0].getColor());
		}
	}

	public boolean cornerInserted(int x, int y, int z) {
		if(cubiePos[x][y][z].isCornerCubie()) {
			return (cubiePos[x][y][z].getColorOfDir('D') == cubiePos[1][1][2].getColors()[0].getColor() && 
					cubiePos[x][y][z].getColorOfDir('F') == cubiePos[1][0][1].getColors()[0].getColor() &&
					cubiePos[x][y][z].getColorOfDir('R') == cubiePos[2][1][1].getColors()[0].getColor());
		}
		return false;
	}

	public String insertAllEdges() {
		String moves = new String();
		//At least check once for edges to be inserted/fixed, and repeat as necessary
		moves+=insertEdgesInU();
		moves+="\n";
		moves+=insertMisorientedEdges();
		moves+="\n";
		while(nonYellowEdgesInU()) {
			moves+=insertEdgesInU();
			moves+="\n";
			moves+=insertMisorientedEdges();
			moves+="\n";
		}
		return optimizeMoves(moves);
	}

	public boolean nonYellowEdgesInU() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(cubiePos[i][j][0].isEdgeCubie()) {
					//If a cubie does not have a color, getDirOfColor returns 'A'
					if(cubiePos[i][j][0].getDirOfColor('Y') == 'A') 
						return true;
				}
			}
		}
		return false;
	}

	public String insertEdgesInU() {
		String moves = new String();
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(cubiePos[i][j][0].isEdgeCubie() && cubiePos[i][j][0].getDirOfColor('Y') == 'A') {
					//Make U turns to get cubie to (1, 0, 0)
					if(j==1) {
						if(i==0) {
							moves+=performMoves("U' ");
						} else {
							moves+=performMoves("U ");
						}
					}
					else if(j==2){
						moves+=performMoves("U2 ");
					}

					//Get cubie above respective slot in second layer
					int numUTurns = 0;
					int yRotations = 0;
					while(cubiePos[1][0][0].getColorOfDir('F') != cubiePos[1][0][1].getColors()[0].getColor()) { 
						performMoves("U y' "); numUTurns++; yRotations++;
					}
					//Add appropriate amount of U turns to moves
					if(numUTurns == 1) {
						moves += "U ";
					} else if(numUTurns == 2) {
						moves += "U2 ";
					} else if(numUTurns == 3) {
						moves += "U' ";
					}
					if(yRotations == 1) {
						moves+="y' ";
					} else if(yRotations == 2) {
						moves += "y2 ";
					} else if(yRotations == 3) {
						moves += "y ";
					}

					//Insert the cubie in appropriate direction
					if(cubiePos[1][0][0].getColorOfDir('U') == cubiePos[0][1][1].getColors()[0].getColor()) {
						moves += performMoves("U' L' U L U F U' F' ");
					}
					else if(cubiePos[1][0][0].getColorOfDir('U') == cubiePos[2][1][1].getColors()[0].getColor()){
						moves += performMoves("U R U' R' U' F' U F ");
					}

					//Reset i and j to continue checking for edges to be inserted (foregoes use of while loop)
					i = 0; j = 0;
				}
			}
		}
		return moves;
	}

	public String insertMisorientedEdges() {
		String moves = new String();
		for(int i = 0; i<4; i++) {
			moves += performMoves("y ");
			if(cubiePos[2][0][1].getDirOfColor('Y') == 'A' &&
					cubiePos[2][0][1].getColorOfDir('F') != cubiePos[1][0][1].getColors()[0].getColor()) {
				//If the edge is the the correct slot but oriented incorrectly, perform an algorithm for this special case
				if(cubiePos[2][0][1].getColorOfDir('F') == cubiePos[2][1][1].getColors()[0].getColor() &&
						cubiePos[2][0][1].getColorOfDir('R') == cubiePos[1][0][1].getColors()[0].getColor()) {
					moves += performMoves("R U R' U2 R U2 R' U F' U' F ");
				}
				else {
					//If there is an edge that does not belong in the slot at all, take it out and insert in correct slot
					moves+=performMoves("R U R' U' F' U' F ");
					moves+=insertEdgesInU();
				}
			}
		}
		return moves;
	}

	public int numYellowEdgesOriented(){
		int numOriented = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(cubiePos[i][j][0].isEdgeCubie() && cubiePos[i][j][0].getDirOfColor('Y') == 'U')
					numOriented++;
			}
		}
		return numOriented;
	}

	public int numYellowCornersOriented(){
		int numOriented = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(cubiePos[i][j][0].isCornerCubie() && cubiePos[i][j][0].getDirOfColor('Y') == 'U')
					numOriented++;
			}
		}
		return numOriented;
	}

	public String yellowEdgeOrientation() {
		String status = new String();
		int numOriented = numYellowEdgesOriented();

		if(numOriented == 4) { //The cross has already been made
			status = "Cross";
		}
		else if(numOriented == 0) { //No edges are oriented
			status = "Dot";
		}
		else if(numOriented == 2) {
			//If two edges are oriented, they either form an L-shape or a Bar
			int[] xValues = new int[2];
			int index = 0;
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(cubiePos[i][j][0].isEdgeCubie() && cubiePos[i][j][0].getDirOfColor('Y') == 'U') {
						xValues[index] = i; index++;
					}
				}
			}
			if(Math.abs(xValues[0]-xValues[1])%2 == 0) {
				status = "Bar";
			} else {
				status = "L";
			}
		}

		return status;
	}

	public String makeYellowCross() {
		String moves = new String();
		String status = yellowEdgeOrientation();

		if(status.compareTo("Dot") == 0) {
			//Make an L and then subsequently use the algorithm to orient the edges
			moves += performMoves("F R U R' U' F' U2 F U R U' R' F' ");
		}
		else if(status.compareTo("L") == 0) {
			//Position the L appropriately first
			while(cubiePos[0][1][0].getDirOfColor('Y') != 'U' || cubiePos[1][2][0].getDirOfColor('Y') != 'U') {
				moves += performMoves("U ");
			}
			moves += performMoves("F U R U' R' F' ");
		}
		else if(status.compareTo("Bar") == 0) {
			//Position the Bar appropriately first
			while(cubiePos[0][1][0].getDirOfColor('Y') != 'U' || cubiePos[2][1][0].getDirOfColor('Y') != 'U') {
				moves += performMoves("U ");
			}
			moves += performMoves("F R U R' U' F' ");
		}
		return optimizeMoves(moves);
	}

	public String orientLastLayer() {
		String moves = new String();
		int numOriented = numYellowCornersOriented();
		//Used while loop since Antisune case requires Sune algorithm to be perform twice for proper orientation
		while(numOriented != 4) {
			if(numOriented == 0){
				//Turn until there is a yellow sticker on the left of the ULF piece
				while(cubiePos[0][0][0].getDirOfColor('Y') != 'L') {
					moves += performMoves("U ");
				}
				//Perform Sune algorithm to orient one corner
				moves += performMoves("R U R' U R U2 R' ");
			}
			else if(numOriented == 1){
				//Sune case
				while(cubiePos[0][0][0].getDirOfColor('Y') != 'U') {
					moves += performMoves("U ");
				}
				moves += performMoves("R U R' U R U2 R' ");
			}
			else if(numOriented == 2){
				//Turn until there is a yellow sticker on the front of the ULF piece
				while(cubiePos[0][0][0].getDirOfColor('Y') != 'F') {
					moves += performMoves("U ");
				}
				//Perform Sune algorithm to orient one corner
				moves += performMoves("R U R' U R U2 R' ");
			}
			//Re-check the number of corners oriented
			numOriented = numYellowCornersOriented();
		}
		return optimizeMoves(moves);
	}

	public String permuteLastLayer() {
		String moves = new String();
		//Check the number of "headlights" that exist, i.e. adjacent corners with the same color facing one direction
		//If there are 4 headlights, the corners are already permuted
		int numHeadlights = 0;
		for(int i = 0; i<4; i++) {
			turn("y"); //Since we are rotating 4 times, the cube is unaffected in the end
			if(cubiePos[0][0][0].getColorOfDir('F') == cubiePos[2][0][0].getColorOfDir('F'))
				numHeadlights++;
		}

		//Permute the corners
		if(numHeadlights == 0){ //If no headlights, create headlights first
			moves += performMoves("R' F R' B2 R F' R' B2 R2 ");
			numHeadlights = 1;
		}
		if(numHeadlights == 1) {
			while(cubiePos[0][2][0].getColorOfDir('B') != cubiePos[2][2][0].getColorOfDir('B')) {
				moves += performMoves("U ");
			}
			moves += performMoves("R' F R' B2 R F' R' B2 R2 ");
		}

		//Now permute the edges after finding out how many edges are already solved
		int numSolved = 0;
		for(int i = 0; i<4; i++) {
			turn("y");
			if(cubiePos[0][0][0].getColorOfDir('F') == cubiePos[1][0][0].getColorOfDir('F'))
				numSolved++;
		}
		if(numSolved == 0) { //If no edges are solved, this will solve one edge
			moves += performMoves("R2 U R U R' U' R' U' R' U R' ");
			numSolved = 1;
		}
		if(numSolved == 1){
			//Use either the clockwise or counterclockwise edge rotation algorithm to solve all corners
			while(cubiePos[0][2][0].getColorOfDir('B') != cubiePos[1][2][0].getColorOfDir('B')) {
				moves += performMoves("U ");
			}
			if(cubiePos[1][0][0].getColorOfDir('F') == cubiePos[0][0][0].getColorOfDir('L')) {
				moves += performMoves("R2 U R U R' U' R' U' R' U R' ");
			}
			else {
				moves += performMoves("R U' R U R U R U' R' U' R2 ");
			}
		}

		//Adjust the U layer to finish the cube!
		while(cubiePos[0][0][0].getColorOfDir('F') != cubiePos[1][0][1].getColors()[0].getColor()) {
			moves += performMoves("U ");
		}

		return optimizeMoves(moves);
	}

	public char[][][] getColors() {
		char[][][] allSets = new char[6][3][3];
		//All 2D arrays are row-major
		char[][] left = new char[3][3];
		char[][] up = new char[3][3];
		char[][] front = new char[3][3];
		char[][] back = new char[3][3];
		char[][] right = new char[3][3];
		char[][] down = new char[3][3];

		//NOTE: the logic following may seem confusing because we need to store the colors as *they will be displayed*.
		//This means, for example, that the left side of the cube will be rotated 90 degrees clockwise such that
		//when displayed, it looks as if it is directly "connected" to the yellow (U) face.

		//Populate left colors, constant x
		for(int y = 2; y>=0; y--) {
			for(int z = 2; z>=0; z--) {
				left[Math.abs(y-2)][Math.abs(z-2)] = cubiePos[0][y][z].getColorOfDir('L');
			}
		}
		//Up colors, constant z
		for(int x = 0; x<=2; x++) {
			for(int y = 2; y>=0; y--) {
				up[Math.abs(y-2)][x] = cubiePos[x][y][0].getColorOfDir('U');
			}
		}
		//Front colors, constant y
		for(int z = 0; z<=2; z++) {
			for(int x = 0; x<=2; x++) {
				front[z][x] = cubiePos[x][0][z].getColorOfDir('F');
			}
		}
		//Back colors, constant y
		for(int x = 0; x<=2; x++) {
			for(int z = 2; z>=0; z--) {
				back[Math.abs(z-2)][x] = cubiePos[x][2][z].getColorOfDir('B');
			}
		}
		//Right colors, constant x
		for(int y = 2; y>=0; y--) {
			for(int z = 0; z<=2; z++) {
				right[Math.abs(y-2)][z] = cubiePos[2][y][z].getColorOfDir('R');
			}
		}
		//Down colors, constant z
		for(int x = 2; x>=0; x--) {
			for(int y = 2; y>=0; y--) {
				down[Math.abs(y-2)][Math.abs(x-2)] = cubiePos[x][y][2].getColorOfDir('D');
			}
		}

		allSets[0] = left; allSets[1] = up; allSets[2] = front; allSets[3] = back;
		allSets[4] = right; allSets[5] = down;

		return allSets;
	}

	public void setCubieColor(int x, int y, int z, char dir, char ncolor) {
		cubiePos[x][y][z].setColorOfDir(dir, ncolor);
	}

	public void testTurning() {
		for(int i = 0; i<cubiePos.length; i++) {
			for(int j = 0; j<cubiePos[0].length; j++) {
				for(int k = 0; k<cubiePos[0][0].length; k++) {
					CubieColor[] tempColor = cubiePos[i][j][k].getColors();
					System.out.print(i + ", " + j + ", " + k + ", ");
					for(int l = 0; l<tempColor.length; l++) {
						System.out.print(tempColor[l].getColor() + ", " + tempColor[l].getDir() + ", ");
					}
					System.out.println();
				}
			}
		}
	}

    public static void main(String[] args)
    {
        	Cube cube = new Cube();
		String allMoves = new String("");
        
		String sunflower = cube.makeSunflower();
		allMoves = allMoves.concat(cube.optimizeMoves(sunflower));
		
		String whiteCross = cube.makeWhiteCross();
		allMoves = allMoves.concat(cube.optimizeMoves(whiteCross));

		String whiteCorners = cube.finishWhiteLayer();
		allMoves = allMoves.concat(cube.optimizeMoves(whiteCorners));
		
		String edges = cube.insertAllEdges();
		allMoves = allMoves.concat(cube.optimizeMoves(edges));
		
		String yellowCross = cube.makeYellowCross();
		allMoves = allMoves.concat(cube.optimizeMoves(yellowCross));
		
		String OLL = cube.orientLastLayer();
		allMoves = allMoves.concat(cube.optimizeMoves(OLL));
		
		String PLL = cube.permuteLastLayer();
		allMoves = allMoves.concat(cube.optimizeMoves(PLL));
		allMoves = allMoves.replaceAll("\\n", " ");		
		try
		{
			FileWriter fw = new FileWriter("moves.txt"); //specify file location
			fw.write(allMoves + "\n");
			fw.close();
		}catch(Exception e){System.out.println(e);}
    }
}
