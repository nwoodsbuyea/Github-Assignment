import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner uName = new Scanner(System.in);

    System.out.println("What is your name?");
    String userName = uName.nextLine();
    System.out.println("Hello " + userName + "!");
	
	uName.close();
  }
}