package p09;

public class Sarasas {

    private Mokejimai[] mokejimai;
    private int size;


    public void add(Mokejimai m) {
        //TODO parasysiu veliau
        if (mokejimai == null) {
            mokejimai = new Mokejimai[2];
            mokejimai[0] = m;
            size = 1;
            return;
        }

        if (mokejimai.length == size) {
            Mokejimai[] m2 = new Mokejimai[size + 2];
            System.arraycopy(mokejimai, 0, m2, 0, size);
            mokejimai = m2;
        }

        // mokejimai.length > size
        mokejimai[size] = m;
        size++;
    }

    public int size() {
        return size;
    }

    public Mokejimai get(int index) {
        //TODO reikia tikrinti ar 0 <= index < size
        return mokejimai[index];
    }

}
