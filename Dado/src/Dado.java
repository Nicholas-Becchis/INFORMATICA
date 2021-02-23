import java.lang.Math;
public class Dado {
    private int numFaccie;
    private int uscito;

    public Dado(int numFaccie){
        this.numFaccie = numFaccie;
    }

    public int Lancia(){
        uscito = (int)(Math.random()*(numFaccie))+1;
        return uscito;
    }
}
