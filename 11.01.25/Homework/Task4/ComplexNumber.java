public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumber;

    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber() {}

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(realNumber + num.realNumber, imaginaryNumber + num.imaginaryNumber);
    }

    public void add2(ComplexNumber num) {
        realNumber += num.realNumber;
        imaginaryNumber += num.imaginaryNumber;
    }

    public ComplexNumber sub(ComplexNumber num) {
        return new ComplexNumber(realNumber - num.realNumber, imaginaryNumber - num.imaginaryNumber);
    }

    public void sub2(ComplexNumber num) {
        realNumber -= num.realNumber;
        imaginaryNumber -= num.imaginaryNumber;
    }

    public ComplexNumber multNumber(double n) {
        return new ComplexNumber(realNumber * n, imaginaryNumber * n);
    }

    public void mult2(ComplexNumber num) {
        realNumber *= num.realNumber;
        imaginaryNumber *= num.imaginaryNumber;
    }

    public ComplexNumber multNumber(ComplexNumber n) {
        return new ComplexNumber(realNumber * n.realNumber - imaginaryNumber * n.imaginaryNumber,
                realNumber * n.imaginaryNumber + imaginaryNumber * n.realNumber);
    }

    public void multNumber2(ComplexNumber n) {
        realNumber = realNumber * n.realNumber - imaginaryNumber * n.imaginaryNumber;
        imaginaryNumber = realNumber * n.imaginaryNumber + imaginaryNumber * n.realNumber;
    }

    public ComplexNumber divNumber(ComplexNumber n) {
        double real = (realNumber * n.realNumber + imaginaryNumber * n.imaginaryNumber) / (Math.pow(n.realNumber, 2) + Math.pow(n.imaginaryNumber, 2));
        double image = (imaginaryNumber * n.realNumber - realNumber * n.imaginaryNumber) / (Math.pow(n.realNumber, 2) + Math.pow(n.imaginaryNumber, 2));
        return new ComplexNumber(real, image);
    }

    public void divNumber2(ComplexNumber n) {
        realNumber = (realNumber * n.realNumber + imaginaryNumber * n.imaginaryNumber) / (Math.pow(n.realNumber, 2) + Math.pow(n.imaginaryNumber, 2));
        imaginaryNumber = (imaginaryNumber * n.realNumber - realNumber * n.imaginaryNumber) / (Math.pow(n.realNumber, 2) + Math.pow(n.imaginaryNumber, 2));
    }

    public double length() {
        return Math.sqrt(Math.pow(realNumber, 2) + Math.pow(imaginaryNumber, 2));
    }

    public String toString() {
        return imaginaryNumber > 0 ? realNumber + " + " + imaginaryNumber + "i" : realNumber + " - " + imaginaryNumber + "i";
    }

    public boolean equals(ComplexNumber n) {
        return realNumber == n.realNumber && imaginaryNumber == n.imaginaryNumber;
    }
}
