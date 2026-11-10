//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Bonjour le monde");

        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
	ProduitFactory produitFactoryD = new ProduitFactoryD();
        Produit produit = null;
        //affichage d'un produit de type A
        produit = produitFactoryA.getProduit();
        produit.methodeproduit();
        //affichage d'un produit de type B
        produit = produitFactoryB.getProduit();
        produit.methodeproduit();
        //affichage d'un produit de type C
        produit = produitFactoryC.getProduit();
        produit.methodeproduit();
        //affichage d'un produit de type D
        produit = produitFactoryD.getProduit();
        produit.methodeproduit();

    }
}