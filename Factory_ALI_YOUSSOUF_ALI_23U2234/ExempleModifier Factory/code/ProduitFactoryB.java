public class ProduitFactoryB extends ProduitFactory{
    public Produit createProduit(){
        Produit produit = new ProduitB();
        return produit;
    }
}
