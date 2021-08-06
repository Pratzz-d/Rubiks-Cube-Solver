class Move {
  float angle = 0;
  char axis;
  int value;
  int dir;
  boolean animating = false;
  boolean finished = false;

  Move(char axis, int value, int dir) {
    this.axis = axis;
    this.value = value;
    this.dir = dir;
  }

  Move copy() {
    return new Move(axis,value, dir);
  }

  void reverse() {
    dir *= -1;
  }

  void start() {
    animating = true;
    finished = false;
    this.angle = 0;
  }

  boolean finished() {
    return finished;
  }

  void update() {
    if (animating) {
      angle += dir * speed;
      if (abs(angle) > HALF_PI) 
      {
        angle = 0;
        animating = false;
        finished = true;
        if (axis == 'z') 
        {
          turnZ(value, dir);
        } 
        else if (axis == 'x') 
        {
          turnX(value, dir);
        } 
        else if (axis == 'y') 
        {
          turnY(value, dir);
        }
      }
    }
  }
}
