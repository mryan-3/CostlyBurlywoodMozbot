// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    System.out.print("Principal: ");
    int principal = scanner.nextInt();
    System.out.print("Annual Interest Rate: ");
    float annualInterestRate = scanner.nextFloat();
    System.out.print("Period (Years): ");
    int period = scanner.nextInt();

    float monthlyInterestRate = annualInterestRate /1200;

    int numberOfPayments = period * 12;
    
    float mortgage = principal * (monthlyInterestRate * (float)Math.pow(1 + monthlyInterestRate, numberOfPayments)/(float)Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.print("Mortgage: " + mortgageFormatted);
}
} 