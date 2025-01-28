

    abstract class Personnage implements Attaquable {
    protected String nom;
    protected int pointsDeVie;
    protected int   defence_factor;
    protected int degats; // Dégâts de base
    protected int niveau;
    protected int experience;
    protected boolean arrmor = false ;
    protected boolean healer = false ;
    protected boolean dragon = false ;
    protected boolean sword = false;
    public Personnage(String nom, int pointsDeVie, int degats , int   defence_factor) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.degats = degats;
        this.niveau = 1;
        this.experience = 0;
        this.defence_factor =defence_factor;
    }
    public void use_dragon(){
        if(dragon){
            this.niveau =5;
            this.pointsDeVie+=300;
            this.defence_factor+=4;
            this.degats+=25;


        }


    }
    public void use_healer(){

        if(healer){
            pointsDeVie+=10;
            healer = false;
        }else{
            System.out.printf("u dont have the item");
        }
    }
    public void use_sword(){
        if(sword){
            degats = degats +degats*6/100;


        }else{
            System.out.printf("not avialble");
        }

    }
    public void use_armmor(){

        if(arrmor){
            pointsDeVie+=15;

        }else{
            System.out.printf("u dont have this item");
        }
    }


    public void recevoirDegats(int degats ) {
        pointsDeVie -= degats- degats*defence_factor/100;
        System.out.println(nom + " a reçu " + degats + " points de dégâts. Points de vie restants : " + pointsDeVie);
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public String getNom() {
        return nom;
    }

    public void gagnerExperience(int xp) {
        experience += xp;
        int tmpn = niveau;
        if (experience >= 100) {
            niveau++;
            experience = 0;
            System.out.println(nom + " a atteint le niveau " + niveau + " !");
        }
        if(niveau > tmpn){
            degats++;
            pointsDeVie++;


        }

    }


    protected void lose_defance(Personnage cible){


        cible.defence_factor-=3;
    }
}