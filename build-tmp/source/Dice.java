import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	noLoop();
	size(640, 480);
}
public void draw()
{
	for (int x = 0; x < 640; x += 40) {
		for (int y = 0; y < 480; y += 40) {
			Die die1 = new Die(x,y);
			die1.show();
			die1.roll();
		}
	}


}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int dieX, dieY, rollNum;
	Die(int x, int y) //constructor
	{
		dieX = x;
		dieY = y;

	}
	public void roll()
	{
		//Random Roll
		rollNum = (int)(Math.random()*6)+1;

		//Rolls
		if (rollNum == 1){
			ellipse(dieX+20, dieY+20, 10, 10);
		}
		else if (rollNum == 2){
			ellipse(dieX+10, dieY+10, 10, 10);
			ellipse(dieX+30, dieY+30, 10, 10);
		}
		else if (rollNum == 3){
			ellipse(dieX+10, dieY+10, 10, 10);
			ellipse(dieX+20, dieY+20, 10, 10);
			ellipse(dieX+30, dieY+30, 10, 10);
		}
		else if (rollNum == 4){
			ellipse(dieX+10, dieY+10, 10, 10);
			ellipse(dieX+30, dieY+10, 10, 10);
			ellipse(dieX+10, dieY+30, 10, 10);
			ellipse(dieX+30, dieY+30, 10, 10);
		}
		else if (rollNum == 5){
			ellipse(dieX+10, dieY+10, 10, 10);
			ellipse(dieX+30, dieY+10, 10, 10);
			ellipse(dieX+10, dieY+30, 10, 10);
			ellipse(dieX+30, dieY+30, 10, 10);
			ellipse(dieX+20, dieY+20, 10, 10);
		}
		else if (rollNum == 6){
			ellipse(dieX+10, dieY+10, 10, 10);
			ellipse(dieX+10, dieY+20, 10, 10);
			ellipse(dieX+10, dieY+30, 10, 10);
			ellipse(dieX+30, dieY+10, 10, 10);
			ellipse(dieX+30, dieY+20, 10, 10);
			ellipse(dieX+30, dieY+30, 10, 10);
		}
	}
	public void show()
	{
		fill(255);
		rect(dieX, dieY, 40, 40);
		fill(0);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
