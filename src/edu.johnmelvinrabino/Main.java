package edu.johnmelvinrabino;

import edu.devicediagnostic.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();

        devices.add(new Laptop("Zephyrus 16", 100, new NormalPowerOn()));
        devices.add(new Smartphone("Samsung 25", 0, new FastBootPowerOn()));
        devices.add(new Tablet("Xiaomi Pad 6", 20, new NormalPowerOn()));

        for (Device d : devices) {
            d.showStatus();
            d.runDiagnostics();
            System.out.println("-------------------");
        }
    }
}
