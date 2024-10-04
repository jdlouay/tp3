

public class MaDate {

    private int jour;
    private int mois;
    private int annee;


    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }


    public MaDate(int annee) {
        this(1,1,annee);
    }


    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }


    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }


    void ajouterUnJour() {
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            if (jour < 31) {
                jour += 1;
            } else {
                jour = 1;
                if (mois < 12) {
                    mois += 1;
                } else {
                    mois = 1;
                    annee += 1;
                }
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            if (jour < 30) {
                jour += 1;
            } else {
                jour = 1;
                mois += 1;
            }
        } else if (mois == 2) {
            if (jour < 29)
                jour += 1;
            else {
                mois += 1;
                jour = 1;
            }
        }
    }


    void ajouterPlusieursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }
    }


    void ajouterUnMois() {
        if (mois < 12) {
            mois += 1;
        } else {
            mois = 1;
            annee += 1;
        }
    }


    void ajouterUnAn() {
        annee += 1;
    }
}