public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean isPrime[] =new boolean[N+1];
        for (int i=2;i < isPrime.length;i++) {
            isPrime[i] = true;
        }
        int i = 2;
        int j;
        while (i < isPrime.length) {
            j=i;
            while (j < isPrime.length) {
                if (i != j && j % i == 0) {
                    isPrime[j] = false;
                }
                j++;
            }
            i++;
        }
        System.out.println("Prime numbers up to "+ N +":");
        int count = 0;
        for (int h = 0;h < isPrime.length;h++) {
            if (isPrime[h] == true) {
                System.out.println(h);
                count++;
            }
        }
        double percents = (double) count/N;
        System.out.println("There are " + count +" primes between 2 and " + N +" ("+ (int) (percents*100) +"% are primes)");
    }
}