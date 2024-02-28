import java.util.Scanner;//Scanner is used to read input from the user

public class AnimalPicker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String animal;

        while (true){ //While loop continously makes the user enter an animal until a valid option is entered
            System.out.println("Which animal would you like to see? A 'dog' or 'cat' or 'fish' or 'spiderman' or 'dog':");
            animal = scanner.nextLine().trim().toLowerCase();

            if (animal.equals("dog")){
                printDog();
                break;
            } else if (animal.equals("cat")){
                printCat();
                break;
            }else if (animal.equals("fish")){
                printFish();
                break;
            }else if (animal.equals("spiderman")){
                printSpiderman();
                break;
            
            }else if (animal.equals("bear")){

            }
            else{
                System.out.println("Error, please enter a valid option.");
             }
        }
        scanner.close();
   }
    private static void printDog(){
        //ASCII art for dog
        System.out.println("  __      _\r\n" + //
                        "o'')}____//\r\n" + //
                        " `_/      )\r\n" + //
                        " (_(_/-(_/");
    }
    private static void printCat(){
        //ASCII art for cat
        System.out.println(" /\\_/\\\r\n" + //
                        "( o.o )\r\n" + //
                        " > ^ <");
    }
    private static void printFish(){
        //ASCII art for fish
        System.out.println("      .            \r\n" + //
                        "\\_____)\\_____\r\n" + //
                        "/--v____ __`<         \r\n" + //
                        "        )/           \r\n" + //
                        "        '");
    }
    public static void printSpiderman(){
        //ASCII art for spiderman
        System.out.println("                   ,,,, \n             ,;) .\';;;;\',\n ;;,,_,-.-.,;;\'_,|I\\;;;/),,_\n  `\';;/:|:);{ ;;;|| \\;/ /;;;\\__\n      L;/-\';/ \\;;\\\',/;\\/;;;.\') \\\n      .:`\'\'` - \\;;\'.__/;;;/  . _\'-._ \n    .\'/   \\     \\;;;;;;/.\'_7:.  \'). \\_\n  .\'\'/     | \'._ );}{;//.\'    \'-:  \'.,L\n.\'. /       \\  ( |;;;/_/         \\._./;\\   _,\n . /        |\\ ( /;;/_/             \';;;\\,;;_,\n. /         )__(/;;/_/                (;;\'\'\'\'\'\n /        _;:\':;;;;:\';-._             );\n/        /   \\  `\'`   --.\'-._         \\/\n       .\'     \'.  ,\'         \'-,\n      /    /   r--,..__       \'.\\\n    .\'    \'  .\'        \'--._     ]\n    (     :.(;>        _ .\' \'- ;/\n    |      /:;(    ,_.\';(   __.\'\n     \'- -\'\"|;:/    (;;;;-\'--\'\n           |;/      ;;(\n           \'\'      /;;|\n                   \\;;|\n                    \\/");
    }
    public static void printBear(){
        System.out.println(" __         __\n/  \\.-\"\"\"-./  \\\n\\    -   -    /\n |   o   o   |\n \\  .-\'\'\'-.  /\n  \'-\\__Y__/-\'\n     `---`");
    }
}
