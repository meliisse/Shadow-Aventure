import java.util.Scanner;

public class shop {
    dargon dragon = new dargon("DARGON  the dragon");
    guard gg = new guard("THE ARMATURE king of selfishness");
    magic frieren = new magic("frieren the Slayer");
    public  int shop(int budget, Personnage guerrier, Personnage mage, Personnage voleur) {
        if (budget <= 0) {
            System.out.println("لا تحرجني بالقرض حتى لا احرجك بالرفض  ahh moment , u dont have mony");
            return budget;
        } else {
            Scanner sc = new Scanner(System.in);
            int i = -1;
            while (i != 0&& budget>0) {
                System.out.println("=====================\n");
                System.out.println("wellcome to the shop ! \n");
                System.out.println("list of objects:\n" +
                        "items used now:\n" +

                        "  1) armor 700$ more defance by %5\n" +
                        "2)Sword 800$  more dammge by 6%\n" +

                        "   3) healer 400$ get 10 point of heal \n" +

                        "      4) 5000$\n" +
                        "the white eyes dragon demon egg\n" +
                        "5) quit");
                int c = sc.nextInt();
                switch (c) {
                    case (1):sc.nextLine();
                        boolean b = gg.arena(guerrier,gg, mage,  voleur);
                        int d;
                        if(b){


                            System.out.println("the charcter to upgrade is:\n" +
                                    " 1) Gurrier" +
                                    "  2)mage" +
                                    "   3)Vouleur");

                            d = sc.nextInt();

                            switch (d) {
                                case (1):
                                    if (guerrier.arrmor == true) {
                                        System.out.println("the warior have an armour already");
                                    } else {
                                        guerrier.arrmor = true;
                                        budget -= 700;
                                        guerrier.use_armmor();
                                    } break;
                                case (2):
                                    if (mage.arrmor == true) {
                                        System.out.println("the mage have an armour already");
                                    } else {
                                        mage.arrmor = true;
                                        budget -= 700;
                                        mage.use_armmor();
                                    } break;
                                case (3):
                                    if (voleur.arrmor == true) {
                                        System.out.println("the vouleur have an armour already , soo he stole it and u must pay anyway ");
                                        budget -= 700;
                                    } else {
                                        voleur.arrmor = true;
                                        budget -= 700;
                                        voleur.use_armmor();
                                    }break;
                                default:
                                    System.out.println("u are missing up , 420$ penalty");
                                    budget -= 400; break;
                            }} break;
                    case 2:sc.nextLine();
                        System.out.println("the charcter to upgrade is:\n" +
                                " 1) Gurrier" +
                                "  2)mage" +
                                "   3)Vouleur");

                        d = sc.nextInt();
                        switch (d) {
                            case (1):
                                if (guerrier.sword == true) {
                                    System.out.println("the warior have an sword already");
                                } else {
                                    guerrier.sword = true;
                                    budget -= 800;
                                    guerrier.use_sword();
                                } break;
                            case (2):
                                if (mage.sword == true) {
                                    System.out.println("the mage have an sword already");
                                } else {
                                    mage.arrmor = true;
                                    budget -= 800;
                                    mage.use_sword();
                                } break;
                            case (3):
                                if (voleur.sword == true) {
                                    System.out.printf("the vouleur have an sword already , soo he stole it and u must pay anyway ");
                                    budget -= 700;
                                } else {
                                    voleur.sword = true;
                                    budget -= 800;
                                    voleur.use_sword();
                                } break;
                            default:
                                System.out.println("u are missing up , 420$ penalty");
                                budget -= 400; break;
                        } break;

                    case 3:  sc.nextLine();
                        System.out.println("the charcter to upgrade is:\n" +
                                " 1) Gurrier" +
                                "  2)mage" +
                                "   3)Vouleur");

                        d = sc.nextInt();
                        switch (d) {



                            case (1):
                                if (guerrier.healer == true) {
                                    System.out.println("the warior have an healer already");
                                } else {
                                    guerrier.healer = true;
                                    budget -= 400;
                                    guerrier.use_healer();

                                } break;
                            case (2):
                                if (mage.healer == true) {
                                    System.out.println("the mage have an healer already");
                                } else {
                                    mage.healer = true;
                                    budget -= 400;
                                    mage.use_healer();

                                } break;
                            case (3):
                                if (voleur.healer == true) {
                                    System.out.printf("the vouleur have an healer already , soo he stole it and u must pay anyway ");
                                    budget -= 400;
                                } else {
                                    voleur.healer = true;
                                    budget -= 400;
                                    voleur.use_healer();
                                } break;
                            default:
                                System.out.printf("u are missing up , 420$ penalty");
                                budget -= 420; break;
                        }
                        break;
                    case 4: budget-=4000;
                        b =dragon.arena( guerrier,dragon, mage,  voleur);


                        if(b){
                            sc.nextLine();
                            System.out.println("the charcter to upgrade is:\n" +
                                    " 1) Gurrier" +
                                    "  2)mage" +
                                    "   3)Vouleur");

                            d = sc.nextInt();
                            switch (d) {
                                case (1):

                                    guerrier.dragon = true;

                                    guerrier.use_dragon();

                                    break;
                                case (2):

                                    mage.dragon = true;

                                    mage.use_dragon();

                                    break;
                                case (3):

                                    voleur.dragon = true;

                                    voleur.use_dragon();
                                    break;
                                default:
                                    System.out.printf("u are missing up , 420$ penalty");
                                    budget -= 420; break;
                            }}
                        break;













                    case 5: i=0;return budget;
                    default:
                        System.out.printf("dragon : this what the old owner will say \n");
                        System.out.printf("i told uuuuuu ,now u fight meeee!! -former shope chife-");
                        break;
                } }
        }
        return budget; }


}