package lesson7;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return color.equalsIgnoreCase(((Box)obj).color) && size == ((Box)obj).size;
    }

    @Override
    public int hashCode() {
        return color.toUpperCase().hashCode()*31 + size*97;
    }
}
