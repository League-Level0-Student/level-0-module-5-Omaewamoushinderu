void setup(){
  PImage imagination = loadImage("imagination.jpg");
   size(800,600);
    imagination.resize(width,height);
    background(imagination);
    
   

}

void draw(){
  fill(255,255,255);
  ellipse(460,250,115,115);
   ellipse(350,250,115,115);
 fill(0);
ellipse(mouseX, mouseY,10,10);
ellipse(mouseX + 110,mouseY,10,10); 

}