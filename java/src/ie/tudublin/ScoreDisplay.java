package ie.tudublin;

import java.util.ArrayList;

import javafx.scene.shape.Ellipse;
//import java.util.*;
import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();
	
	public void settings()
	{
		size(2000, 1800);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore(score);
		printScores();
	}

	public void loadScore(String s)
	{
		for (int n = 0; n < s.size()-1; n++){
            if(s.isDigit(n)){
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

	public void printScores() 
	{
		// Looping ArrayList using Iterator
		Iterator it = notes.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public void draw()
	{
		background(255);

		rect(200,400,800,5);
		rect(200,250,800,5);
		rect(200,325,800,5);
		rect(200,475,800,5);
		rect(200,550,800,5);

	}

	void drawNotes()
	{

        for (int n : notes){
            if(notes.get(n).charAt(1).equals('1')){
                if(notes.get(n).equals('D')){
                    ellipse(250, 600, 50, 50);
                    line(300, 575, 300 , 400);
                } else if(notes.get(n).equals('E')){
                    ellipse(350, 575, 50, 50);
                    line(400, 550, 400 , 500);
				}
				else if(notes.get(n).equals('F')){
                    ellipse(450, 550, 50, 50);
                    line(500, 525, 500 , 600);
				}				
				else if(notes.get(n).equals('G')){
                    ellipse(550, 525, 50, 50);
					line(600, 500, 600 , 700);
				}
				else if(notes.get(n).equals('A')){
                    ellipse(650, 500, 50, 50);
                    line(700, 475, 700 , 800);
				}
				else if(notes.get(n).equals('B')){
                    ellipse(750, 475, 50, 50);
                    line(800, 450, 800 , 900);
				}
				else if(notes.get(n).equals('c')){
                    ellipse(850, 450, 50, 50);
                    line(900, 425, 900 , 1000);
				}
				else if(notes.get(n).equals('d')){
                    ellipse(950, 425, 50, 50);
                    line(1000, 400, 1000 , 1100);
                }
			}
			else {
                if(notes.get(n).equals('D')){
                    ellipse(250, 600, 50, 50);
					line(300, 575, 300, 400);
					line(300, 400, 325, 375)
                } else if(notes.get(n).equals('E')){
                    ellipse(350, 575, 50, 50);
					line(400, 550, 400 , 500);
					line(400, 500, 425, 475);
				}
				else if(notes.get(n).equals('F')){
                    ellipse(450, 550, 50, 50);
					line(500, 525, 500 , 600);
					line(500, 600, 525 , 575);
				}				
				else if(notes.get(n).equals('G')){
                    ellipse(550, 525, 50, 50);
					line(600, 500, 600 , 700);
					line(600, 700, 625 , 675);
				}
				else if(notes.get(n).equals('A')){
                    ellipse(650, 500, 50, 50);
					line(700, 475, 700 , 800);
					line(700, 800, 725 , 775);
				}
				else if(notes.get(n).equals('B')){
                    ellipse(750, 475, 50, 50);
					line(800, 450, 800 , 900);
					line(800, 900, 825 , 875);
				}
				else if(notes.get(n).equals('c')){
                    ellipse(850, 450, 50, 50);
					line(900, 425, 900 , 1000);
					line(900, 1000, 925 , 975);
				}
				else if(notes.get(n).equals('d')){
                    ellipse(950, 425, 50, 50);
					line(1000, 400, 1000 , 1100);
					line(1000, 1100, 1025 , 1075);
                }
			}
        }
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
	   String print = note + " " + duration;

        if(duration == 1){
            print += " Quaver";
        } else {
            print += " Crotchet";
        }
     	return print;
	}
}