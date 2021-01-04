public class Calendario {
    private int anno;
    private int mese;
    private int giorno;



    public Calendario(int giorno, int mese, int anno) throws Exception {
        this.setAnno(anno);
        this.setMese(mese);
        this.setGiorno(giorno, mese, anno);
    }

    public void setAnno(int anno) throws Exception {
        if (anno >= 0 && anno <= 2021) {
            this.anno = anno;
        } else {
            throw new Exception("anno compreso tra 0 e 2021!");
        }
    }

    public void setMese(int mese) throws Exception {
        if (mese >= 1 && mese <= 12) {
            this.mese = mese;
        } else {
            throw new Exception("Errore, i mesi sono solo 12");
        }
    }

    public void setGiorno(int giorno, int mese, int anno) throws Exception {
        int giorniInMese = this.giorniMese(mese, anno);
        if (giorno >= 1 && giorno <= giorniInMese) {
            this.giorno = giorno;
        } else {
            throw new Exception("Inserire un numero valido");
        }
    }

    public int giorniMese(int mese, int anno) {
        int giorniInMese = false;
        byte giorniInMese;
        if (mese != 4 && mese != 6 && mese != 9 && mese != 11) {
            if (mese == 2) {
                if (anno % 4 != 0 || anno % 100 == 0 && anno % 400 != 0) {
                    giorniInMese = 28;
                } else {
                    giorniInMese = 29;
                }
            } else {
                giorniInMese = 31;
            }
        } else {
            giorniInMese = 30;
        }

        return giorniInMese;
    }

    public int getAnno() {
        return this.anno;
    }

    public int getMese() {
        return this.mese;
    }

    public int getGiorno() {
        return this.giorno;
    }

    public String sommaGiorni(int numero_giorni) throws Exception {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        if (numero_giorni < 0) {
            throw new Exception("Il numero deve essere maggiore di 0!");
        } else {
            numero_giorni += giorno;

            while(numero_giorni != 0) {
                int giorni_rimanenti_mese = this.giorniMese(mese, anno);
                if (giorni_rimanenti_mese >= numero_giorni) {
                    giorno = numero_giorni;
                    numero_giorni = 0;
                } else {
                    numero_giorni -= giorni_rimanenti_mese;
                    if (mese < 12) {
                        ++mese;
                    } else {
                        mese = 1;
                        ++anno;
                    }
                }
            }

            return "Nuova data: " + giorno + " " + mese + " " + anno;
        }
    }

    public String differenzaDate(int giorno2, int mese2, int anno2) throws Exception {
        int giorno1 = this.giorno;
        int anno1 = this.anno;
        int mese1 = this.mese;
        int giorno_finale = 0;
        int mese_finale = false;
        int anno_finale = false;
        this.setMese(mese2);
        this.setAnno(anno2);
        this.setGiorno(giorno2, mese2, anno2);
        if (this.anno >= anno1 && (this.anno != anno1 || this.mese >= mese1 && (this.mese != mese1 || this.giorno > giorno1))) {
            throw new Exception("La seconda data deve essere più piccola rispetto alla prima!");
        } else {
            int giorni = giorno1;

            while(giorni != 0) {
                if (giorno1 >= this.giorno) {
                    giorno_finale = giorno1 - this.giorno;
                    giorni = 0;
                } else {
                    this.giorno -= giorni;
                    --mese1;
                    giorno1 = this.giorniMese(anno1, mese1);
                }
            }

            int mese_finale = mese1 - this.mese;
            if (mese_finale < 0) {
                --anno1;
                mese_finale += 12;
            }

            int anno_finale = anno1 - this.anno;
            return "La differenza tra le date è di: " + giorno_finale + " giorni, " + mese_finale + " mesi e " + anno_finale + " anni.";
        }
    }
}