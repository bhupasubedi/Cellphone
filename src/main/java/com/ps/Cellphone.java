package com.ps;

public class Cellphone {

    private int serialNumber;
    private String model;
    private String carrier;
    private int phoneNumber;
    private String owner;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", carrier='" + carrier + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", owner='" + owner + '\'' +
                '}';
    }
}


