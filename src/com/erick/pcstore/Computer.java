package com.erick.pcstore;

import java.util.StringJoiner;

public class Computer {
    private final int idComputer;
    private String name;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int counterIdComputer;

    private Computer() {
        this.idComputer = counterIdComputer++;
    }

    public Computer(String name, Display display, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Computer.class.getSimpleName() + "[", "]")
                .add("\nidComputer=" + this.idComputer)
                .add("\nname='" + this.name + "'")
                .add("\ndisplay=" + this.display)
                .add("\nkeyboard=" + this.keyboard)
                .add("\nmouse=" + this.mouse)
                .toString();
    }
}
