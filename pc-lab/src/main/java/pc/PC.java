package pc;


public class PC {

    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixel(10,10,"Purple");
    }

    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today"
        + "\n" + monitor + "\n" + pcCase + "\n" + motherboard);
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Photoshop");
    }
}
