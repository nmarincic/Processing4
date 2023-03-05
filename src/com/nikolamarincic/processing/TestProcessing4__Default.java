package com.nikolamarincic.processing;

import processing.core.PApplet;

public class TestProcessing4__Default extends PApplet {

	public static void main(String[] args) {
		PApplet.main("com.nikolamarincic.processing.TestProcessing4__Default");
	}
	
	public void settings() {
		size(1920,1080);	
	}
	
	public void setup() {
		frameRate(25);
		
	}
	
	public void draw() {
		int r = (int) random(255);
		int g = (int) random(255);
		int b = (int) random(255);
		background(r,g,b);
	}
}
