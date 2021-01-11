String mex = "Tantissimi auguri di buon Natale a tutti quanti. \nBuone feste \nNicholas";  //messaggio che comparirà sul biglietto
PFont font; 
final color nero = color(0,0,0); //variabile "nero" contiene appunto il colore nero

float x = 10;             //cordinate x di partenza del messaggio
float y = 30;             //coordinate y di partenza del messaggio

char c;                   
int cont = 0;
int a = 80;

public void setup()
{
  size (550,200);
  background(251,221,160);
  textFont(createFont("GillSans", 100));                      
  textSize(25);
  fill(nero); //messaggio scritto in nero
}

public void draw()
{
  if(cont < mex.length()) //if per tutta la lunghezza del messaggio (mex.length)
  {
    c = mex.charAt(cont);    //seleziona il carattere della stringa che verrà scritta 
    
    if (x + textWidth(c) > width)      //se il messaggio è alla fine della riga
    {
      fill(nero,a);                   
      y += textWidth('A') * 3 / 2;  //va a capo (quasi del doppio delle lettera)
      x = 10; //dopo il messaggio torna all'inizio della riga, allineato con la riga sopra
    }
    else if(c == ' ')  // se c'è uno spazio non si  aggiorna l'opacità, per evitare di attendere
    {   
      fill(nero,a);            
      text(c, x, y); //viene scritta la lettera contenuta in c alle coordinate x e y
      x += textWidth(c); //aggiorno sempre la x per scrivere la lettera successiva 
      cont++; //viene scritta la lettera successiva
    }
    else if ( c == '\n')               
    {
      fill(nero,a);             
      y += textWidth('A') * 3 / 2;          
      x = 10;                          
      cont++;                  
    }
    else
    {
      if(a < 250) // se non si ha ancora raggiunto il valore di opacità 
      {
        fill(nero,a);          
        text(c, x, y);                
        a+=5; //aumento l'opacità             
      }
      else
      {
       a = 80; //se si ha superato il limite di opacità, ritorniamo al valore di partenza
       cont++;                  
       x += textWidth(c);              
      }
    }
  }
}
