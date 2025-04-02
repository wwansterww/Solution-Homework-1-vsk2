import java.util.ArrayList;
import java.util.List;

public public class FlyweightMapApp {
    public static void main(String[] args) {
        MarkerStyleFactory factory = new MarkerStyleFactory();
        List<Marker> markers = new ArrayList<>();

        String[] addresses = {
                "ул. Абая 24",
                "пр. Назарбаева 50",
                "Толе би 12",
                "Жибек Жолы 100",
                "Сейфуллина 88"
        };

        String[] types = {
                MarkerTypes.HOSPITAL,
                MarkerTypes.RESTURANT,
                MarkerTypes.GAS
        };

        for (int i = 0; i < 20; i++) {
            String address = addresses[i % addresses.length];
            String type = types[i % types.length];
            MarkerStyle style = factory.getStyle(type);

            markers.add(new Marker(address, style));
        }

        for (Marker marker : markers) {
            marker.render();
        }

        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique styles: " + factory.getStyleCount());
    }
}