package edu.johnmelvinrabino;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Tablet extends Device {
    public Tablet(String name, int batteryLevel, Powerable powerBehavior) {
        super(name, batteryLevel, powerBehavior);
    }

    @Override
    public void runDiagnostics() {
        powerBehavior.powerOn();
        System.out.println("Running tablet diagnostics...");
        if (batteryLevel < 30) {
            System.out.println("Tablet battery is low.");
        } else {
            System.out.println("Tablet battery is sufficient.");
        }
    }
}
