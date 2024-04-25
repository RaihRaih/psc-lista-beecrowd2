import java.util.Scanner;

public class 1165 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    System.out.println("Digite o numero de testes: ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      x = scanner.nextInt();

      if (x % 2 == 1 && x / x == 1) {
        System.out.println(x + " eh primo\n");
      } else if (x == 2) {
        System.out.println(x + " eh primo\n");
      } else {
        System.out.println(x + " nao eh primo\n");
      }
    }
    scanner.close();
  }
}
