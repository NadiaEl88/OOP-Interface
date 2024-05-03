public class CaesarVerschiebung implements Chiffrierung {
    private final static char[] ABC =
            new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Override
    public char chiffrieren(char zeichen) {
        boolean notFound = true;
        int counter = 0;
        char result = 0;

        while (notFound) {
            if (zeichen == ABC[counter]) {
                notFound = false;
                if (counter + 3 > ABC.length) {
                    result = ABC[counter + 3 - ABC.length];
                } else {
                    result = ABC[counter + 3];
                }
            } else {
                counter++;
            }
        }
        return result;
    }

    @Override
    public char dechiffrieren(char zeichen) {
        boolean notFound = true;
        int counter = 0;
        char result = 0;

        while (notFound) {
            if (zeichen == ABC[counter]) {
                notFound = false;
                if (counter - 3 < 0) {
                    result = ABC[ABC.length + (counter - 3)];
                } else {
                    result = ABC[counter - 3];
                }
            } else {
                counter++;
            }
        }
        return result;
    }
}