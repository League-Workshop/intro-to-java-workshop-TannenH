PImage mustache;
PImage friend;
PImage hat;
  
void setup() {
friend = loadImage("Man.jpg");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("Mustache.png");
mustache.resize(100,100);
hat = loadImage("Hat.png");
hat.resize(200,200);
}

void draw(){

background(friend);
if(mouseButton == LEFT){
image(mustache, mouseX - 50, mouseY - 50);
}
if(mouseButton == RIGHT){
image(hat, mouseX - 100, mouseY - 150);
}
}