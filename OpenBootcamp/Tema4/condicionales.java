package OpenBootcamp.Tema4;

public class condicionales {

    public static void main(String args[]) {

        var numeroIf = -2;

        if (numeroIf > 0) {
            System.out.println("positivo");
        } else if (numeroIf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("0");
        }

        var numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        var numeroDoWhile = 1;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <= 1);

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "invierno";

        switch (estacion) {
            case "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            default:
                System.out.println("no es una estacion");
        }

    }
}