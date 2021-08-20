import java.util.Calendar;

public class IHK {
    public IHK() {
    }

    public static void main(String[] args) {
        IHK ihk = new IHK();
        int[][] zeiten = new int[][]{{2, 8, 10}, {2, 17, 20}, {3, 7, 50}, {6, 8, 0}, {6, 16, 0}, {7, 16, 30}, {8, 8, 20}, {8, 16, 40}, {20, 8, 10}};
        ihk.erzeugeListe(zeiten);
    }

    public void erzeugeListe(int[][] zeiten) {
        schreibeKopf(1, 2021, 2);
        int tage = tageImMonat(2, 2021);
        int tag = 1;
        int zeileNr = 0;

        int summe;
        for(summe = 0; tag <= tage; ++tag) {
            if (zeileNr < zeiten.length && tag == zeiten[zeileNr][0]) {
                if (zeileNr < zeiten.length - 1 && tag == zeiten[zeileNr + 1][0]) {
                    summe += zeiten[zeileNr][1] + zeiten[zeileNr][2];
                    schreibeZeile(zeiten[zeileNr][0], zeiten[zeileNr][1], zeiten[zeileNr][2], zeiten[zeileNr + 1][1], zeiten[zeileNr + 1][2], (zeiten[zeileNr + 1][1] - zeiten[zeileNr][1]) * 60 + (zeiten[zeileNr + 1][2] - zeiten[zeileNr][2]), "vollständiger Datensatz");
                    ++zeileNr;
                } else {
                    schreibeZeile(zeiten[zeileNr][0], zeiten[zeileNr][1], zeiten[zeileNr][2], -1, -1, 0, "Buchung fehlt");
                }

                ++zeileNr;
            } else {
                schreibeZeile(tag, -1, -1, -1, -1, 0, "nicht anwesend");
            }
        }

        schreibeFuss(summe);
    }

    public static int tageImMonat(int monat, int jahr) {
        Calendar cal = Calendar.getInstance();
        cal.set(jahr, monat, 1);
        return cal.getActualMaximum(5);
    }

    public static void schreibeKopf(int perNr, int jahr, int monat) {
        String[] Monate = new String[]{"Januar", "Februar", "März", "April", "Mai", "Juni", "July", "August", "September", "Oktober", "November"};
        System.out.println("Mitarbeiter:" + perNr + "             " + Monate[monat] + " " + jahr);
        System.out.println("");
        System.out.println("Tag Kommen Gehen Anwesenheit Bemerkungen");
    }

    public static void schreibeZeile(int tag, int std1, int min1, int std2, int min2, int anwTag, String bemerkung) {
        String sstd1 = std1 != -1 && min1 != -1 ? std1 + ":" + min1 : "    ";
        String sstd2 = std2 != -1 && min2 != -1 ? std2 + ":" + min2 : "    ";
        System.out.println(tag + "    " + sstd1 + "   " + sstd2 + "   " + anwTag / 60 + ":" + anwTag % 60 + "          " + bemerkung);
    }

    public static void schreibeFuss(int anwMonat) {
        System.out.println("==============================================");
        System.out.println("Summe Anwesenheit: " + anwMonat / 60 + ":" + anwMonat % 60);
    }
}
