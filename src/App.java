public class App {
    public static void main( String[] args ) {

        Chiffrierung zwei =
                new Geheimtextalphabet(new char[] {'e','q','a','q','g','w','a','d','q','r','f','g','h','a','d','q','r','f','g','h','a','d','q','r','f','g','h','a'});

        char res1 = zwei.chiffrieren('d');
        char res2 = zwei.dechiffrieren('f');

        System.out.println(res1);
        System.out.println(res2);
    }
}
