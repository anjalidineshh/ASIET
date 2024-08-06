import java.util.Scanner;
class frequency
 {
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        System.out.println("Enter the character to find:");
        char ch = s.next().charAt(0);
        int freq= 0;
        for (int i = 0; i <str.length(); i++)
         {
            if (str.charAt(i) == ch) 
            {
                freq++;
            }
        }

        System.out.println("The frequency of " + ch+ " = " + freq);
        s.close();
    }
}

