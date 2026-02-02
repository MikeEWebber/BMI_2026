import java.util.Scanner;

public class BMI_2026 {

    // Weight (kg) / Height (m) ^2
    // Weight (ib) / Height (in) ^2 * 703




    public static void main(String[] args){

        boolean play = true;

        do {
            BMI();
            String repeat = getDetailsString("Enter 'y' to try again").toLowerCase();
            char repeatAgain = repeat.charAt(0);
            if (repeatAgain != 'y'){
                play = false;
            }
        } while (play);




    }

    private static void BMI(){
        double weight = getDetailsDouble("Enter weight in kg.");
        double height = getDetailsDouble("Enter height in meters");
        double BMI = weight/(height * 2);
        System.out.printf("Your BMI is %.1f", BMI);
        System.out.println("");
    }

    private static String getDetailsString(String message){
        System.out.println(message);
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextLine();

    }

    private static double getDetailsDouble(String message){

        System.out.println(message);
        Scanner myScanner = new Scanner(System.in);
        String response = myScanner.nextLine();
        try {
            return Double.parseDouble(response);


        } catch (Exception e){
            System.out.println("Incorrect user input");
            System.out.println(e);
            return 0;
        } finally {
            // myScanner.close();
        }

    }

}
