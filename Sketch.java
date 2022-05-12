import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }
float circleX = 150;
float circleT = 150;
float[] circleY = new float[25];
  public void setup() {
    background(210, 255, 173);
     for (int i = 0; i < circleY.length; i++) {
    circleY[i] = random(height);
  }
}
  

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    background(50);
fill(255);
  for (int i = 0; i < circleY.length; i++) {
    float circleX = width * i / circleY.length;
    ellipse(circleX, circleY[i], 25, 25);

    circleY[i]++;

    if (circleY[i] > height) {
      circleY[i] = 0;
        }
  if(keyPressed){
      if (keyCode == UP) {
          circleY[i]=circleY[i]+1/2;
       
    }
    else if(keyCode == DOWN){
     circleY[i]=circleY[i]+5;
    }
  }
  else{
circleY[i]=circleY[i]+2;
  }

  }
  
  if (keyPressed) {
    if (keyCode == UP) {
      circleT--;
    } 
    else if (keyCode == DOWN) {
      circleT++;
    } 
    else if(keyCode == LEFT){
      circleX--;
    }
    else if(keyCode == RIGHT){
     circleX++; 
    }
  } 
  fill(0,0,255);
  ellipse(circleX, circleT, 10, 10);


  fill(255,0,0);
  rect(275,5,20,20);
  rect(252,5,20,20);
  rect(229,5,20,20);
  }
}
  
  
  



  
  // define other methods down here.
