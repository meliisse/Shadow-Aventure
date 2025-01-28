
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class dargon extends Personnage {


    public dargon(String nom) {
        super(nom, 600, 60,17);
    }


    @Override
    public  void attaquer(Personnage cible) {

        System.out.println(this.nom + " attaque " + cible.getNom() + " !");
        cible.recevoirDegats(degats);


    }

    @Override
    public  void utiliserCompetence(Personnage cible) {
        cible.recevoirDegats(degats*3);
        this.pointsDeVie+=12;
        cible.lose_defance(cible);
        this.defence_factor+=3;
        this.degats+=4;


    }
    public boolean arena(Personnage guerrier,dargon cible, Personnage mage, Personnage voleur) {
        System.out.println("now the battle begins");

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
                // Sélection d'un personnage au hasard
                int choixRandom = (int) (Math.random() * 3) + 1;
                switch (choixRandom) {
                    case 1:
                        joueur = guerrier;
                        break;
                    case 2:
                        joueur = mage;
                        break;
                    case 3:
                        joueur = voleur;
                        break;
                }
                break;
        }

        // Actions des adversaires
        while (joueur.estVivant() && cible.estVivant() ) {
            try{ System.out.println("\n--- Tour de combat ---");
                System.out.println("Choisissez une action :");
                System.out.println("1. Attaquer  dragon");
                System.out.println("2. Utiliser compétence spéciale");
                System.out.println("3. Passer son tour");
                scanner.nextLine();
                int action = scanner.nextInt();
                switch(action ) {
                    case 1:
                        joueur.attaquer(cible);
                        break;
                    case 2:
                        joueur.utiliserCompetence(cible);
                        break;
                    case 3:
                        System.out.printf("pass tour\n");
                        ;
                        break;

                    default:
                        System.out.printf("u attacked ur self\n");
                        joueur.attaquer(joueur);
                        break;

                }}catch(InputMismatchException e){

                System.out.printf("\n i know a guard that  can use a keyboared wisely\n");
            }




            Random r = new Random();

            int i = r.nextInt(2)+1;
            switch(i){
                case 1 : cible.attaquer(joueur); joueur.gagnerExperience(15);break;
                case 2 : cible.utiliserCompetence(joueur); joueur.gagnerExperience(15); break;
                case 3:
                    System.out.printf("pass tour");;break;}



        } System.out.println("Le combat est terminé !  ");
        if(joueur.estVivant()){
            System.out.println("u win");
            return true;
        }else{
            System.out.println("u lost");return false;
        }
    }}