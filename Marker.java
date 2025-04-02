public class Marker {
    private String address;
    private MarkerStyle style;

    public Marker(String addr, MarkerStyle style) {
        this.address = addr;
        this.style = style;
    }

    public void render() {
        System.out.println("Marker located at: " + address);
        if (style != null)
            style.draw();
        else
            System.out.println("  [Error: style is null]");
    }
}