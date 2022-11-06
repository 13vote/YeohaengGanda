import controller.MainController;
import view.AppView;
import view.MainPanel;

public class Main {
    public static void main(String[] args) {

        MainController m = new MainController(new AppView());
    }
}
