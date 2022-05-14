package structural.flyweight;

import structural.flyweight.entities.Letter;

import java.util.HashMap;
import java.util.Map;

public class LetterGeneratorFlyweight {

    private static Map<String,Letter> letters = new HashMap();

    public static Letter generateLetter(String name){
        if(!letters.containsKey(name))
           letters.put(name, new Letter(name));

        return letters.get(name);

    }
}
