public class AdobeAnalytics implements TagAnalytics {

    @Override
    public void sendEvent(String valor) {
        System.out.println("Este es un tag de Adobe");
    }

    @Override
    public void sendScreen(String ventana) {
        System.out.println("Este es un Screem de Adobe");
    }

    @Override
    public String getName() {
        return "Adobe";
    }
}
