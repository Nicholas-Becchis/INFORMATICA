//La classe Cerchio deve avere due costruttori: uno senza parametri che imposta il raggio a 0 e uno con un
//parametro corrispondente al raggio che si vuole impostare. Deve fornire oltre ai metodi get/set opportuni
//anche i metodi getArea() e getCirconferenza(). Creare la classe Test che prova a creare 2 cerchi, uno con il
//costruttore senza parametri e poi usa il metodo setRaggio() e l'altro con il costruttore con un parametro. Quindi
//visualizzare la loro area e la loro circonferenza.
public class Cerchio {
    private int raggio;

    public Cerchio(){
        this.raggio = 0;
    }

    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    public double GetArea(){
        return raggio*raggio*3.14;
    }

    public double GetCirconferenza(){
        return raggio*2*3.14;
    }
}
