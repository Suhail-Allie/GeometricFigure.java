package org.example;

    public class Triangle extends GeometricFigure {
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


