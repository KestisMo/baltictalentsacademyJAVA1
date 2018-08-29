package p04;
//Suraskite duotame intervale visus pirminius skaičius ir juos atspausdinkite
public class Uzduotis3ir4 {
    public static void main(String[] args) {
        int j = 0;
        int num = 0;

        String pirminiaiSkaiciai = "";

        for (j = 1; j <= 200; j++) {
            int skaitiklis = 0;
            for (num = j; num >= 1; num--) {
                if (j % num == 0) {
                    skaitiklis = skaitiklis + 1;
                }

            }
            if (skaitiklis == 2) {
                pirminiaiSkaiciai = pirminiaiSkaiciai + j + " ";
            }
        }
        System.out.println("Pirminiai skaiciai nuo 1 iki 50 yra : ");
        System.out.println(pirminiaiSkaiciai);

        ///////////////////////////////////////////////////////////////
        // Parašykite programą, kuri mokėtų suapvalinti double tipo skaičius pagal nurodytą tikslumą. Panaudokite matematinę funkciją Math.floor(…).
        double x = 984.672;
        double y = -497.99;
        double[] a = {4.2, 5.6, 8.9, 8, 15, 25.1};

        System.out.println("Math.floor(" + x +  ")=" + Math.floor(x));
        System.out.println("Math.floor(" + x +  ")=" + Math.floor(x*10.0)/10.0);
        System.out.println("Math.floor(" + x +  ")=" + Math.floor(x*10.0 + 0.5)/10.0);
        System.out.println("Math.floor(" + y + ")=" + Math.floor(y));
//        System.out.println("Math.floor(" + Arrays.toString(a) + ")=" + Arrays.toString(a));
        System.out.println("Math.floor(48.666)=" + Math.floor(48.666));
        System.out.println("Math.floor(48.666)=" + Math.floor(48.666*10.0)/10.0);
        System.out.println("Math.floor(48.666)=" + Math.floor(48.666*10.0+0.5)/10.0);
        System.out.println("Math.floor(48.666)=" + Math.floor(48.666*100.0+0.5)/100.0);
        System.out.println("Math.floor(48.666)=" + Math.floor(48.666*1.0+0.5)/1.0);
    }
}
