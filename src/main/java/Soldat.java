public class Soldat {
    private Attaque attaque;
    private Deplacement deplacement;

    public Soldat(Attaque attaque, Deplacement deplacement){
        this.attaque = attaque;
        this.deplacement = deplacement;
    }

    public void attaquer(){
        attaque.attaquer();
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }
}
