import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 0, count = 0;
    System.out.println("Digite o numero de testes: ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      count = 0;
      x = scanner.nextInt();
      for (int j = 2; j < x; j++) {
        if (x % j == 0) {
          count++;
        }
      }

      if (count == 0) {
        System.out.println(x + " eh primo");
      } else {
        System.out.println(x + " nao eh primo");
      }
    }
    scanner.close();
  }
}
