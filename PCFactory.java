package a2_2201040018;

//import java.util.Vector;
public class PCFactory {
    private static PCFactory instance;
//    private Vector<PC> pcVector;

//    private PCFactory() {
//        pcVector = new Vector<>();
//    }

    public static PCFactory getInstance() {
        if (instance == null) {
            instance = new PCFactory();
        }
        return instance;
    }

    public PC createPC(String model, int year, String manufacturer, Set<String> comps) {
//        PC pc = new PC(model, year, manufacturer, comps);
//        pcVector.add(pc);
//        return pc;
        return new PC(model, year, manufacturer, comps);
    }

//    public Vector<PC> getPCs() {
//        return pcVector;
//    }
}
