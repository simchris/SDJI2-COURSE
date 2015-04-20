package library.view;

import library.controller.Controller;

public interface View {

	public abstract void start(Controller controller);

	public abstract void show(String value);

	public abstract String get(String what);

}
