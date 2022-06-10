package br.com.xandecoelho5.adapter.tvPort.adapters;

import br.com.xandecoelho5.adapter.tvPort.intefaces.HDMI;
import br.com.xandecoelho5.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private final VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Connecting adapter from HDMI to VGA");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sound can't be set on VGA.");
    }
}
