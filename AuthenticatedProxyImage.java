//Task1
//----------------------------------------------------------------------------------------------------------------------
public class AuthenticatedProxyImage implements Image {
    private ProxyImage proxyImage;
    private String filename;
    private boolean isAuthenticated;

    public AuthenticatedProxyImage(String filename, boolean isAuthenticated) {
        this.filename = filename;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void display() {
        if (isAuthenticated) {
            if (proxyImage == null) {
                proxyImage = new ProxyImage(filename);
            }
            proxyImage.display();
        } else {
            System.out.println("Eror");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
