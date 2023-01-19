package oop2;

public class Angajat {
    String nume;
    String prenume;
    int varsta;
    int vechime;
    String functie;
    int salariu;

    public Angajat(String nume, String prenume, int varsta, int vechime, String functie, int salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.vechime = vechime;
        this.functie = functie;
        this.salariu = salariu;
    }

    public void descriereAngajat() {
        System.out.println("Nume si prenume angajat: " + this.nume + " " + this.prenume);
        System.out.println("Varsta: " + this.varsta);
        System.out.println("Vechime: " + this.vechime);
        System.out.println("Functie: " + this.functie);
        System.out.println("Salariu: " + this.salariu);
        System.out.println("-------------------------------------");
    }

    public void marireSalariu() {
        if (vechime  <= 5) {
            this.salariu += 1000;
        } else {
            this.salariu += 2000;
        }
    }
    public void adaugareVechime(int vechime) {
        ++vechime;
        this.vechime = vechime;
    }
}
