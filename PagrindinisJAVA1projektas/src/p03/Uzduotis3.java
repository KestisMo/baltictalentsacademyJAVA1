package p03;
//Duotas masyvas {-10, 0, 2, 9, -5}. Surūšiuokit masyvo
//elementus mažėjimo tvarka ir atspausdinkite.
public class Uzduotis3 {

    public static void main(String[] args) {

        int[] skaiciukai = {5, 10, 6, 8, 3, 4};

        boolean arKazkaKeitem = true;
        int zingsniai = 0;

        while (arKazkaKeitem) {

            arKazkaKeitem = false;

            for (int i = 0; i < skaiciukai.length - 1; i++) {

                zingsniai++;

                if (skaiciukai[i] > skaiciukai[i + 1]) {
                    arKazkaKeitem = true;

                    int x = skaiciukai[i];
                    skaiciukai[i] = skaiciukai[i + 1];
                    skaiciukai[i + 1] = x;
                }
            }
        }

        System.out.println("Viso zingsniu: " +  zingsniai);
        for (int e : skaiciukai) {
            System.out.println(" " + e);
        }


    }
}