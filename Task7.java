import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in
);

System.out.print("Vvedite chislo ot 0 do 20: ");
int n = sc.nextInt();

if (n < 0 || n > 20) {
System.out.println("Chislo dolzhno byt ot 0 do 20");
return;
}

long factorial = 1;

for (int i = 1; i <= n; i++) {
factorial = factorial * i;
}

System.out.println("Factorial: " + factorial);
}
}