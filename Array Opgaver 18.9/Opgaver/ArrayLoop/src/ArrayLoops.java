import java.util.Arrays;

//Lav en klasse du kan bruge til at lave opgaverne i.
//Lav et tomt array som kan indeholde 8 elementer af typen int.
//Assign værdien 34 på den første plads i arrayet, og assign værdien 117 på den sidste plads i arrayet.
//Skriv et for-loop der itererer over arrayet og udskriver alle værdierne – hvad udskrives?
//Lav et array med Strings, som er 3 elementer langt og indeholder værdierne ”Hej”, ”med” og ”dig”.
//Lav et for each-loop der itererer over arrayet og udskriver de tre Strings, men med mellemrum imellem (dvs. Hej med dig og ikke Hejmeddig, eller ordene ovenover hinanden).
//Lav et array med doubles som indeholder værdierne 3.4, 2.5, 1.2, 6.7. Udskriv den værdi der står på index 2. Udskriv også længden på arrayet. Hvad sker der hvis du forsøger at udskrive en værdi på index 4?
public class ArrayLoops {


    public static void main(String[] args) {

        double[] talto = {3.4, 2.5, 1.2, 6.7};

        int[] tal = new int[8];
        tal[0] = 34;
        tal[7] = 117;
        String[] ord = {"hej", "med","dig", "victor","Kongobat"};

        for (String item : ord) {
            System.out.print(item+ " ");
        }

        System.out.println(" ");
        System.out.println(talto[talto.length-1] + " længden af arrray " + talto.length);

    }
}
