public class App {
    public static void main(String[] args){
        Deplacement deplacement = new Courir();
        Attaque attaque = new Canon();

        Soldat soldat = new Soldat(attaque, deplacement);

        soldat.attaquer();
        soldat.seDeplacer();
    }
}
