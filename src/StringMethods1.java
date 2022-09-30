public class StringMethods1 {
    public static void main(String[] args) {

        String str = "hello";

        //toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str);//hello

        System.out.println("------");

        str = str.toUpperCase();
        System.out.println(str);//HELLO

        //length() -> returns the length of this string
        int size = str.length();
        System.out.println(size);

        //charAt() -> returns the char value at the specified indexes
        char letter = str.charAt(0);
        System.out.println(letter);

        //how to get the last character
        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println(lastCharacter);

        //indexOf - Returns:
        //the index of the first occurrence of the character in the character
        // sequence represented by this object, or -1 if the character does not occur.
        int index = str.indexOf(lastCharacter);
        System.out.println(index);//4
        System.out.println(str.indexOf('a'));//-1

        //isEmpty() - returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);





    }
}
