package com.erick.pcstore;

import java.util.StringJoiner;

public class InputDevice {
    protected String connectorType;
    protected String brand;

    public InputDevice(String connectorType, String brand) {
        this.connectorType = connectorType;
        this.brand = brand;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", InputDevice.class.getSimpleName() + "[", "]")
                .add("\nconnectorType='" + connectorType + "'")
                .add("\nbrand='" + brand + "'")
                .toString();
    }
}
