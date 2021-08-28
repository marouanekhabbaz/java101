public class Factorizer {
    public static void main(String[] args) {
        int numberA = 3;
        int numberB = 9;

        // create an instance of this class
        Factorizer factorizer = new Factorizer();

        //now call the method
        boolean result = factorizer.isFactor(numberA, numberB);

        // display the result
        if(result) {
            System.out.printf("%d is a factor of %d\n", numberA, numberB);
        } else {
            System.out.printf("%d is a NOT factor of %d\n", numberA, numberB);
        }
    }

    public boolean isFactor(int a, int b){
        int ans = b % a;
        return ans == 0;
    }
}
