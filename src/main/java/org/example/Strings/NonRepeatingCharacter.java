package org.example.Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

    static void nonRepeatingChar(String str){
        List<Character> characters = str.chars().mapToObj(c -> (char)c).toList();

        Character out = characters.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(out);
    }

    public static void main(String[] args) {
        nonRepeatingChar("swiaaqtbdavxuiet");
    }
}
