//Start med at skrive en klasse der hedder IterateThroughArray
//Lav en main-metode og et double-array med værdierne {4.5, 25.3, 12.1, 34.0, 15.5 }.
//I de næste del-opgaver skal du skrive for-loops der gør forskellige ting. Udkommenter koden fra den tidligere opgave før du går i gang med den næste. Lad være med at slette den, eller lave om i den løsning du allerede har fået til at virke – så har du løsningen til at kigge på en anden gang.
//Til næste opgave skal vi lige kigge i Javas dokumentation. Søg i din browser på ”java 17 docs”. Gå ind på linket til Oracle Help Center. Nu er du inde på den officielle Java-dokumentation. Søg på java.lang.math i søgefeltet øverst til højre. Nu er du inde på Math-klassens dokumentation. Scroll ned og se alle de metoder Math-klassen indeholder. Fordi Math-klassens metoder er statiske behøver du ikke at lave et nyt objekt med new. I stedet kaldes metoderne således, fx hvis man vil finde kvadratroden af tallet 4.3:

public class IterateThroughArray {
    public static void main(String[] args) {
        double[] tal = {4.5, 25.3, 12.1, 34.0, 15.5};

        for(int i = 0; i < tal.length; i++){

                System.out.println(Math.pow(tal[i],2));


        }
        double mindsteværdi = tal[0];
        double højesteværdi = tal[0];
for (int x = 0; x < tal.length; x++) {
    if(tal[x] < mindsteværdi ){

        mindsteværdi = tal[x];

    }else if (tal[x] > højesteværdi) {
        højesteværdi = tal[x];
    } else if (tal[x] == 12.1) {
        System.out.println("Hurra jeg fandt værdien. Den stod på index " + x);

    }
}



        System.out.println("Mindsteværdien i vores array er = "+ mindsteværdi);
        System.out.println("Den største værdi i vores array er = "+ højesteværdi);

    }
}
