package org.example.interviewProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {


    public static Character firstNonRepeatingChar(String str){
        List<Character> characterList = str.chars().mapToObj(c -> (char)c).toList();
        Character c =characterList.stream().
                collect(Collectors
                        .groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

        return c;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar(""));
    }
}
