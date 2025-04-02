import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styleMap = new HashMap<>();

    public MarkerStyleFactory() {
        styleMap.put(MarkerTypes.HOSPITAL, new HospitalMarker());
        styleMap.put("restaurant", new RestaurantMarker());
        styleMap.put(MarkerTypes.GAS, new GasStationMarker());
    }

    public MarkerStyle getStyle(String type) {
        return styleMap.get(type);
    }

    public int getStyleCount() {
        return styleMap.size();
    }
}