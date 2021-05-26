public class super_toaster extends mein_toaster{
    private int temperatur;
    private String pattern;

    @Override
    public int getAnzahl_toasts() {
        return super.getAnzahl_toasts();
    }

    @Override
    public int getSchaechte() {
        return super.getSchaechte();
    }

    @Override
    public int getToast_zustand() {
        return super.getToast_zustand();
    }

    @Override
    public int getToastzeit() {
        return super.getToastzeit();
    }

    @Override
    public String getFarbe() {
        return super.getFarbe();
    }

    @Override
    public void setAnzahl_toasts(int anzahl_toasts) {
        super.setAnzahl_toasts(anzahl_toasts);
    }

    @Override
    public void setToast_zustand(int toast_zustand) {
        super.setToast_zustand(toast_zustand);
    }

    @Override
    public void setToastzeit(int toastzeit) {
        super.setToastzeit(toastzeit);
    }

    public int getTemperatur() {
        return temperatur;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public super_toaster(String farbe, int schaechte, int toastzeit, int anzahl_toasts, int toast_zustand, int temperatur, String pattern) {
        super(farbe, schaechte, toastzeit, anzahl_toasts, toast_zustand);
        this.temperatur=temperatur;
        this.pattern=pattern;
    }

    @Override
    public void toast_zustand_erfragen(mein_toaster vMein_toaster) {
        super.toast_zustand_erfragen(vMein_toaster);
    }

    @Override
    public void toastAuswerfen(mein_toaster vMein_toaster) {
        super.toastAuswerfen(vMein_toaster);
    }

    @Override
    public void wieviele_toasts(mein_toaster vMein_toaster) {
        super.wieviele_toasts(vMein_toaster);
    }
    public void set_temperatur(int temp, super_toaster vSuper_toaster){
        if(temp>500){
            toastAuswerfen(vSuper_toaster);
            System.out.println("Fehler, Temperatur darf nicht über 500°C sein");
        }
        else vSuper_toaster.setTemperatur(temp);
    }
    public void change_pattern(String pattern, super_toaster vSuper_toaster){
        vSuper_toaster.setPattern(pattern);
        System.out.println("Das Toastbild wurde zu "+pattern+" geändert!");
    }
}
