import static java.lang.Thread.sleep;

public class mein_toaster {
    private final String farbe;
    private final int schaechte;
    private int toastzeit;
    private int anzahl_toasts;
    public int toast_zustand;

    public String getFarbe() {
        return farbe;
    }

    public int getSchaechte() {
        return schaechte;
    }

    public int getToastzeit() {
        return toastzeit;
    }

    public void setToastzeit(int toastzeit) {
        this.toastzeit = toastzeit;
    }

    public int getAnzahl_toasts() {
        return anzahl_toasts;
    }

    public void setAnzahl_toasts(int anzahl_toasts) {
        this.anzahl_toasts = anzahl_toasts;
    }

    public int getToast_zustand() {
        return toast_zustand;
    }

    public void setToast_zustand(int toast_zustand) {
        this.toast_zustand = toast_zustand;
    }

    public mein_toaster(String farbe, int schaechte, int toastzeit, int anzahl_toasts, int toast_zustand){
        this.farbe = farbe;
        this.schaechte = schaechte;
        this.toastzeit = toastzeit;
        this.anzahl_toasts = anzahl_toasts;
        this.toast_zustand = toast_zustand;
    }

    public void toast_reintun(int x, mein_toaster vMein_toaster){
        if(x<=vMein_toaster.getSchaechte()){
            vMein_toaster.setAnzahl_toasts(x);
            vMein_toaster.setToast_zustand(0);
            System.out.println("Okay!");

        }
        else System.out.println("Nicht genug Platz");
    }
    public static void toasten(mein_toaster vMein_toaster) throws InterruptedException {
        if(vMein_toaster.getAnzahl_toasts()==0){
            System.out.println("Geht nicht, kein Toast drin");
        }
        else{
            for(int i=0; i<=vMein_toaster.getToastzeit(); i++){
                System.out.println(i);
                sleep(1000);
            }
            System.out.println("Fertig!");
            mein_toaster.toast_zustand_aendern(vMein_toaster);

        }
    }
    public static void toast_zustand_aendern(mein_toaster vMein_toaster){
        if(vMein_toaster.getToastzeit() <= 15){
            vMein_toaster.setToast_zustand(0);
        }
        else if(vMein_toaster.getToastzeit()<=30){
            vMein_toaster.setToast_zustand(1);
        }
        else if(vMein_toaster.getToastzeit()<=45){
            vMein_toaster.setToast_zustand(2);
        }
        else if(vMein_toaster.getToastzeit()>45){
            vMein_toaster.setToast_zustand(3);
        }
    }
    public void toast_zustand_erfragen(mein_toaster vMein_toaster){
        System.out.println("Toastzustand: "+vMein_toaster.getToast_zustand());
    }
    public void toastAuswerfen(mein_toaster vMein_toaster){
        System.out.println(vMein_toaster.getAnzahl_toasts()+" Toasts ausgeworfen, Toaster leer.");
        vMein_toaster.setAnzahl_toasts(0);
    }
    public void wieviele_toasts(mein_toaster vMein_toaster){
        System.out.println("Anzahl Toasts: "+vMein_toaster.getAnzahl_toasts());
    }
}
