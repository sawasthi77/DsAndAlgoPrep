package org.example.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss"));
    }

    public static Character firstNonRepeatingChar(String s){
        Character[] ch = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Character nonRepeatingChar = Stream.of(ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        return nonRepeatingChar;
    }
}
