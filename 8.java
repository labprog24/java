import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    ComplexNumber divide(ComplexNumber other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
        double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real part of Complex Number 1:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of Complex Number 1:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter real part of Complex Number 2:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of Complex Number 2:");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        System.out.println("Complex Number 1:");
        num1.display();
        System.out.println("Complex Number 2:");
        num2.display();

        ComplexNumber sum = num1.add(num2);
        System.out.println("Addition Result:");
        sum.display();

        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Subtraction Result:");
        difference.display();

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Multiplication Result:");
        product.display();

        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Division Result:");
        quotient.display();

        scanner.close();
    }
}
