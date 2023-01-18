package streamapi.collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {
    public static void main(String[] args) {
        BasketItem item = new BasketItem("USD", "Notes", "850");
        Traveller traveller1 = new Traveller();
        traveller1.setName("Mothusi");
        traveller1.setTravelDetails(new IntervalTravelDetails("2020", "JHB", "AIR"));
        traveller1.setAllocations(Arrays.asList(
                new OrderAllocation("USD", "Notes", "150"),
                new OrderAllocation("YAN", "Notes", "200")
        ));

        Traveller traveller2 = new Traveller();
        traveller2.setName("Tiyani");
        traveller2.setTravelDetails(new IntervalTravelDetails("2023", "BFN", "AIR"));
        traveller2.setAllocations(Arrays.asList(
                new OrderAllocation("USD", "Notes", "200"),
                new OrderAllocation("EURO", "Notes", "800")
        ));

        Traveller traveller3 = new Traveller();
        traveller3.setName("Ryan");
        traveller3.setTravelDetails(new IntervalTravelDetails("2021", "CPT", "AIR"));
        traveller3.setAllocations(Arrays.asList(
                new OrderAllocation("KJL", "Notes", "500"),
                new OrderAllocation("PULA", "Notes", "100"),
                new OrderAllocation("CAD", "Notes", "300")
        ));

        List<Traveller> travellers = Arrays.asList(traveller1, traveller2, traveller3);
        Map<IntervalTravelDetails, OrderAllocation> map =
                travellers
                        .stream()
                        .collect(
                                Collectors.toMap(Traveller::getTravelDetails, traveller ->
                                        traveller.getAllocations()
                                                .stream()
                                                .filter(orderAllocation -> orderAllocation.getCurrency().equals(item.currency)
                                                && orderAllocation.getProductType().equals(item.getProductType()))
                                                .collect(Collectors.toList())
                                ))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().size() == 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, allocation -> allocation.getValue().get(0)));

        System.out.println(map);
    }


    @Data
    @Accessors(chain = true)
    static class Traveller {
        String name;
        List<OrderAllocation> allocations;
        IntervalTravelDetails travelDetails;

        @Override
        public String toString() {
            return "Traveller{" +
                    "name='" + name + '\'' +
                    ", allocations=" + allocations +
                    ", travelDetails=" + travelDetails +
                    '}';
        }
    }

    @Data
    @AllArgsConstructor
    static class IntervalTravelDetails {
        String departureDate;
        String departurePort;
        String modeOfTransport;

        @Override
        public String toString() {
            return "IntervalTravelDetails{" +
                    "departureDate='" + departureDate + '\'' +
                    ", departurePort='" + departurePort + '\'' +
                    ", modeOfTransport='" + modeOfTransport + '\'' +
                    '}';
        }
    }

    @Data
    @AllArgsConstructor
    static class OrderAllocation {
        String currency;
        String productType;
        String amount;

        @Override
        public String toString() {
            return "OrderAllocation{" +
                    "currency='" + currency + '\'' +
                    ", productType='" + productType + '\'' +
                    ", amount='" + amount + '\'' +
                    '}';
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class BasketItem {
        String currency;
        String productType;
        String amount;

        @Override
        public String toString() {
            return "BasketItem{" +
                    "currency='" + currency + '\'' +
                    ", productType='" + productType + '\'' +
                    ", amount='" + amount + '\'' +
                    '}';
        }
    }

    public static void test() {
        String frenchCounting = "un:deux:trois:quatre";
        List<String> gmailList = Pattern.compile("[^0-9a-zA-Z]")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }
}