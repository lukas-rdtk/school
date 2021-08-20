import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Klassendurchschnitt {
    public Klassendurchschnitt() {
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList();
        List lines = null;

        try {
            lines = Files.readAllLines(Path.of("Klasse.csv"));
        } catch (IOException var7) {
            var7.printStackTrace();
            System.out.println("program konnte die datei nicht finden");
            System.exit(0);
        }

        Iterator var3 = lines.iterator();

        while(var3.hasNext()) {
            String s = (String)var3.next();
            System.out.println(s.substring(s.length() - 1));
            result.add(s.substring(s.length() - 1));
        }

        Double durchschnitt = 0.0D;

        String i;
        for(Iterator var8 = result.iterator(); var8.hasNext(); durchschnitt = durchschnitt + Double.parseDouble(i)) {
            i = (String)var8.next();
        }

        System.out.println("duchschnitt ist: " + durchschnitt / (double)result.size());
    }
}
