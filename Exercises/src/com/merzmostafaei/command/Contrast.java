package com.merzmostafaei.command;

public class Contrast implements Command {

    private float numberOfContrast;

    public Contrast(int numberOfContrast) {
        this.numberOfContrast = numberOfContrast;
    }
    @Override
    public void execute() {
        System.out.println(" Changing Contrast"+ numberOfContrast);
    }

    @Override
    public String toString() {
        return "Contrast{" +
                "numberOfContrast=" + numberOfContrast +
                '}';
    }
}
