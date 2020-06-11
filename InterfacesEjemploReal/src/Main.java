public class Main {

    public static void main(String[] args) {
        TagAnalytics firebase = new FirebaseAnalytics();
        TagAnalytics adobe = new AdobeAnalytics();

        firebase.sendEvent("OnClick Login");
        firebase.sendScreen("LoginView");

        adobe.sendEvent("OnClick Login");
        adobe.sendScreen("LoginView");

        System.out.println(firebase.getName());
        System.out.println(adobe.getName());

    }
}
