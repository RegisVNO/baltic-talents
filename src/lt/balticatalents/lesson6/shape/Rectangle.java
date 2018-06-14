package lt.balticatalents.lesson6.shape;

class Rectangle extends Shape {
    private double x;
    private double y;

    Rectangle(double x, double y) {
        if (x <= 0 || y <= 0) {
            System.out.println("\nInvalid values!");
            System.out.println("Assigning default values... [1, 1]");
            this.x = 1;
            this.y = 1;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    Rectangle() {
        this.x = 1;
        this.y = 1;
    }

    @Override
    double area() {
        return x * y;
    }

    @Override
    double perimeter() {
        return 2 * (x + y);
    }

    boolean isSquare() {
        return x == y;
    }
}
