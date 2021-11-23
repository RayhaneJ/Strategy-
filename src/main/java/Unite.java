public class Unite {
    private Attaque attaque;
    private Deplacement deplacement;

    public Unite(Attaque attaque, Deplacement deplacement){
        this.attaque = attaque;
        this.deplacement = deplacement;
    }

    public void combattre(){
        attaque.attaquer();
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }
}
