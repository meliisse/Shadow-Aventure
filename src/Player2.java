import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player2 {
    public int battleroyal(int mony,Personnage guerrier,Personnage mage, Personnage voleur) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        // Création des personnages
        // na7itha hacka lvl ta3 game yzid

        String ga= "a";
        while (ga != "b") {
            int ciox;
            try{System.out.printf("chose a charcter to throw in the battle !!\n" +
                    "  1) gurrier\n" +
                    "   2) Mage\n" +
                    "    3) Vouleur\n" +
                    "      4) go back\n" +
                    "5) random (new)");


            } catch (Exception e) {
                System.out.printf("stop missing ,pnalty 456£");mony-=456;
            }  ciox = scanner.nextInt();
            if (5 == ciox) {
                ciox = r.nextInt(2) + 1;
            }

            switch (ciox) {
                case 1:  System.out.println("\n--- Tour de combat as "+guerrier.getNom());
                    while (!(!guerrier.estVivant() || !mage.estVivant() && !voleur.estVivant())) {
                        scanner.nextLine();
                        int guerri;
                        try{
                            System.out.println("Choisissez une action :");
                            System.out.println("1. Attaquer mage");
                            System.out.println("2. attack voluer");
                            System.out.println("3. utiliserCompetence(mage)");
                            System.out.println("4. utiliserCompetence(voluer)");

                        } catch (InputMismatchException e) {
                            System.out.printf("345$\n"); mony-=345;


                        }guerri = scanner.nextInt();
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


                        int mag = r.nextInt(3) + 1;
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

                        int vo = r.nextInt(3) + 1;
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
                    if (guerrier.estVivant()) {
                        System.out.println("u won \n");
                        mony += 360;
                        return mony;


                    } else {
                        System.out.printf("u lost \n");

                        return mony;
                    }
                case 2:
                    System.out.println("\n---  combat as mage "+mage.getNom());
                    while (!(!guerrier.estVivant() || !mage.estVivant() && !voleur.estVivant())) {


                        scanner.nextLine();

                        System.out.println("Choisissez une action :");
                        System.out.println("1. Attaquer guerrier");
                        System.out.println("2. attack voluer");
                        System.out.println("3. utiliserCompetence(guerrier)");
                        System.out.println("4. utiliserCompetence(voluer)");


                        int mag = scanner.nextInt();
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

                        int guerri = r.nextInt(3) + 1;
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


                        int vo = r.nextInt(3) + 1;
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
                        System.out.println("u won !\n");
                        mony += 360;

                    } else {
                        System.out.printf("u lost \n");


                    }
                    break;
                case 3:
                    while (!(!guerrier.estVivant() || !mage.estVivant() && !voleur.estVivant())) {

                        scanner.nextLine();
                        System.out.println("\n--- Tour de combat as a stealer---");// vouluer ar7ch y9ol asmo
                        System.out.println("Choisissez une action :");
                        System.out.println("1. Attaquer guerrier");
                        System.out.println("2. attack mage");
                        System.out.println("3. utiliserCompetence(guerrier)");
                        System.out.println("4. utiliserCompetence(mage)");

                        int vo = scanner.nextInt();
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





                        int guerri = r.nextInt(3) + 1;
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
                        int mag = r.nextInt(3) + 1;
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



                    }
                    if (voleur.estVivant()) {
                        System.out.println("u won  \n");
                        mony += 360;
                        return mony;

                    } else {
                        System.out.printf("u lost \n");


                    }
                    break;

                case 4:
                    ga = "b";
                default:
                    System.out.printf("input un vailed");
                    break;
            }

        }
        return mony;
    }}