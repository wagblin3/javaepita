package constructeurs;

public class Enfant {
    String nom;
    String prenom;
    int age;

    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void presentation() {
        System.out.println("Bonjour, je m'appelle "+prenom+" "+nom+". J'ai "+age+" ans");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feterAnniversaire() {
        if (age<17){
            age++;
        }
    }

}