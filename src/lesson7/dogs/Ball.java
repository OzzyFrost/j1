package lesson7.dogs;

public class Ball {
    private String color;
    private boolean busy;

    public Ball(String color) {
        this.color = color;
        this.busy = false;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public String getColor() {
        return color;
    }
}
