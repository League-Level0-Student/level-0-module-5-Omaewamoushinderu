void setup(){
  PImage imagination = loadImage("imagination.jpg");
   size(800,600);
    imagination.resize(width,height);
    background(imagination);
    
    

}

void draw(){
  ellipse(460,250,115,115);
   ellipse(350,250,115,115);
}