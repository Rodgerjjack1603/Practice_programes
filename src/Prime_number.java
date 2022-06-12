public class Prime_number {
    public static void main(String[] args) {
        boolean isPrime = primes(4);
        System.out.println("This is a prime number : "+ isPrime);
    }

    public static boolean primes(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }
}
