package oop2;

public class MainAngajat {
    public static void main(String[] args) {
    Angajat angajat1 = new Angajat("Zaharia", "Adrian", 42, 4, "ISE", 3000);  //instantiere
    Angajat angajat2 = new Angajat("Zaharia", "Lacramioara", 38, 7, "Manager", 7000);  //instantiere
    angajat1.descriereAngajat();
    angajat2.descriereAngajat();
    angajat2.marireSalariu();
    angajat1.marireSalariu();
    angajat2.descriereAngajat();
    angajat1.descriereAngajat();
    angajat1.adaugareVechime(angajat1.vechime);
    angajat1.adaugareVechime(angajat1.vechime);
    angajat1.adaugareVechime(angajat1.vechime);
        angajat1.marireSalariu();
        angajat2.descriereAngajat();
        angajat1.descriereAngajat();
    }
}
