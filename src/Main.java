import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("How many names are there? ");
        int input = x.nextInt();

        String[] nameList = new String[input];
        String[] scrambledStrings = new String[input];



        for (int i = 0; i < nameList.length; i++) {
            x = new Scanner(System.in);
            System.out.println("What is #" + (i + 1) + " name? ");
            String name = x.nextLine().strip();

            nameList[i] = name;
        }
        System.out.println("Input words: " + Arrays.toString(nameList));

        for (int i = 0; i < nameList.length; i++){
            String temp =  nameList[i];
            scrambledStrings[i] = scramble(temp);

        }
        System.out.println("Output words: " + Arrays.toString(scrambledStrings));



    }
    public static String scramble(String input){
        String scramble = "";
        String temp = "";


        temp = input;

        for (int i = 0; i < input.length(); i++){
            int random = (int)(Math.random() * temp.length()-1) + 1;

            if (temp.length() == 1) {
                scramble += temp;
                break;
            }
            else {
                scramble += temp.charAt(random);

                temp = temp.substring(0, random) + temp.substring(random + 1);
            }

        }

        return scramble;
    }
}