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
	size (800,800);
	noLoop();
	textSize(32);
}

public void draw()
{
	background(197);
	int numDots=0;
	for (int x=1; x<800; x+=20)
	{
		for(int y=1; y<700; y+=20)
		{
			Die sue = new Die (x,y);
			sue.show();

			numDots=numDots+sue.numDots;
		
    	}
    }
    fill(0,(int)(Math.random()*256),(int)(Math.random()*256));
   	text("Total Roll: " + numDots, 300,750);
}

public void mousePressed()
{
	redraw();
}

class Die //models one single dice cube
{
	int myX, myY,numDots;
	//variable declarations here
	Die(int x, int y) //constructor
	{
		myX=x;
		myY=y;//variable initializations here
		roll();
	}
	public void roll()
	{
		numDots=(int)(Math.random()*7)+1;
	}
	public void show()
	{
		rect(myX,myY,20,20);
		if (numDots==1)
		{
		ellipse(myX+10,myY+10,3,3);
		}
		if (numDots==2)
		{
		ellipse(myX+5,myY+5,3,3);
		ellipse(myX+15,myY+15,3,3);
		fill((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		}
		if (numDots==3)
		{
		ellipse(myX+5,myY+5,3,3);
		ellipse(myX+10,myY+10,3,3);
		ellipse(myX+15,myY+15,3,3);
		
		}
		if (numDots==4)
		{
		ellipse(myX+5,myY+5,3,3);
		ellipse(myX+5,myY+15,3,3);
		ellipse(myX+15,myY+15,3,3);
		ellipse(myX+15,myY+5,3,3);
		
		}
		if (numDots==5)
		{
		ellipse(myX+5,myY+5,3,3);
		ellipse(myX+5,myY+15,3,3);
		ellipse(myX+15,myY+15,3,3);
		ellipse(myX+10,myY+10,3,3);
		ellipse(myX+15,myY+5,3,3);
		}
		if (numDots==6)
		{
		ellipse(myX+5,myY+5,3,3);
		ellipse(myX+5,myY+15,3,3);
		ellipse(myX+5,myY+10,3,3);
		ellipse(myX+15,myY+15,3,3);
		ellipse(myX+15,myY+5,3,3);
		ellipse(myX+15,myY+10,3,3);
		}
	
		//your code here
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
