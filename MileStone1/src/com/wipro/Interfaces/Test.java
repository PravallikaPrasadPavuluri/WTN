package com.wipro.Interfaces;
import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;
public class Test {
	public static void main(String args[]) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        Playable play1, play2; 
        play1 = new Veena();
        play2 = new Saxophone();
        veena.play(); 
        saxophone.play(); 
        play1.play(); 
        play2.play();
        
    }
}
