//Task1
//----------------------------------------------------------------------------------------------------------------------
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("| Displaying a thumbnail of the image |" + filename);

        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

//----------------------------------------------------------------------------------------------------------------------

