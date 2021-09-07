public class Tuer {

    private boolean offen=false;
    private boolean verschlossen=false;

    public void oeffnen() {
        if(!verschlossen){
            offen = true;
        }
    }

    public void schliessen() {
        if(!verschlossen){
            offen = false;
        }
    }

    public void aufschliessen() {
        verschlossen = false;
    }

    public void zuschliessen() {
        verschlossen = true;
    }

    public boolean istVerschlossen() {
        return verschlossen;
    }

    public boolean istOffen() {
        return offen;
    }
}