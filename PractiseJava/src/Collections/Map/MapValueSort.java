package Collections.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueSort {

	public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        fruitPrices.put("Orange", 30);
        fruitPrices.put("Grapes", 80);
        fruitPrices.put("Mango", 50); // Duplicate value

        System.out.println("Original Map: " + fruitPrices);

        // --- Option A: Using Collections.sort() with a List of Map.Entry ---
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(fruitPrices.entrySet());

        // Sort in ascending order of values
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println("\nSorted by value (Ascending) using Collections.sort():");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // To sort in descending order:
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue()); // Swap for descending
            }
        });
        System.out.println("\nSorted by value (Descending) using Collections.sort():");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // --- Option B: Using Java 8 Streams (More concise and recommended) ---

        // Sort in ascending order of values
        Map<String, Integer> sortedMapAsc = fruitPrices.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) // Comparator for values
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function for duplicate keys (not relevant here, but required)
                        LinkedHashMap::new // Use LinkedHashMap to preserve order
                ));
        System.out.println("\nSorted by value (Ascending) using Streams (to LinkedHashMap): " + sortedMapAsc);

        // Sort in descending order of values
        Map<String, Integer> sortedMapDesc = fruitPrices.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) // Comparator for values, then reversed
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by value (Descending) using Streams (to LinkedHashMap): " + sortedMapDesc);


        // Handling ties (same value, sort by key then)
        Map<String, Integer> sortedMapWithTieBreaking = fruitPrices.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue() // Primary sort by value
                            .thenComparing(Map.Entry.comparingByKey())) // Secondary sort by key (for ties)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by value (Ascending) then by key (Ascending) for ties: " + sortedMapWithTieBreaking);
	}

}
