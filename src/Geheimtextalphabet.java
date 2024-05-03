public class Geheimtextalphabet implements Chiffrierung {
    private final static char[] ABC =
            new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private char[] geheimtextalphabet = new char[26];

    Geheimtextalphabet(char[] geheimtextalphabet) {
        this.geheimtextalphabet = geheimtextalphabet;
    }

    @Override
    public char chiffrieren(char zeichen) {
        char result = 0;
        for (int i = 0; i < ABC.length; i++) {
            if (zeichen == ABC[i]) {
                result = geheimtextalphabet[i];
                break;
            }
        }
        return result;
    }

    @Override
    public char dechiffrieren(char zeichen) {
        char result = 0;
        for (int i = 0; i < geheimtextalphabet.length; i++) {
            if (zeichen == geheimtextalphabet[i]) {
                result = ABC[i];
                break;
            }
        }
        return result;
    }
}