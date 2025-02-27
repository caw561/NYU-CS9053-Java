package innerclasses;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class OutsideTimePrinter implements ActionListener {
	int interval;
	boolean beep;
	
	public  OutsideTimePrinter(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
		System.out.println("Interval is " + interval);
		if (beep) Toolkit.getDefaultToolkit().beep();

	}

}
