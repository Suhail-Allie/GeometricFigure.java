package org.example;
import java.util.Scanner;

    public class UseGeometric2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            GeometricFigure2[] figures = new GeometricFigure2[5];

            for (int i = 0; i < figures.length; i++) {
                System.out.println("Enter the type of figure (Square/Triangle) for object " + (i + 1) + ": ");
                String figureType = scanner.nextLine().trim().toLowerCase();

                if (figureType.equals("square")) {
                    System.out.println("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    figures[i] = new Square2(sideLength);

                } else if (figureType.equals("triangle")) {
                    System.out.println("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    figures[i] = new Triangle2(height, base);
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
            for (GeometricFigure2 figure : figures) {
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


