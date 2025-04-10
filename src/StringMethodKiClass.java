public class StringMethodKiClass  {
    public static void main(String[] args){
        String name ="Honeyoney";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);

        String name2="HarendDer";
        String value2=name2.toLowerCase(); //toLowerCase(), name2.trim(),
        System.out.println(value2);

        String nonTrimmedString= "  Harender Ji   ";
        System.out.println(nonTrimmedString);
        String trimmedString=nonTrimmedString.trim(); //creating a new variable trimmedString and triming nontrim variable
        System.out.println(trimmedString);
        System.out.println(nonTrimmedString.trim()); // here we directly print without creating new variable.

        System.out.println(name.substring(2)); //in this we pass the starting index of the string from which it get print up to the last of the string
        System.out.println(name.substring(1,3)); // 1 is starting index and 3 is end index

        System.out.println(name.replace('h', 'D'));// it will result Doney , will replace h to Sin string of Honey
        System.out.println(name.replace("ney","doyy")); // it will replace the ney to doyy and result will be Hodoyy
        System.out.println(name.startsWith("Hown")); //return false as the string is not starting with hown, it returns booleans values
        System.out.println(name.endsWith("ey")); //return true as the string is ending with ey, it returns booleans values
        System.out.println(name.charAt(2)); //it will give the result of that char whoch is at 2nd index. Result will be 'n'
        System.out.println(name.indexOf("ey")); // it will give the index number on which this given string first char present. e is present at 3rd index so it will result 3
        System.out.println(name.indexOf("ey", 4)); //it will return -1 if it does not get any answer anf got hte answer then it will start search from 4th index up to last and fwill give answer
        System.out.println(name.lastIndexOf("o")); //it reads string from last it will return and give index, here it will return 1 as it is on1 index but it read fro  last
        System.out.println(name.lastIndexOf(name.lastIndexOf("ey" , 4)));
        System.out.println(name.equals("Honey")); // it will return true or false , it matches the string
        System.out.println(name.equalsIgnoreCase("honeYoNey")); //it will ignore case sensitivity of the given string




    }
}
