package Homework33;

public class Soda {
    private String manufacturer; // производитель
    private String taste; // вкус
    private String gas; // газ не газ


    public Soda(String manufacturer, String taste, String gas) {
        this.manufacturer = manufacturer;

        this.taste = taste;
        this.gas = gas;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getTaste() {
        return taste;
    }


    public void setTaste(String taste) {
        this.taste = taste;
    }


}

