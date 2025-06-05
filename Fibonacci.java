

public class Fibonacci { 
public static void main(String[] args) { 
if (args.length < 1) { 
System.out.println("Please provide the number of terms as a command-line argument."); 
return; 
} 
int n = Integer.parseInt(args[0]); 
int a = 0, b = 1; 
System.out.print("Fibonacci Series: " + a + " " + b); 
for (int i = 2; i < n; i++) { 
int next = a + b; 
System.out.print(" " + next); 
a = b; 
b = next; 
} 
System.out.println(); 
} 
} 


