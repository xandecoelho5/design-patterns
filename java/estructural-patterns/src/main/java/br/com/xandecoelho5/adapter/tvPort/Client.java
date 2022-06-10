package br.com.xandecoelho5.adapter.tvPort;

import br.com.xandecoelho5.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.xandecoelho5.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.xandecoelho5.adapter.tvPort.devices.Computer;
import br.com.xandecoelho5.adapter.tvPort.devices.OldMonitor;
import br.com.xandecoelho5.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		OldMonitor oldMonitor = new OldMonitor();
		pc.connectPort(new HDMIToVGAAdapter(oldMonitor));
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");
		HDMIToOldMonitorAdapter hdmiToOldMonitorAdapter = new HDMIToOldMonitorAdapter();
		pc.connectPort(hdmiToOldMonitorAdapter);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
}
