package com.erick.pcstore;

import java.util.StringJoiner;

public class Keyboard extends InputDevice {
    private final int idKeyboard;
    private static int counterIdKeyboard;

    public Keyboard(String connectorType, String brand) {
        super(connectorType, brand);
        this.idKeyboard = counterIdKeyboard++;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Keyboard.class.getSimpleName() + "[", "]")
                .add("\nidKeyboard=" + idKeyboard)
                .add(super.toString())
                .toString();
    }
}
