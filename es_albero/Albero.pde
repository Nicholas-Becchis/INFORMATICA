class Albero{
    private float x;
    private float y;
    private float h;
    private float w;
    
    public static final color COLORE_FOGLIE = #00DD00;
    public static final color COLORE_TRONCO = #964b00;
    
    Albero(float x, float y, float w, float h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public void draw(){
        fill(COLORE_TRONCO);
        rect(x-w/2+w/3, y-y/10+h/10, w/3, h/2);
        
        fill(COLORE_FOGLIE);
        triangle(x-w/2, y, x, y-h, x+w/2, y);
    }
}
