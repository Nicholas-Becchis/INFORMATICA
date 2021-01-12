class Stella{
    private float x;
    private float y;
    private float h;
    private float w;
    
    public static final color COLORE_STELLA  = #FFFF00;
    public static final color COLORE_CODA    = #FFDD00;
    
    Stella(float x, float y, float w, float h){
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    }
    
    public void draw(){
    fill(COLORE_STELLA);
    triangle(x-w/2,y,x,y-h,x+w/2,y);
    
    fill(COLORE_CODA);
    triangle(x,y-h/3,x-w*2,y-h*1.2,(x+w/2)-w*2.5,y+h/2);
    
    fill(COLORE_STELLA);
    triangle(x-w/2,y-y/3,x,y+h/3,x+w/2,y-y/3);
    
    if (x<800){     
      x++;     
    }
    else{
          
       x=0;
    }
    }
}
