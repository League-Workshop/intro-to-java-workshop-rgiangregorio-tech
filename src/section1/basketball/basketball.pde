int xposition = 700;
int yposition = 700;
int xspeed = 7;
int yspeed = 10;

PImage building;

PImage basketball;

void setup() {

  size(700, 700);
  
  building = loadImage("building.jpeg");
  basketball = loadImage("basketball.jpeg");
}



void draw() {

  background(#E8732F);
  
  image(building, 0, 0, 700, 700);

  if (mousePressed) {

image(basketball, xposition, yposition, 300, 300);

    fill(#4C55A0);
  } else {
    fill(#2FE871);
  }
  if (yposition > width) {
    yspeed = -yspeed;
  }
  if (yposition < 0) {
    yspeed = -yspeed;
  }
  if (xposition > height) {
    xspeed = -xspeed;
  }
  if (xposition < 0) {
    xspeed = -xspeed;
  }

  //ellipse(xposition, yposition, 100, 100);
  
  image(basketball, xposition, yposition, 100, 100);

  xposition = xposition + xspeed;
  yposition = yposition + yspeed;
}
