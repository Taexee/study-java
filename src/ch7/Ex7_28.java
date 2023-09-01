package ch7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
	}

}
class EventHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
