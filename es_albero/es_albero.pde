Albero a1, a2, t1, t2;
Stella s1;

public void setup()
{
  size(640,360);
  s1 = new Stella(width/3,height-height/1.5,height-height/1.3,width/10);
  a1 = new Albero(width/3,height-height/8,width/6,height-height/2);
  a2 = new Albero(2*width/3,height-height/8,width/6,height-height/2);  
}

public void draw(){
  background(251,221,160);
  
  s1.draw();
  a1.draw();
  a2.draw();
}
