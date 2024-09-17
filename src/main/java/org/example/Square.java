package org.example;

    public class Square extends GeometricFigure {
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

