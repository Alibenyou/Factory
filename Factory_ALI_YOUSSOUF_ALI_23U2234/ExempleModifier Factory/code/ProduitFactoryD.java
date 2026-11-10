public class ProduitFactoryD extends ProduitFactory{
    public Produit createProduit(){
        Produit produit = new ProduitD();
        return produit;
    }
}
