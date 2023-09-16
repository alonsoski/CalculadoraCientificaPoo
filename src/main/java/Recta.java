public class Recta {
    public static void main(String[] args) {
    }
    public static String recta(double x1, double y1, double x2, double y2) {
        if (x2 - x1 != 0) {
            double m = (y2 - y1) / (x2 - x1);
            double b = y1 - m * x1;
            return "y = " + m + "x + " + b;
        } else {
            return "Pendiente indefinida ";
        }
    }
}
