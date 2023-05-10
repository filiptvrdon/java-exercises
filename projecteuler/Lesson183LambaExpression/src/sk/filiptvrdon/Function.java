package sk.filiptvrdon;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "bravo",
                "charlie",
                "delta"
        ));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        list.forEach(s -> System.out.println(s));

    }
}
