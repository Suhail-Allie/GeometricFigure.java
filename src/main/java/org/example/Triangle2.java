package org.example;

    public class Triangle2 extends GeometricFigure2 {
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

