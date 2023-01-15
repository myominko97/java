
public class PrimeNumberApp {
    AppUtil appUtil = new AppUtil();

    public static void main(String[] args) {
        new PrimeNumberApp().run();
        AppUtil.scan.close();
    }

    private void run() {
        appUtil.printHeaderFooter("WELCOME TO PRIME NUMBER PROGRAM ");
        do {
            System.out.println();
            // get start Number
            int start = appUtil.getInt("Enter Start Number :");

            int end = appUtil.getInt("Enter End Number :");

            int[] primes = findPrimes(start, end);

            System.out.println();
            if (primes.length > 0) {
                // show primes Number
                String verb = primes.length == 1 ? "is" : "are";
                String num = primes.length == 1 ? "number" : "numbers";
                System.out.printf("The prime %s between %d and %d %s ", verb, start, end, num);
                System.out.println();

                for (int i = 0; i < primes.length; i++)
                    System.out.print(primes[i] + ",");

            } else {
                System.out.printf("There is no privme number between %d and %d".formatted(start, end));
            }

            appUtil.printHeaderFooter("Thank You");

        } while (appUtil.geString("Want to Continue? /y/n :")
                .equalsIgnoreCase("y"));
    }

    private int[] findPrimes(int start, int end) {
        int[] primes = new int[0];
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                primes = addPrime(primes, i);
        }
        return primes;
    }

    private boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;

        }
        return true;

    }

    private int[] addPrime(int[] orginal, int data) {
        int[] temp = new int[orginal.length + 1];
        for (int i = 0; i < orginal.length; i++)
            temp[i] = orginal[i];

        temp[temp.length - 1] = data;
        orginal = temp;
        return orginal;
    }
}
