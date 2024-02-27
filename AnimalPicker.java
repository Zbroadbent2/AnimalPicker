import java.util.Scanner;//Scanner is used to read input from the user

public class AnimalPicker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String animal;

        while (true){ //While loop continously makes the user enter an animal until a valid option is entered
            System.out.println("Which animal would you like to see? A 'dog' or 'cat' or 'fish':");
            animal = scanner.nextLine().trim().toLowerCase();

            if (animal.equals("dog")){
                printDog();
                break;
            } else if (animal.equals("cat")){
                printCat();
                break;
            }//else if (animal.equals("fish")){
            // printFish();
            //  break;
         }// else {
        //         System.out.println("Error, please enter a valid option.");
        //     }
        }
        //scanner.close();
    //}
    private static void printDog(){
        //ASCII art for dog
        System.out.println("DOG ASCII ART HERE");
    }
    private static void printCat(){
        //ASCII art for cat
        System.out.println("CAT ASCII ART HERE");
    }
    // private static void printFish(){
    //     //ASCII art for fish
    //     System.out.println("FISH ASCII ART HERE");
    }
//}
