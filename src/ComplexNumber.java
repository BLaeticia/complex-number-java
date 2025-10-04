public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(
                real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real
        );
    }

    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    
}