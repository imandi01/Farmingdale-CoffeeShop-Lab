public abstract class Drink {
    private String name;
    private Size size;
    private Milk milk;
    private int shots;
    private Sweetener sweetener;
    private Temperature temperature;

    public Drink(String name) {
        this.name = name;
        this.size = Size.MEDIUM;
        this.milk = Milk.NONE;
        this.shots = 0;
        this.sweetener = Sweetener.NONE;
        this.temperature = Temperature.HOT;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Milk getMilk() {
        return milk;
    }

    public int getShots() {
        return shots;
    }

    public Sweetener getSweetener() {
        return sweetener;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public void setSweetener(Sweetener sweetener) {
        this.sweetener = sweetener;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Drink Name: " + name +
                "\nTemperature: " + temperature +
                "\nSize: " + size +
                "\nMilk: " + milk +
                "\nShots: " + shots +
                "\nSweetener: " + sweetener;
    }
}
