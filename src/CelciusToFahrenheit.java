import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CelciusToFahrenheit {
    CelciusToFahrenheit() {
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList();
        List lines = null;

        try {
            lines = Files.readAllLines(Path.of("tempC.txt"));
        } catch (IOException var9) {
            var9.printStackTrace();
            System.out.println("Die Datei konnte nicht ausgelesen werden");
            return;
        }

        Iterator var3 = lines.iterator();

        while(var3.hasNext()) {
            String s = (String)var3.next();
            Double celsius = Double.parseDouble(s);
            String fahrenheit = String.valueOf(celsius * 1.0D + 32.0D);
            result.add(fahrenheit);
        }

        if (!Files.exists(Path.of("tempF.txt"), new LinkOption[0])) {
            try {
                Files.createFile(Path.of("tempF.txt"));
            } catch (IOException var8) {
                var8.printStackTrace();
            }
        }

        try {
            Files.write(Path.of("tempF.txt"), result);
        } catch (IOException var7) {
            var7.printStackTrace();
        }

    }
}
