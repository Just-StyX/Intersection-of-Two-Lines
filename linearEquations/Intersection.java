package linearEquations;

public class Intersection extends LinearEquation {
    private double xnum;
    private double ynum;

    public Intersection(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(1, (y1 - y2) / (x2 - x1), 1, (y3 - y4) / (x4 - x3), (y1 * (x2 - x1) - x1 * (y2 - y1)) / (x2 - x1),
                (y3 * (x4 - x3) - x3 * (y4 - y3)) / (x4 - x3));

        double b = (y1 - y2) / (x2 - x1);
        double d = (y3 - y4) / (x4 - x3);
        double e = (y1 * (x2 - x1) - x1 * (y2 - y1)) / (x2 - x1);
        double f = (y3 * (x4 - x3) - x3 * (y4 - y3)) / (x4 - x3);
        this.xnum = e * d - b * f;
        this.ynum = f - e;
    }

    @Override
    public double[] solution() {
        double[] arr = new double[2];
        if (isSolved()) {
            arr[0] = this.xnum / getDeterminant();
            arr[1] = this.ynum / getDeterminant();
        }

        return arr;
    }
}
