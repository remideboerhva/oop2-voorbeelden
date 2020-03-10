package week03;

/**
 * DE VERKEERSREGELAAR MBT TOT MODEL EN VIEW
 * Controller  -> View
 */
public class MainController {

    private static final int DEFAULT_RADIUS = 40;
    // In deze opzet hebben we een controller die eigenaar is van een View
    private final MainView view;

    // Model data
    private int radius = DEFAULT_RADIUS;
    private int stepSize = 10;

    public MainController() {
        this.view = new MainView(this);
    }

    public int getIncrementedRadius(){
        this.radius += stepSize;
        return this.radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public MainView getView() {
        return view;
    }

    public double getDecrementedRadius() {
        if(this.radius - stepSize > 0){
            this.radius -= stepSize;
        }
        return this.radius;
    }

    public int getReset() {
        return this.radius = DEFAULT_RADIUS;
    }
}
