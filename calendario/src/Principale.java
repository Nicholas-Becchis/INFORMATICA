public class Principale {
    private CLInput cli = new CLInput();
    private Calendario calendario;

    Principale() {
    }

    public static void main(String[] args) {
        Principale p = new Principale();
        p.crea_data();
    }

    public void crea_data() {
        try {
            int giorno = this.cli.readInt("Inserire il giorno: ");
            int mese = this.cli.readInt("Inserire il mese: ");
            int anno = this.cli.readInt("Inserire l'anno: ");
            this.calendario = new Calendario(giorno, mese, anno);
            int giorno1 = this.cli.readInt("Inserire il giorno: ");
            int mese1 = this.cli.readInt("Inserire il mese: ");
            int anno1 = this.cli.readInt("Inserire l'anno: ");
            System.out.println(this.calendario.differenzaDate(giorno1, mese1, anno1));
        } catch (Exception var7) {
            System.out.println(var7.getMessage());
            this.crea_data();
        }

    }
}