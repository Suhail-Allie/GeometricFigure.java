package org.example;

    public abstract class GeometricFigure {
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


