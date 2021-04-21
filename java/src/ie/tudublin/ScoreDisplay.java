package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}

public class Note 
{
	private Char privateNote;
	private Int privateDuration;

	public Note(char x, int y) {
		privateNote = x;
		privateDuration = y;
	}

	public static void Note(String[] args) {
		Note myObj = new Note(); // Create an object of class Main (This will call the constructor)
	  }
	
	public String toString(){ 
		return privateNote+" "+privateDuration;  
	   }  

}