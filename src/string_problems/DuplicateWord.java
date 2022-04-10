package string_problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find duplicate words and the number of occurrences of those words in the given string.
            Also, find the average length of all the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here

        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + " " + Collections.frequency(list, word));
        }



//
//        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
//        for (String string : ("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language").split(", "))
//        {
//            if(unique.get(string) == null)
//                unique.put(string, 1);
//            else
//                unique.put(string, unique.get(string) + 1);
//        }
//        String uniqueString = join(unique.keySet(), ", ");
//        List<Integer> value = new ArrayList<Integer>(unique.values());
//
//        System.out.println("Output = " + uniqueString);
//        System.out.println("Values = " + value);
//
//    }
//
//    public static String join(Set<String> s, String delimiter) {
//        StringBuffer buffer = new StringBuffer();
//        Iterator<String> iter = s.iterator();
//        while (iter.hasNext()) {
//            buffer.append(iter.next());
//            if (iter.hasNext()) {
//                buffer.append(delimiter);
//            }
//        }
//        return buffer.toString();


    }
    }


