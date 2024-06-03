package org.exercise.lexicagraphicalOrder.redditPracticalExercises;

import java.util.ArrayList;
import java.util.List;

public class RectangleFinder {

    public static List<Rectangle> findRectangles(int[][] image) {
        List<Rectangle> rectangles = new ArrayList<>();
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (image[i][j] == 0) {
                    // Encontrado la esquina superior izquierda de un rectángulo
                    Rectangle rectangle = new Rectangle(j, i, 1, 1);

                    // Expandir el rectángulo horizontalmente
                    while (j + rectangle.getWidth() < cols && image[i][j + rectangle.getWidth()] == 0) {
                        rectangle.setWidth(rectangle.getWidth() + 1);
                    }

                    // Expandir el rectángulo verticalmente
                    while (i + rectangle.getHeight() < rows && checkVertical(image, i, j, rectangle)) {
                        rectangle.setHeight(rectangle.getHeight() + 1);
                    }

                    rectangles.add(rectangle);
                }
            }
        }

        return rectangles;
    }

    private static boolean checkVertical(int[][] image, int startRow, int col, Rectangle rectangle) {
        for (int k = startRow; k < startRow + rectangle.getHeight(); k++) {
            if (image[k][col] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] image1 = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1},
        };

        int[][] image2 = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
        };

        List<Rectangle> rectangles1 = findRectangles(image1);
        List<Rectangle> rectangles2 = findRectangles(image2);

        for (Rectangle rectangle : rectangles1) {
            System.out.println(rectangle);
        }

        for (Rectangle rectangle : rectangles2) {
            System.out.println(rectangle);
        }
    }
}

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}


