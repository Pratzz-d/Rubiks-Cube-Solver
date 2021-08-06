import peasy.*;
import java.io.*;
PeasyCam cam;

char[][] cols = new char[6][9];
float speed = 0.5;
int dim = 3;
Cubie[] cube = new Cubie[dim*dim*dim];
String meh = new String();
int counter = 0;
int movecounter = 1;
boolean started = false;
Move currentMove;

Move[] allMoves = new Move[] {
  new Move('y',1, -1), //D
  new Move('y',1, 1), //d
  new Move('y',-1, -1), //U'
  new Move('y',-1, 1), //U
  new Move('x',1, -1), //R'
  new Move('x',1, 1), //R
  new Move('x',-1, 1), //L'
  new Move('x',-1, -1), //L
  new Move('z',1, -1), //F'
  new Move('z',1, 1), //F
  new Move('z',-1, 1), //B'
  new Move('z',-1, -1), //B
  new Move('x',0,-1), //M
  new Move('x',0,1), //M'
  new Move('y',0,-1), //E
  new Move('y',0,1), //E'
  new Move('z',0,1), //S
  new Move('z',0,-1), //S'
};

void setup() {
  size(600, 600, P3D);
  //fullScreen(P3D);
  cam = new PeasyCam(this, 400);
  int index = 0;
  for (int x = -1; x <= 1; x++) {
    for (int y = -1; y <= 1; y++) {
      for (int z = -1; z <= 1; z++) {
        PMatrix3D matrix = new PMatrix3D();
        matrix.translate(x, y, z);
        cube[index] = new Cubie(matrix, x, y, z);
        index++;
      }
    }
  }
  stringreader();
  setcolour();
  meh = setseq();
  currentMove = allMoves[getint(meh.charAt(counter))];
  counter++;
  currentMove.start();
}

void draw() {
  background(51); 

  cam.beginHUD();
  fill(255);
  textSize(32);
  text(movecounter, 100, 100);
  cam.endHUD();

  rotateX(-0.5);
  rotateY(0.4);
  rotateZ(0.1);
  currentMove.update();
  
  if (currentMove.finished()) 
  {
    if (counter < meh.length()-1)
    {
      counter++;
      if(meh.charAt(counter) != ' ')
      {

          //System.out.println("x"+meh.charAt(counter)+"x");
          currentMove = allMoves[getint(meh.charAt(counter))];
          movecounter++;
          currentMove.start();
      }
    }
  }
  scale(50);
  for (int i = 0; i < cube.length; i++) {
    push();
    if (currentMove.axis == 'z' && cube[i].z == currentMove.value) {
      rotateZ(currentMove.angle);
    } 
    else if (currentMove.axis == 'x' && cube[i].x == currentMove.value) {
      rotateX(currentMove.angle);
    } 
    else if (currentMove.axis == 'y' && cube[i].y == currentMove.value) {
      rotateY(-currentMove.angle);
    }   
    cube[i].show();
    pop();
  }
}
