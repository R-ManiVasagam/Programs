/*Eg 1: Input: a1b10
        Output: abbbbbbbbbb
        Eg: 2: Input: b3c6d15
        Output: bbbccccccddddddddddddddd
        The number varies from 1 to 99.*/

import java.util.*;
public class RepeatCharacter {
    public static void main(String[] args) {
        String GivenString = "a2b5c23";
        List<String> CharacterList = new ArrayList<>(Arrays.asList(GivenString.split("[0-99]")));
        List<String> NumberList = new ArrayList<>(Arrays.asList(GivenString.split("[a-z]")));
        CharacterList.removeIf(Character->(Character.isEmpty()));
        NumberList.removeIf(Number->(Number.isEmpty()));
        RepeatCharacter obj = new RepeatCharacter();
        obj.printChar(CharacterList, NumberList);
    }
    void printChar(List<String> CharacterList, List<String> NumberList) {
        for (int i = 0; i < CharacterList.size(); i++) {
            for (int j = 0; j < Integer.valueOf(NumberList.get(i)); j++) {
                System.out.print(CharacterList.get(i));
            }
            System.out.println();
        }
    }
}
