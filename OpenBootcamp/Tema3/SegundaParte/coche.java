package OpenBootcamp.Tema3.SegundaParte;

public class coche {

    private int puertas;

    public int incremento() {
        return puertas + 1;
    }

    public static void main(String args[]) {
        coche miCoche = new coche();
        miCoche.puertas = 4;
        System.out.println(miCoche.incremento());

    }

}
