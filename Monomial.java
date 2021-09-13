public class Monomial {
    private double coefficient;
    private int exponent;

    public Monomial(double coeff, int exp) {
        coefficient = coeff;
        exponent = exp;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }
}
