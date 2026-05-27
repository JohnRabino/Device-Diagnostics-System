package edu.johnmelvinrabino;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Smartphone extends Device {
    public Smartphone(String name, int batteryLevel, Powerable powerBehavior) {
        super(name, batteryLevel, powerBehavior);
    }

    @Override
    public void runDiagnostics() {
        powerBehavior.powerOn();
        System.out.println("Running smartphone diagnostics...");
        if (batteryLevel < 15) {
            System.out.println("Warning: Battery critically low!");
        } else {
            System.out.println("Smartphone battery is okay.");
        }
    }
}
