package javaprograms;

//ConstructorOverloading Example:

public class Perimeter {
    // perimeter of square
    public int calculatePerimeter(int side) {
        return 4 * side;  // Perimeter of square = 4 * side
    }

    // perimeter of a rectangle
    public int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);  // Perimeter of rectangle = 2 * (length + breadth)
    }

    //  perimeter of a circle
    public double calculatePerimeter(double r, boolean Circle) {
       return 2 * (22/7) * r;  // Perimeter of circle = 2 * (22/7) * radius
        
    }

    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        // Calculating perimeter of a square with side = 10
        int squarePerimeter = perimeter.calculatePerimeter(10);
        System.out.println("Perimeter of square: " + squarePerimeter);

        // Calculating perimeter of a rectangle with length = 5 and breadth = 2
        int rectanglePerimeter = perimeter.calculatePerimeter(5, 2);
        System.out.println("Perimeter of rectangle: " + rectanglePerimeter);

        // Calculating perimeter of a circle with radius = 9
        double circlePerimeter = perimeter.calculatePerimeter(9);
        System.out.println("Perimeter of circle: " + circlePerimeter);
    }
}

//OUTPUT:

/*Perimeter of square: 40
Perimeter of rectangle: 14
Perimeter of circle: 54.0
*/