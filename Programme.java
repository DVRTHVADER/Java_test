public enum Programme {
    BACCALAUREAT_EN_ART("Baccalauréat en art"),
    BACCALAUREAT_EN_INFORMATIQUE("Baccalauréat en informatique"),
    BACCALAUREAT_EN_PSYCHOLOGIE("Baccalauréat en psychologie"),
    BACCALAUREAT_EN_PHYSIQUE("Baccalauréat en physique"),
    BACCALAUREAT_EN_ERGOTHERAPIE("Baccalauréat en ergothérapie");

    // Attribut pour stocker le nom du programme
    private String nomProgramme;

    // Constructeur privé pour initialiser l'attribut
    private Programme(String nomProgramme) {
        this.nomProgramme = nomProgramme;
    }

    // Méthode pour obtenir le nom du programme
    public String getNomProgramme() {
        return nomProgramme;
    }
}
public class Main {
    public static void main(String[] args) {
        // Accéder aux programmes universitaires
        Programme programme1 = Programme.BACCALAUREAT_EN_ART;
        Programme programme2 = Programme.BACCALAUREAT_EN_INFORMATIQUE;

        // Afficher les noms des programmes
        System.out.println("Programme 1 : " + programme1.getNomProgramme());
        System.out.println("Programme 2 : " + programme2.getNomProgramme());
    }
}
