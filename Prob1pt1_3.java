package Day1;

public class Prob1pt1_3 {
	static boolean boolValue;
    static double doubleValue;
    static float floatval;
    static int intval;
    static String stringval;

    public static void main(String[] args) {
        System.out.println("1.1 Display a message\n");
        System.out.println("1.2 Displaying Default values of all primitive data types");

        System.out.println("boolValue= " + boolValue);
        System.out.println("doubleValue " + doubleValue);
        System.out.println("floatval " + floatval);
        System.out.println("intval " + intval);
        System.out.println("stringval " + stringval + "\n");
        System.out.println("checking two strings are equal or not");

        String s1 = "Sachin";
        String s2 = "Nitin";
        String s3 = "Nitin";
        System.out.println( s1.equals(s2) );
        System.out.println( s2.equals(s3) + " \n ");
        System.out.println("Furher programs are in differnt java files.");

    }
}
