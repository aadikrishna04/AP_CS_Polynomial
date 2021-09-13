public class Polynomial {
    Monomial firstTerm;
    Monomial secondTerm;
    Monomial thirdTerm;

    public Monomial getFirst(Monomial firstTerm) {
        this.firstTerm = firstTerm;
        return firstTerm;
    }

    public Monomial getSecond(Monomial secondTerm) {
        this.secondTerm = secondTerm;
        return secondTerm;
    }

    public Monomial getThird(Monomial thirdTerm) {
        this.thirdTerm = thirdTerm;
        return thirdTerm;
    }

    public Polynomial() {}

    public Polynomial(Monomial firstTerm, Monomial secondTerm, Monomial thirdTerm) {
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
        this.thirdTerm = thirdTerm;
    }

    public double evaluate(double x) {
        double evaluated = (firstTerm.getCoefficient()* Math.pow(x, 2)) + (secondTerm.getCoefficient() * x) + thirdTerm.getCoefficient();
        return evaluated;
    }

    public String toString() {
        return firstTerm.getCoefficient() + "x^" + firstTerm.getExponent() + " + " + secondTerm.getCoefficient() + "x + " + thirdTerm.getCoefficient();
    }
}
