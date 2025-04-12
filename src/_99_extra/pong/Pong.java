package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600; 
    int y = 400;
    int x = 400; 
    int ySpeed = 5;
    int xSpeed = 5;  
    int key1; 
    int key2;
   

    @Override
    public void settings() {
        size(WIDTH, HEIGHT); 
        
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw () {
    	background(0, 0, 0, 0);
    	fill(255, 255, 255, 255); 
    	ellipse(x, y,  15, 15);
    	x+=xSpeed;
    	y+=ySpeed;  
    	if(x > width){
    	    xSpeed = -xSpeed;
    	}
    	if(y > height){
    	    ySpeed = -ySpeed;
    	}
    	
    	if(x < 0){
    		 xSpeed = -xSpeed;
    	}
    	if(y < 0){
    		 ySpeed = -ySpeed;
    	}
    	 rect(5, key1,  7, 60); 
    	 rect(790, key2,  7, 60); 
    	
    	
    	
    	
    	
 
    } 
    @Override
    public void keyReleased() {
    	// TODO Auto-generated method stub
    	super.keyPressed(); 
    	System.out.println(keyCode);
    
    if(keyCode == 38) {
    	if(key2 > 0)
    	key2 -= 40; 
    
    }  
    
    if(keyCode == 40) {
    	if(key2 < 540 )
    	key2 += 40;
    } 
    
    if(keyCode == 87) {
    	if(key1 > 0)
    	key1 -= 40;
    } 
    if(keyCode == 83) {
    	if(key1 < 540)
    	key1 += 40;
    }

}
    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    
}
}