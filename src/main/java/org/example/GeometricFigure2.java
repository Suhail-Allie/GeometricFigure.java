package org.example;

    public abstract class GeometricFigure2 implements SidedObject {
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


