class Color {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE_BACKGROUND="\\u001B[44m";
}
public class Rotation {
    public static void main(String[] args) {
        // Original coordinates of the triangle
        int[][] originalPoints = {{0, 0}, {1, 0}, {1, 1}};
        
        System.out.println(Color.RED+"Original Triangle Coordinates:"+Color.RESET);
        printPoints(originalPoints);
        
        // Rotate each point by 90 degrees anti-clockwise
        int[][] rotatedPoints = new int[3][2];
        for (int i = 0; i < originalPoints.length; i++) {
            int x = originalPoints[i][0];
            int y = originalPoints[i][1];
            // Apply rotation matrix: (x', y') = (-y, x)
            rotatedPoints[i][0] = -y;
            rotatedPoints[i][1] = x;
        }
        
        System.out.println(Color.BLUE+"\nRotated Triangle Coordinates (90° anti-clockwise):"+Color.RESET);
        printPoints(rotatedPoints);
    }
    
    // Helper method to print points
    private static void printPoints(int[][] points) {
        for (int[] point : points) {
            System.out.printf("(%d, %d)\n", point[0], point[1]);
        }
    }
}