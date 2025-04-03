////Task2
////----------------------------------------------------------------------------------------------------------------------
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class FlyweightWithAddresses {
//    public static void main(String[] args) {
//        StyleRegistry registry = new StyleRegistry();
//        List<MarkerInstance> mapMarkers = new ArrayList<>();
//        Random rand = new Random();
//
//        String[] addresses = {
//                "ул. Абая 24, Алматы",
//                "пр. Назарбаева 50, Астана",
//                "ул. Толе би 12, Шымкент",
//                "ул. Жибек Жолы 100, Алматы",
//                "ул. Сейфуллина 88, Кызылорда"
//        };
//
//        String[] types = {
//                MarkerType.HOSPITAL,
//                MarkerType.RESTAURANT,
//                MarkerType.GAS
//        };
//
//        int totalMarkers = 10000;
//
//        for (int i = 0; i < totalMarkers; i++) {
//            String address = addresses[i % addresses.length];
//            String type = types[rand.nextInt(types.length)];
//            IMarkerStyle style = registry.getStyle(type);
//            mapMarkers.add(new MarkerInstance(address, style));
//        }
//
//        for (int i = 0; i < 5; i++) {
//            mapMarkers.get(i).render();
//        }
//
//        System.out.println("Total markers created: " + mapMarkers.size());
//        System.out.println("Unique styles used: " + registry.countStyles());
//    }
//}
////----------------------------------------------------------------------------------------------------------------------