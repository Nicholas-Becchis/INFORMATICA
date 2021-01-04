import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLInput {
    private BufferedReader br;

    CLInput() {
        InputStreamReader isr = new InputStreamReader(System.in);
        this.br = new BufferedReader(isr);
    }

    public String readString(String prompt) {
        String risultato = null;

        while(risultato == null) {
            System.out.print(prompt);

            try {
                risultato = this.br.readLine();
            } catch (IOException var4) {
                System.out.print("Il valore non è valido!");
            }
        }

        return risultato;
    }

    public float readFloat(String prompt) {
        float val = 0.0F;

        try {
            val = Float.parseFloat(this.readString(prompt));
        } catch (Exception var4) {
            System.out.println("Il valore inserito non è corretto!");
            val = this.readFloat(prompt);
        }

        return val;
    }

    public int readInt(String prompt) {
        boolean var2 = false;

        int val;
        try {
            val = Integer.parseInt(this.readString(prompt));
        } catch (Exception var4) {
            System.out.println("Il valore inserito non è corretto!");
            val = this.readInt(prompt);
        }

        return val;
    }

    public char readChar(String prompt) {
        char c = true;
        String str = null;
        str = this.readString(prompt);
        int n = str.length();
        char carattere;
        if (n == 1) {
            c = str.charAt(0);
            System.out.print(c);
        } else {
            System.out.println("Inserire un solo carattere!");
            c = this.readChar(prompt);
        }

        return c;
    }
}