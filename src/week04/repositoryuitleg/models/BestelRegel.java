package week04.repositoryuitleg.models;

public class BestelRegel {

    private Product product;
    private int aantal;

    public BestelRegel(Product product, int aantal) {
        this.product = product;
        this.aantal = aantal;
    }

    /**
     * Geen normale setter, omdat deze twee altijd een eenheid vormen
     * @param product
     * @param aantal
     */
    public void voegToe(Product product, int aantal){
        this.product = product;
        this.aantal = aantal;
    }

    public Product getProduct() {
        return product;
    }

    public int getAantal() {
        return aantal;
    }

    @Override
    public String toString() {
        return "BestelRegel{" +
                "product=" + product +
                ", aantal=" + aantal +
                '}';
    }
}
