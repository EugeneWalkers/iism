package labs.lab2.utilities.concreteDistributions;

import labs.lab2.utilities.CumulativeDistribution;

public class PoissonDistribution implements CumulativeDistribution {

    private final double lambda;

    public PoissonDistribution(final double lambda) {
        this.lambda = lambda;
    }

    @Override
    public double getDistributionFunctionValue(final double i) {
        double result = 0;

        for (int k = 0; k <= i; k++) {
            result += getP(k);
        }

        return result;
    }

    @Override
    public double getExpectedValue() {
        return lambda;
    }

    @Override
    public double getVariance() {
        return lambda;
    }

    @Override
    public double getP(final int i) {
        double result = Math.exp(-lambda);

        for (double k = 1; k <= i; k++) {
            result *= lambda / k;
        }

        return result;
    }


    @Override
    public String getDescription() {
        return "Распределение Пуассона.";
    }
}
