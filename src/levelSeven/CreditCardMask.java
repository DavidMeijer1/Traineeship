package levelSeven;/* The aim of this exercise is to create a function that changes all characters in
a string to '#', except the last four.*/

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(mask("4556364607935616"));
        System.out.println(mask("64607935616"));
        System.out.println(mask("1"));
        System.out.println(mask(""));
        System.out.println(mask("Skippy"));
        System.out.println(mask("Nananananananananananananananana Batman!"));
    }

    static String mask(String string) {
        char[] array = string.toCharArray();
        if (array.length >= 4) {
            for (int i = 0; i < array.length - 4; i++) {
                array[i] = '#';
            }
        }
        return new String(array);
    }
}