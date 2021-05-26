public class MAIN {
    public static void main(String[] args) throws InterruptedException {
        mein_toaster T = new mein_toaster("Weiß", 2, 0, 0, 0);
        T.toast_reintun(1,T);
        T.setToastzeit(4);
        T.toasten(T);
        T.toast_zustand_erfragen(T);
        T.toastAuswerfen(T);
        T.wieviele_toasts(T);
        super_toaster S = new super_toaster("schwarz", 4, 20, 0, 0, 100, "Kreis");
        S.toast_reintun(4, S);
        S.setToastzeit(40);
        S.set_temperatur(500, S);
        S.change_pattern("Dreieck", S);
        S.toasten(S);
        S.toast_zustand_erfragen(S);
        S.toastAuswerfen(S);
        S.wieviele_toasts(S);
    }
}
