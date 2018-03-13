PImage mustache; 
PImage friend;
void setup (){

   friend = loadImage("nyan.png");
size(800, 600);
friend.resize(width,height);
}
void draw (){
 background(friend); 
}