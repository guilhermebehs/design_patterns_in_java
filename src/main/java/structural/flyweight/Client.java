package structural.flyweight;

import structural.flyweight.entities.Letter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Letter> catWord = new ArrayList<Letter>();
        List<Letter> carWord = new ArrayList<Letter>();

        catWord.add(LetterGeneratorFlyweight.generateLetter("c"));
        catWord.add(LetterGeneratorFlyweight.generateLetter("a"));
        catWord.add(LetterGeneratorFlyweight.generateLetter("t"));

        carWord.add(LetterGeneratorFlyweight.generateLetter("c"));
        carWord.add(LetterGeneratorFlyweight.generateLetter("a"));
        carWord.add(LetterGeneratorFlyweight.generateLetter("r"));

        catWord.forEach(letter -> System.out.print(letter.getName()));
        System.out.println();
        carWord.forEach(letter -> System.out.print(letter.getName()));
        System.out.println();

        System.out.println(carWord.get(0) == catWord.get(0));
        System.out.println(carWord.get(1) == catWord.get(1));

    }
}
