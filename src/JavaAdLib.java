import java.util.Scanner;

public class JavaAdLib {
    public static void main(String[] args) {
        int number;
        double secondNumber, total;
        String name, firstNoun, secondNoun, firstVerb, secondVerb, thirdVerb,
                firstAdjective, secondAdjective, thirdAdjective;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give an integer: ");
        number = sc.nextInt();
        System.out.println("Please give a double: ");
        secondNumber = sc.nextDouble();
        //buffer
        sc.nextLine();
        System.out.println("Please give a noun: ");
        firstNoun = sc.nextLine();
        System.out.println("Please give another noun: ");
        secondNoun = sc.nextLine();
        System.out.println("Please give a name: ");
        name = sc.nextLine();
        System.out.println("Please give a verb: ");
        firstVerb = sc.nextLine();
        System.out.println("Please give another verb: ");
        secondVerb = sc.nextLine();
        System.out.println("Please give a final verb: ");
        thirdVerb = sc.nextLine();
        System.out.println("Please give an adjective: ");
        firstAdjective = sc.nextLine();
        System.out.println("Please give another adjective: ");
        secondAdjective = sc.nextLine();
        System.out.println("Please give a final adjective: ");
        thirdAdjective = sc.nextLine();
        total = number * secondNumber;

        //spews out an absolutely nonsensical story
        System.out.println("Once upon a time there was a " + firstNoun + " that was called " + name + " and it had " + firstAdjective + " hair. One morning it went on a "
        + firstVerb + " to a " + secondNoun + " which charged $" + secondNumber + " for " + number + " cars for a total of $" + total
        + ". But " + secondNoun + " " + secondVerb + "ed with some " + secondAdjective + " eyes " + thirdVerb + " at "
        + name + " and noticed their " + thirdAdjective + " shoes.");

    }
}
