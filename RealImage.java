//Task1
//----------------------------------------------------------------------------------------------------------------------
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load();
    }

    private void load() {
        System.out.println(" image " + filename);
    }

    @Override
    public void display() {
        System.out.println(" full image " + filename);
    }
}
//----------------------------------------------------------------------------------------------------------------------
