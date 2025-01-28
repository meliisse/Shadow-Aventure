import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class guard extends Personnage {
    public guard(String nom) {
        super(nom, 850, 25, 20);
    }

    public void attaquer(Personnage cible) {
        String var10001 = this.nom;
        System.out.println(var10001 + " attaque " + cible.getNom() + " !");
        cible.recevoirDegats(this.degats);
    }

    public void utiliserCompetence(Personnage cible) {
        cible.recevoirDegats(this.degats * 2);
        this.pointsDeVie += 25;
        cible.lose_defance(cible);
        this.defence_factor += 5;
        this.degats += 2;
    }

    public boolean arena(Personnage guerrier, guard cible, Personnage mage, Personnage voleur) {
        System.out.println("now the battle begins with " + cible.getNom());
        System.out.println("Choisissez votre personnage :");
        System.out.println("1. Guerrier");
        System.out.println("2. Mage");
        System.out.println("3. Voleur");
        Personnage joueur = null;
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                joueur = guerrier;
                break;
            case 2:
                joueur = mage;
                break;
            case 3:
                joueur = voleur;
                break;
            default:
                System.out.println("Choix invalide. Un personnage sera sélectionné au hasard");
                int choixRandom = (int)(Math.random() * (double)3.0F) + 1;
                switch (choixRandom) {
                    case 1 -> joueur = guerrier;
                    case 2 -> joueur = mage;
                    case 3 -> joueur = voleur;
                }
        }

        while(joueur.estVivant() && cible.estVivant()) {
            try {
                System.out.println("\n--- Tour de combat ---");
                System.out.println("Choisissez une action :");
                System.out.println("1. Attaquer  gurad");
                System.out.println("2. Utiliser compétence spéciale");
                System.out.println("3. Passer son tour");
                scanner.nextLine();
                int action = scanner.nextInt();
                switch (action) {
                    case 1:
                        joueur.attaquer(cible);
                        break;
                    case 2:
                        joueur.utiliserCompetence(cible);
                        break;
                    case 3:
                        System.out.printf("pass tour");
                        break;
                    default:
                        System.out.printf("u attacked ur self");
                        joueur.attaquer(joueur);
                }
            } catch (InputMismatchException var10) {
                System.out.printf("even a dragon didnt make such a mistake");
            }

            Random r = new Random();
            int i = r.nextInt(2) + 1;
            switch (i) {
                case 1:
                    cible.attaquer(joueur);
                    joueur.gagnerExperience(15);
                    break;
                case 2:
                    cible.utiliserCompetence(joueur);
                    joueur.gagnerExperience(15);
                    break;
                case 3:
                    System.out.printf("pass tour");
            }
        }

        System.out.println("Le combat est terminé !  ");
        if (joueur.estVivant()) {
            System.out.println("u win");
            return true;
        } else {
            System.out.println("u lost");
            return false;
        }
    }
}