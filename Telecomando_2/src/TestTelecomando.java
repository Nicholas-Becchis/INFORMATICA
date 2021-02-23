import java.io.InputStreamReader;
public class TestTelecomando {
    public static void main(String[] Args){
        Telecomando T;
        T = new Telecomando();
        System.out.println(T.GetAcceso());
        T.Accensione();
        System.out.println(T.GetAcceso() + " " + T.GetCanale());
        T.CanaleSu();
        System.out.println(T.GetCanale());
        T.ImpostaCanale(5);
        System.out.println(T.GetCanale());
        T.GetCanale();
    }
}
