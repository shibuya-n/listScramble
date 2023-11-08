import java.util.Scanner;

public class Word {
        String name;

        public String result = "";
        public Word(String x) {

            name = x;



        }

        public String scramble(){
            String scramble = "";
            String temp = "";

            scramble += name.substring(0,1);
            temp += name.substring(1, name.length()-1);

            for (int i = 0; i < name.length(); i++){
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
            scramble += name.substring(name.length()-1);
            return scramble;
        }

        public static String name(){
            System.out.println("First name and last name? ");
            return getUserInput();

        }
        public static String getUserInput() {
            Scanner input = new Scanner(System.in);
            String response = input.nextLine();

            return response;
        }


    }

