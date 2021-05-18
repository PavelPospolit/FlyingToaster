public class MAIN {
    public static void main(String[] args) throws InterruptedException {
        mein_toaster T = new mein_toaster("Weiß", 2, 0, 0, 0);
        T.toast_reintun(1,T);
        T.setToastzeit(4);
        T.toasten(T);
        T.toast_zustand_erfragen(T);
        T.toastAuswerfen(T);
        T.wieviele_toasts(T);
    }
}
