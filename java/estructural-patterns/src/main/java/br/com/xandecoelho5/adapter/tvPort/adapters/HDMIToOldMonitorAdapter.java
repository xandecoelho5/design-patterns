package br.com.xandecoelho5.adapter.tvPort.adapters;

import br.com.xandecoelho5.adapter.tvPort.devices.OldMonitor;
import br.com.xandecoelho5.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Connecting an old monitor to HDMI");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sound can't be set on VGA.");
    }
}
