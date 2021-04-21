package ie.tudublin;

import java.util.ArrayList;
import java.util.*;
import processing.core.PApplet;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();
	
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
		loadScore(score);
		printScores(m);
	}

	public void loadScore(String score)
	{
		for (int n; n = 0; n < score.length()-1){
            if(score.isDigit(n)){
                char c = n;
                int i = c - '0';
                if(i == 2){
                    note = new Note(n, 2);
                    a = note.toString();
                } else {
                    note = new Note(n, 1);
                    a = note.toString();
                }
            } else {
                note = new Note(n, 1);
                a = note.toString();
            }
            notes.add(a);

        }
	}

	public void printScores(notes m) 
	{
		// Looping ArrayList using Iterator
		Iterator it = numbers.iterator();

		while (it.hasNext())
		System.out.print(it.next() + " ");
	}

	public void draw()
	{
		background(255);
		graphics.drawLine(100, 25, 100, 225);
		graphics.drawLine(115, 25, 115, 225);
		graphics.drawLine(130, 25, 130, 225);
		graphics.drawLine(145, 25, 145, 225);
		
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
	
	public String toString(){ 
		return privateNote+" "+privateDuration;  
	   }  

}