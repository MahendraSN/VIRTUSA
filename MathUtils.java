class MathUtils {

    // Static method to find square
    static int square(int num) {
        return num * num;
    }

    // Static method to find cube
    static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        int number = 5;

        // Calling static methods without creating object
        System.out.println("Square: " + MathUtils.square(number));
        System.out.println("Cube: " + MathUtils.cube(number));
    }
}
