package org.example.Strings;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
public class MostFrequentIPAddress {

    public static void main(String args[]){
        List<String> logs = Arrays.asList(
                "192.168.1.1", "192.168.1.2", "192.168.1.1", "192.168.1.3",
                "192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.3", "192.168.1.3"
        );

        logs.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

}
