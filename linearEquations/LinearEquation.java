package linearEquations;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double determinant;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.determinant = this.a * this.d - this.b * this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public boolean isSolved() {
        return this.determinant != 0;
    }

    public double getDeterminant() {
        return this.determinant;
    }

    public double[] solution() {
        double[] arr = new double[2];
        if (isSolved()) {
            arr[0] = (this.e * this.d - this.b * this.f) / this.determinant;
            arr[1] = (this.a * this.f - this.e * this.c) / this.determinant;
        }

        return arr;
    }
}
