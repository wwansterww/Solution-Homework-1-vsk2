//Task1
//----------------------------------------------------------------------------------------------------------------------
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new AuthenticatedProxyImage("p1.jpg", true);
        image1.display();

        Image image2 = new AuthenticatedProxyImage("p2.jpg", false);
        image2.display();
    }
}
//----------------------------------------------------------------------------------------------------------------------
