import java.util.InputMismatchException;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Personnage guerrier = new Guerrier("Thor");
        Personnage mage = new mage("Gandalf");
        Personnage voleur = new Voleur("Loki");
        shop s = new shop();

        Player1 gummball = new Player1();
        Player2 pubgiwlafortnight = new Player2();
        Scanner sc = new Scanner(System.in);
        int drahm = 200;int co = 0;
        System.out.println("Story =================================== \n long time ago , in a world full of magic \n,in town known for cage-royal sports " +
                "\n a father had a shop selling items related to this madness " +
                "\n the father went sick and died , and he got six sons  dargon armature thor gandalf loki and  frieren " +
                "\n   the two oldest brothers and the youngest ones were born with unmatched power" +
                "\n soo they used there magic supermacy to take over the shop and kick out the others" +
                "\n now the jounry of the 3 brothers starts , to get stronger and take revenge{the ninjago theme starts to play in my mind btw}\n \n" +
                "================================================\n"
        );
        while(co !=3) {
            try{
                System.out.printf("\nhello!! , to Shadow advernturs! (am not that good in english) !\n" +
                        "we have two game mods avialble right now :\n" +
                        "1) gamblling\n" +
                        "2) cage_royal\n" +
                        "3) shut down the game \n" +
                        "4) (new) shop\n" +
                        "ur budget ="+drahm
                );
                co = sc.nextInt();
                switch (co){

                    case 1 :
                        drahm= gummball.gamble(drahm);

                        break;
                    case 2 :
                        drahm=pubgiwlafortnight.battleroyal(drahm,guerrier,mage,voleur);
                        break;
                    case 3:
                        System.out.printf("  have a good day");
                        break;

                    case 4: drahm=s.shop(drahm,guerrier, mage,  voleur); break;
                    default:
                        System.out.printf("wrong action , 300$ penalty");
                        drahm-=300;
                }}catch(InputMismatchException e){
                System.out.printf("acting smart ? ur budget gonna rest to zero\n this is helpfull actualy if u you have debt XD");
                drahm=0;
            }


        }
    }
}