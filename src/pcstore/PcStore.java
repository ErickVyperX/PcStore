package pcstore;

import com.erick.pcstore.*;

public class PcStore {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("USB", "HyperX");
        Keyboard keyboard1 = new Keyboard("USB-C", "Cooler Master");
        Display display = new Display("Samsung", 27.5);
        Computer computer1 = new Computer("PC Master Race", display, keyboard1, mouse1);
        Order order1 = new Order();
        order1.addComputer(computer1);

        mouse1 = new Mouse("Lighting", "Corsair");
        keyboard1 = new Keyboard("HDMI", "Cougar");
        display = new Display("Aorus", 32);
        computer1 = new Computer("Extreme PC", display, keyboard1, mouse1);
        order1.addComputer(computer1);
        order1.showOrder();

        Order order2 = new Order();
        order2.addComputer(computer1);
        order2.showOrder();
    }
}
