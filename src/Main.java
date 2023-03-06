import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        while (play) {
            // Je kan hierboven play == true verkorten naar 'play' omdat deze altijd checkt of iets 'true' is. Dus je hoeft het niet specifiek te benoemen.
            System.out.println("Type 'x' om te stoppen");
            System.out.println("Type 'v' om te vertalen");
            String input = scanner.nextLine();

            //Syntax voor Strings is met .equals.
            //Je kan hier ook Objects.equals gebruiken.
            if (input.equalsIgnoreCase("x")) {
                play = false;
                break;
            }

            else if (input.equalsIgnoreCase("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
               else {
                    System.out.println("Ongeldig");
                }
            }

            else {
                System.out.println("Ongeldig");
            }
        }


      /*  HashSet<Integer> secretnumber = randomNumberGenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();*/

    }
/*

Begonnen aan bonus opdracht maar ik kom er totaal niet uit.

    public HashSet<Integer> randomNumberGenerator() {
        HashSet<Integer> numbers = new HashSet<>(4);
        Random randomNumbers = new Random();
        while (numbers.size() < 4) {
            int number = randomNumbers.nextInt();
            numbers.add(number);
        }
        return numbers;
    }

    public String hashSetToString(HashSet<Integer> numbers) {
        String fourNumbers = new String();
        for (int number : numbers) {
            fourNumbers.(number);
        }
        return;
    }*/

    /*
     Deze methode is voor de bonus opdracht.
     */
    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
