
import java.util.Random;
import java.util.Scanner;

public class Player1 {

    public int gamble(int money) {
        if(money<=0){
            System.out.printf("u have no money");
            return money;
        }
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Personnage guerrier = new Guerrier("baki");
        Personnage mage = new mage("daki");
        Personnage voleur = new Voleur("jaki");

        Scanner scanner = new Scanner(System.in);


        int ciox  = 0;
        while(ciox != 4){
            if(money >0){
                System.out.printf("chose a charcter to bet on !!\n" +
                        "  1) gurrier\n" +
                        "   2) Mage\n" +
                        "    3) Vouleur\n" +
                        "      4) go back");

                ciox = scanner.nextInt();
                switch (ciox) {
                    case 1 ->{
                        while (guerrier.estVivant() && mage.estVivant() && voleur.estVivant()) {
                            System.out.println("\n--- Tour de combat ---");
                            int guerri = rand1.nextInt(3) + 1;
                            switch (guerri) {
                                case 1 :
                                    guerrier.attaquer(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    guerrier.attaquer(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    guerrier.utiliserCompetence(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    guerrier.utiliserCompetence(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }
                            int mag = rand2.nextInt(3) + 1;
                            switch (mag) {
                                case 1:
                                    mage.attaquer(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    mage.attaquer(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    mage.utiliserCompetence(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    mage.utiliserCompetence(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }

                            int vo = rand2.nextInt(3) + 1;
                            switch (vo) {
                                case 1:
                                    voleur.attaquer(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    voleur.attaquer(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    voleur.utiliserCompetence(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    voleur.utiliserCompetence(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                            }



                        } if (guerrier.estVivant()) {
                            System.out.println("u won the gamble yeahhh ur monye gonna double!\n");
                            money *= 4;

                        } else {
                            System.out.printf("u lost , happy to see ur mony next time\n");
                            money = 0;

                        }  break;}
                    case 2 ->{
                        while (guerrier.estVivant() && mage.estVivant() && voleur.estVivant()) {
                            System.out.println("\n--- Tour de combat ---");
                            int guerri = rand1.nextInt(3) + 1;
                            switch (guerri) {
                                case 1:
                                    guerrier.attaquer(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    guerrier.attaquer(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    guerrier.utiliserCompetence(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    guerrier.utiliserCompetence(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }
                            int mag = rand2.nextInt(3) + 1;
                            switch (mag) {
                                case 1:
                                    mage.attaquer(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    mage.attaquer(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    mage.utiliserCompetence(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    mage.utiliserCompetence(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }

                            int vo = rand2.nextInt(3) + 1;
                            switch (vo) {
                                case 1:
                                    voleur.attaquer(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    voleur.attaquer(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    voleur.utiliserCompetence(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    voleur.utiliserCompetence(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                            }



                        }
                        if (mage.estVivant()) {
                            System.out.println("u won the gamble yeahhh ur monye gonna double!\n");
                            money *= 4;

                        } else {
                            System.out.printf("u lost , see ur mony next time\n");
                            money = 0;


                        } break;}
                    case 3 ->{
                        while (guerrier.estVivant() && mage.estVivant() && voleur.estVivant()) {
                            System.out.println("\n--- Tour de combat ---");
                            int guerri = rand1.nextInt(3) + 1;
                            switch (guerri) {
                                case 1:
                                    guerrier.attaquer(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    guerrier.attaquer(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    guerrier.utiliserCompetence(mage);
                                    guerrier.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    guerrier.utiliserCompetence(voleur);
                                    guerrier.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }
                            int mag = rand2.nextInt(3) + 1;
                            switch (mag) {
                                case 1:
                                    mage.attaquer(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    mage.attaquer(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    mage.utiliserCompetence(guerrier);
                                    mage.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    mage.utiliserCompetence(voleur);
                                    mage.gagnerExperience(30);
                                    voleur.gagnerExperience(10);
                                    if (!voleur.estVivant()) {
                                        System.out.println(voleur.getNom() + " est vaincu !");
                                        break;
                                    }


                            }

                            int vo = rand2.nextInt(3) + 1;
                            switch (vo) {
                                case 1 :
                                    voleur.attaquer(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 2:
                                    voleur.attaquer(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                                case 3:
                                    voleur.utiliserCompetence(guerrier);
                                    voleur.gagnerExperience(30);
                                    guerrier.gagnerExperience(10);
                                    if (!guerrier.estVivant()) {
                                        System.out.println(guerrier.getNom() + " est vaincu !");
                                        break;
                                    }

                                case 4:
                                    voleur.utiliserCompetence(mage);
                                    voleur.gagnerExperience(30);
                                    mage.gagnerExperience(10);
                                    if (!mage.estVivant()) {
                                        System.out.println(mage.getNom() + " est vaincu !");
                                        break;
                                    }
                            }



                        }
                        if (voleur.estVivant()) {
                            System.out.println("u won the gamble yeahhh ur monye gonna double! \n");
                            money *= 4;

                        } else {
                            System.out.printf("u lost , see ur mony next time\n");
                            money = 0;

                        } break ;}

                    case 4 ->{
                        break;}
                    default->{
                        System.out.printf("input un vailed");
                        break;}
                }} else{
                System.out.printf("u dont have monye to play\n eearn some in the battle mode");
                break;


            }
        }return money;}}