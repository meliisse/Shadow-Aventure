
class Voleur extends Personnage {
    public Voleur(String nom) {
        super(nom, 70, 12,0);
    }

    @Override
    public void attaquer(Personnage cible) {
        System.out.println(nom + " attaque furtivement " + cible.getNom() + " !");
        cible.recevoirDegats(degats);
        // Chance d'une attaque critique
        if (Math.random() < 0.2) {
            System.out.println(nom + " inflige un coup critique !");
            cible.recevoirDegats(degats);
        }
    }

    @Override
    public void utiliserCompetence(Personnage cible) {
        System.out.println(nom + " utilise sa compétence spéciale : the great scamm ! !");
        cible.lose_defance(cible);
        this.defence_factor+=3;
    }
}