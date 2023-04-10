package jy;

public class J13OOP {
    public static void main(String[] args) {
        Cat persian = new Cat();

    }
}
class Cat {
    private String breed;
    private String color;

    public Cat() {
    }

    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }
}

class NotOverloading{
    public int addInt(int x, int y) {
        return x + y;
    }

    public double addDouble(double x, double y) {
        return x + y;
    }

    public int addInt3(int x, int y, int z) {
        return x + y + z;
    }


}