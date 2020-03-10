package week04.dao;

class Model {

    private static int MODEL_COUNTER = 0; // start altijd op 0 maar expliciet vermeld

    private int id;
    private String naam;

    public Model(String naam) {
        this.id = ++MODEL_COUNTER;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                '}';
    }
}
