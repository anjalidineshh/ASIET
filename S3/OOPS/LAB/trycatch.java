class main
{
public static void main (String args[]) {
try
{
System.out.println ("Try Block");
int a = 125 / 5;
System.out.println ("Result:" +a);
}
catch (NullPointerException e) {
System.out.println ("Catch Block");
System.out.println (e);
}
finally {
System.out.println (" Finally Block");
System.out.println ("No Exception:Finally block executed");
}
System.out.println ("Rest of the code...");
}
}
