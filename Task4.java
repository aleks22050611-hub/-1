import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in
);

System.out.print("Skolko chisel? ");
int n = sc.nextInt();

if (n <= 0) {
System.out.println("Nuzhno vvesti chislo bolshe 0");
return;
}

int[] numbers = new int[n];

int i = 0;
while (i < n) {
System.out.print("Vvedite chislo: ");
numbers[i] = sc.nextInt();
i++;
}

int sumWhile = 0;
i = 0;
while (i < n) {
sumWhile += numbers[i];
i++;
}

int sumDoWhile = 0;
int min = numbers[0];
int max = numbers[0];
i = 0;

do {
sumDoWhile += numbers[i];
if (numbers[i] < min) min = numbers[i];
if (numbers[i] > max) max = numbers[i];
i++;
} while (i < n);

System.out.println("Summa while: " + sumWhile);
System.out.println("Summa do while: " + sumDoWhile);
System.out.println("Minimum: " + min);
System.out.println("Maximum: " + max);
}
}