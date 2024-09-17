package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //GeometricFigure
    public abstract static class GeometricFigure {
        protected double height;
        protected double width;
        protected String figureType;

        public GeometricFigure(double height, double width, String figureType) {
            this.height = height;
            this.width = width;
            this.figureType = figureType;
        }

        // Abstract method to calculate the area
        public abstract double determineArea();

        // Getter methods for the fields
        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public String getFigureType() {
            return figureType;
        }
    }

    //Square
    public static class Square extends org.example.GeometricFigure {
        private double area;

        public Square(double sideLength) {
            super(sideLength, sideLength, "Square");
            this.area = determineArea();
        }

        @Override
        public double determineArea() {
            return height * width; // Area of a square = side^2
        }

        // Getter for area
        public double getArea() {
            return area;
        }
    }

    //Triangle
    public static class Triangle extends org.example.GeometricFigure {
        private double area;

        public Triangle(double height, double base) {
            super(height, base, "Triangle");
            this.area = determineArea();
        }

        @Override
        public double determineArea() {
            return 0.5 * height * width; // Area of a triangle = 1/2 * base * height
        }

        // Getter for area
        public double getArea() {
            return area;
        }
    }

    //UseGeometric
    public static class UseGeometric {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            org.example.GeometricFigure[] figures = new org.example.GeometricFigure[5];

            for (int i = 0; i < figures.length; i++) {
                System.out.println("Enter the type of figure (Square/Triangle) for object " + (i + 1) + ": ");
                String figureType = scanner.nextLine().trim().toLowerCase();

                if (figureType.equals("square")) {
                    System.out.println("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    figures[i] = new org.example.Square(sideLength);

                } else if (figureType.equals("triangle")) {
                    System.out.println("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    figures[i] = new org.example.Triangle(height, base);
                } else {
                    System.out.println("Invalid figure type. Try again.");
                    i--; // Decrease the counter to redo this iteration
                    scanner.nextLine(); // Clear the buffer
                    continue;
                }
                scanner.nextLine(); // Clear the buffer for the next input
            }

            // Display details for each GeometricFigure
            System.out.println("\nDetails of the Geometric Figures:");
            for (org.example.GeometricFigure figure : figures) {
                System.out.println("Figure Type: " + figure.getFigureType());
                System.out.println("Height: " + figure.getHeight());
                System.out.println("Width: " + figure.getWidth());
                System.out.println("Area: " + figure.determineArea());
                System.out.println();
            }

            scanner.close();
        }
    }

    //SidedObject
    public interface SidedObject {
        void displaySides();
    }

    //GeometricFigure2
    public abstract static class GeometricFigure2 implements org.example.SidedObject {
        protected double height;
        protected double width;
        protected String figureType;

        public GeometricFigure2(double height, double width, String figureType) {
            this.height = height;
            this.width = width;
            this.figureType = figureType;
        }

        // Abstract method to calculate the area
        public abstract double determineArea();

        // Abstract method from SidedObject to display the number of sides
        @Override
        public abstract void displaySides();

        // Getter methods for the fields
        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public String getFigureType() {
            return figureType;
        }
    }

    //Square2
    public static class Square2 extends org.example.GeometricFigure2 {
        private double area;

        public Square2(double sideLength) {
            super(sideLength, sideLength, "Square");
            this.area = determineArea();
        }

        @Override
        public double determineArea() {
            return height * width; // Area of a square = side^2
        }

        @Override
        public void displaySides() {
            System.out.println("A square has 4 sides.");
        }

        // Getter for area
        public double getArea() {
            return area;
        }
    }

    //Triangle2
    public static class Triangle2 extends org.example.GeometricFigure2 {
        private double area;

        public Triangle2(double height, double base) {
            super(height, base, "Triangle");
            this.area = determineArea();
        }

        @Override
        public double determineArea() {
            return 0.5 * height * width; // Area of a triangle = 1/2 * base * height
        }

        @Override
        public void displaySides() {
            System.out.println("A triangle has 3 sides.");
        }

        // Getter for area
        public double getArea() {
            return area;
        }
    }

    //UseGeometric2
    public class UseGeometric2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            org.example.GeometricFigure2[] figures = new org.example.GeometricFigure2[5];

            for (int i = 0; i < figures.length; i++) {
                System.out.println("Enter the type of figure (Square/Triangle) for object " + (i + 1) + ": ");
                String figureType = scanner.nextLine().trim().toLowerCase();

                if (figureType.equals("square")) {
                    System.out.println("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    figures[i] = new org.example.Square2(sideLength);

                } else if (figureType.equals("triangle")) {
                    System.out.println("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    figures[i] = new org.example.Triangle2(height, base);
                } else {
                    System.out.println("Invalid figure type. Try again.");
                    i--; // Decrease the counter to redo this iteration
                    scanner.nextLine(); // Clear the buffer
                    continue;
                }
                scanner.nextLine(); // Clear the buffer for the next input
            }

            // Display details for each GeometricFigure
            System.out.println("\nDetails of the Geometric Figures:");
            for (org.example.GeometricFigure2 figure : figures) {
                System.out.println("Figure Type: " + figure.getFigureType());
                System.out.println("Height: " + figure.getHeight());
                System.out.println("Width: " + figure.getWidth());
                System.out.println("Area: " + figure.determineArea());
                figure.displaySides();
                System.out.println();
            }

            scanner.close();
        }
    }

}