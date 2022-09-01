package com.erick.pcstore;

import java.util.StringJoiner;

public class Mouse extends InputDevice {
    private final int idMouse;
    private static int counterIdMouse;

    public Mouse(String connectorType, String brand) {
        super(connectorType, brand);
        this.idMouse = counterIdMouse++;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mouse.class.getSimpleName() + "[", "]")
                .add("\nidMouse=" + idMouse)
                .add(super.toString())
                .toString();
    }
}
