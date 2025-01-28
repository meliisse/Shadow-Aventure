
class mage extends Personnage {
    public mage(String nom) {
        super(nom, 80, 15, -2);
    }

    public void attaquer(Personnage cible) {
        String var10001 = this.nom;
        System.out.println(var10001 + " lance un sort sur " + cible.getNom() + " !");
        cible.recevoirDegats(this.degats);
    }

    public void utiliserCompetence(Personnage cible) {
        System.out.println(this.nom + " magic = medic !");
        this.pointsDeVie += 12;
    }
}