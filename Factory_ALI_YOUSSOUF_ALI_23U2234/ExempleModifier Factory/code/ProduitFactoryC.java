public class ProduitFactoryC extends ProduitFactory {
    public Produit createProduit(){
        Produit produit = new ProduitC();
        return produit;
    }
    
}
