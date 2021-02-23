//La classe TELECOMANDO deve essere in grado di: accendere/spegnere la televisione, cambiare il canale (su di
//uno o giù di uno) o impostare un canale (se esiste se no resta invariato), abbassare e alzare il volume o mettere
//a muto. Usare gli attributi privati: canale, acceso, volume, VOLUME_MAX, CANALE_MAX
public class Telecomando {
    private int canale;
    private int volume;
    private boolean acceso;
    private static final int VOLUME_MAX = 100;
    private static final int CANALE_MAX = 100;

    public Telecomando(){
        this.canale=1;
        this.acceso=false;
        this.volume=10;
    }

    public void Accensione(){
        if(acceso == true){
            acceso = false;
        }else{
            acceso = true;
        }
    }

    public void CanaleSu(){
        if(canale < CANALE_MAX){
            canale++;
        }
    }

    public void CanaleGiu(){
        if(canale > 1){
            canale--;
        }
    }

    public void ImpostaCanale(int canale){  //canale vale solo per questo metodo
        if(canale < CANALE_MAX || canale >= 1){
            this.canale = canale;
        }
    }

    public void VolumeSu(){
        if(volume < VOLUME_MAX){
            volume++;
        }
    }

    public void VolumeGiu(){
        if(volume >= 1){
            volume--;
        }
    }

    public void Muto(){
        this.volume = 0;
    }

    public int GetCanale(){
        return canale;
    }

    public boolean GetAccenso(){
        return acceso;
    }
}
