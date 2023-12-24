import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long v = n % 10 ;
        System.out.println(Math.abs(v));
    }
}
