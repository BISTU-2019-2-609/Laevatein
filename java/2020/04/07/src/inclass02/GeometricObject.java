package inclass02;

/**
 * @author Laevatein
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled = false;

    public GeometricObject(){

    }

    public GeometricObject(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return String.format("\tColor: %s\n\tFilled: %b", color, filled);
    }
}