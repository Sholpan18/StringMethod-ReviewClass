public class StringMethods2 {
    public static void main(String[] args) {

        String textFromApplication = " Enroll today ";
        String textFromUserStroy = "Enroll today";
        if (textFromApplication.trim().equals(textFromUserStroy)) {
            System.out.println("Text is matched. Test Pass");
        } else {
            System.out.println("Text is NOT matched. Test Failed");
        }
        //trim() - Returns a string whose value is this string,
        // with all leading and trailing white space removed.
        System.out.println(textFromApplication.trim());//"Enroll today"
        System.out.println(textFromApplication);//" Enroll today "


        //substring

        String str = "Hello Class";
        String part2 = str.substring(6);//Class
        System.out.println(part2);

        String part1 = str.substring(0, 5);//Hello
        System.out.println(part1);

        //concat- Returns: a string that represents the concatenation of this object's
        // characters followed by the string argument's characters.
        //Params: str – the String that is concatenated to the end of this String.
        String newString = part1.concat(" ").concat(part2);
        System.out.println(newString);

        System.out.println(part1 + " " + part2);

        //some examples

        char single = newString.substring(6).charAt(0);
        System.out.println(single);

        // newString.charAt(0).substring(6); ->compiler error

        //replace(); Replaces each substring of this string that matches
        // the literal target sequence with the specified literal replacement sequence.

        String myString = "Today is September";
        myString = myString.replace("September", "October");

        System.out.println(myString);

        myString = myString.replace('A', 'w');//doesn't replace if not found
        System.out.println(myString);

        //split();
        System.out.println("         SPLIT           ");
        String myStr="Today is a review class";

        String[] array=myStr.split (" ");
        System.out.println(array.length);//5
        System.out.println(array[3]);//review

        for(int i=0; i< args.length; i++){
            System.out.println(array[i]);
        }
        //other way
        System.out.println("Other way");
        for (String arr:array){
            System.out.println(arr);
        }

    }
}
