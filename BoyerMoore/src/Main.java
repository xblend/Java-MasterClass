import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharSequence chars = "abcafafasdwe";
        CharSequence pattern = "fafa";
        CharacterComparator comparator = new CharacterComparator();
        Map<Character, Integer> hm;
        hm = PatternMatching.buildLastTable(pattern);
        List<Integer> matches = new ArrayList<>();
        matches = PatternMatching.boyerMoore(pattern,chars,comparator);

        for(Character key : hm.keySet())
            System.out.println(key+":"+hm.getOrDefault(key,-1));

        for(Integer match : matches)
            System.out.println(match);
    }
}