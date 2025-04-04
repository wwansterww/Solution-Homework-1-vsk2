//Task1
//----------------------------------------------------------------------------------------------------------------------
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load();
    }

    private void load() {
        System.out.println("| Preparing the image | " + filename);
    }

    @Override
    public void display() {
        System.out.println("| Showing the full image | " + filename);
    }
}
//----------------------------------------------------------------------------------------------------------------------
