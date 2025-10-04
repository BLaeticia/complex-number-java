public class main1 {
    
    public static void main (String[] args) {
        
        ComplexNumber c1 = new ComplexNumber(2, 4);
        ComplexNumber c2 = new ComplexNumber(6, 7);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));
        System.out.println("Modulus of c1: " + c1.modulus());
        System.out.println("Modulus of c2: " + c2.modulus());
    }
}