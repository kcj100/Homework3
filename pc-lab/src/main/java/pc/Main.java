package pc;

public class Main {
    public static void main(String[] args) {
        Case pcCase = new Case("Windows xp", "Microsoft", "220 volts", new Dimensions(200, 200, 100));
        Motherboard motherboard = new Motherboard("sony23", "Sony", 2, 4, "sony-bios");
        Monitor monitor = new Monitor(new Resolution(50, 50),"HP24m", "HP");
        PC pc = new PC(pcCase, motherboard, monitor);
        pc.description();
        pc.powerUp();
    }
}