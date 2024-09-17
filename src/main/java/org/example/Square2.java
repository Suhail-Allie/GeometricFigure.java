package org.example;

    public class Square2 extends GeometricFigure2 {
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

