void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  //println(mouseX, mouseY);

  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill((mouseX * mouseY) / 353, mouseX / 1.25, mouseY / 1.25);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseX / 1.25, mouseY / 1.25, (mouseX * mouseY) / 353);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's eyes
  fill(0);

  // remove the forward slashes in front of each line of code below one at a time. Remove the underline and replace with the proper code to allow your mouse to move Zoog around  💻

  fill(mouseX, mouseX, mouseY);
  ellipse(mouseX - 10, mouseY - 30,16,32);
  fill(mouseY, mouseY, mouseX);
  ellipse(mouseX + 10, mouseY - 30,16,32);
  // Draw Zoog's legs
  stroke(0);
  line(mouseX - 10, mouseY + 50, mouseX - 20, mouseY + 60);
  line(mouseX + 10, mouseY + 50, mouseX + 20, mouseY + 60);
}

void mousePressed(){
  println("Take me to your leader!?!");
}