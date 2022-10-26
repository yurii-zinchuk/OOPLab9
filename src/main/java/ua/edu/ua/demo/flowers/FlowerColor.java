package ua.edu.ua.demo.flowers;

public enum FlowerColor {
    RED,
    BLUE,
    GREEN,
    WHITE;

    public String toString() {
        return switch (this) {
            case RED -> "#FF0000";
            case BLUE -> "#0000FF";
            case GREEN -> "#008000";
            case WHITE -> "#FFFFFF";
        };
    }
}
