//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Bonjour le monde");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit = null;
        //affichage d'un produit de type A
        produit = fabriqueProduit.createProduit(fabriqueProduit.typeA);
        produit.methodeproduit();
        //affichage d'un produit de type B
        produit = fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodeproduit();
        //affichage d'un produit de type C
        produit = fabriqueProduit.createProduit(fabriqueProduit.typeC);
        produit.methodeproduit();
        //produit inexistant
        String d = "D";
        produit = fabriqueProduit.createProduit(d);
        produit.methodeproduit();
    }
}