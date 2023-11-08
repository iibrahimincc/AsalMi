
public class Main {
    public static void main(String[] args) {


        int number = 22;
        int remainder = number % 2;   // remainder kalan demektir.
      System.out.println(remainder);
        boolean isPrime = true;       // isPrime asal mı demektir.

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }
}