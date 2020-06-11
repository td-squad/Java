public class FirebaseAnalytics implements TagAnalytics {


    @Override
    public void sendEvent(String valor) {
        System.out.println("Este es un tag de Firebase");
    }

    @Override
    public void sendScreen(String ventana) {
        System.out.println("Este es un Screem de Firebase");
    }

    @Override
    public String getName() {
        return "Firebase";
    }
}
