public class Test {
    private Dado[] dadi;
    private int indice;

    public Test(int lunghezza){
        dadi = new Dado[lunghezza];     //vettore vuoto
        indice = 0;
    }

    public void AggiungiDado(Dado x){
        if(indice<dadi.length){
            dadi[indice] = x;
            indice++;
        }
    }

    public int Lancia(){
        int somma = 0;
        for(int i = 0; i<indice; i++){
            int x = dadi[i].Lancia();
            somma = somma + x;
            System.out.print(x + " ");
        }
        System.out.println(" ");
        return somma;
    }

    public static void main(String[] Args){
        Test T;
        T = new Test(10);
        Dado d1;
        Dado d2;
        Dado d3;
        d1 = new Dado(6);
        d2 = new Dado(5);
        d3 = new Dado(8);

        T.AggiungiDado(d1);
        T.AggiungiDado(d2);
        T.AggiungiDado(d3);

        System.out.println(T.Lancia());


    }
}
