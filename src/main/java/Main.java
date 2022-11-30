import java.util.concurrent.TimeUnit;

import controller.DetailController;
import controller.MainController;
import controller.RegionController;
import view.AppView;
import view.MainPanel;

public class Main {
	public static void main(String[] args) {
		AppView a = new AppView();
		MainController m = new MainController(a);
		RegionController r = new RegionController(a);
		DetailController d = new DetailController(a);
	}
}
