package NuetzlicheFunktion;

public class NuetzlicheFunktionen {

    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {
        if (elemente.length ==0) {
            return null;
        }
        Vergleichbar kleinste = null;

        for (int i = 0; i < elemente.length; i++) {
            kleinste = elemente[i];
        }
    }

    return kleinste;
}
