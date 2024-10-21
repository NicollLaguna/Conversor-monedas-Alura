import controller.ConversorController;
import model.ConversorModel;
import view.ConsolaView;

public class ConversorApp {

    public static void main(String[] args) {

        ConversorModel model = new ConversorModel();
        ConsolaView view = new ConsolaView();
        ConversorController controller = new ConversorController(model, view);


        controller.iniciarConversor();
    }
}