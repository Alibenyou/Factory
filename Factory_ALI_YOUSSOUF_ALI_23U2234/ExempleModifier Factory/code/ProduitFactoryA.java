public class ProduitFactoryA extends ProduitFactory{
    public Produit createProduit(){
        Produit produit = new ProduitA();
        return produit;
    }
}
