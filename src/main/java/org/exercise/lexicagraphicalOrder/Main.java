package org.exercise.lexicagraphicalOrder;

import java.text.DateFormat;
import java.util.*;

///
/// branch
public class Main {
//    public static void main(String[] args) {
//
//        String s = "Facundo";
//        int letras = 7;
//
//        //String strRtn = getSmallestAndLargest(s, letras);
//
//    }


    /*public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the functio
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }*/


//    public int lengthOfLongestSubstring(String s) {
//        int size = 0;
//        String substring;
//        for(int i = 0; i < s.length(); i ++){
//            for(int x = i + 1; x < s.lenght(); x ++){
//                if(s.charAt(i).equals(s.charAt(x))){
//
//                }else{
//                    substring = s.substring(i,x);
//                    size++;
//                }
//            }
//        }
//
//        System.out.println(subtring + "\n" + size);
//    }



//        public static void main(String[] args) {
//            System.out.println(isPalindrome("neuquen"));
//
//
//            Map<String, Integer> map = new HashMap<>();
//            map.put("jorge", 1198764);
//            map.put("julio", 1198764);
//            map.put("betty", 1198767);
//            map.put("julieta", 1198763);
//
//            for(Map.Entry<String, Integer> mp : map.entrySet()){
//                if(mp.getValue() % 2 == 0){
//                    System.out.println(mp.getKey());
//                }
//            }
//        }
//
//        public static boolean isPalindrome (String word){
//            int counter = 0;
//            char[] wordArray = word.toCharArray();
//            Map<Character, Integer> mapitaUwu = new HashMap<>();
//            for (Character e : wordArray) {
//                if (mapitaUwu.containsKey(e)){
//                    mapitaUwu.replace(e, mapitaUwu.get(e)+1);
//                } else {
//                    mapitaUwu.put(e, 1);
//                }
//            }
//            for (Character letter : mapitaUwu.keySet()) {
//                if (mapitaUwu.get(letter) % 2 != 0){
//                    counter++;
//                }
//            }
//            return 2 > counter;
//        }

//
//        public static void main(String[] args) {
//            String[] words = {"auto", "casa"};
//            String[] wordsInPicture = matrixInPicture(words);
//            for (int i = 0; i < wordsInPicture.length; i++) {
//                System.out.println(wordsInPicture[i]);
//            }
//
//        }
//
//        public static String[] matrixInPicture (String[] matrix){
//            int wordLength = matrix[0].length();
//            String rowOfAsterisks = "**";
//            for (int i = 0; i < matrix[0].length(); i++) {
//                rowOfAsterisks += "*";
//            }
//            List<String> arrayList = new ArrayList<>();
//            arrayList.add(rowOfAsterisks);
//            for (int i = 0; i < matrix.length; i++) {
//                matrix[i] = "*" + matrix[i] + "*";
//                arrayList.add(matrix[i]);
//            }
//            arrayList.add(rowOfAsterisks);
//            String[] picture = arrayList.toArray(new String[0]);
//            return picture;
//        }


    private static Scanner sc;

    public static void main(String[] args) {

        int day = getDay();
        int month = getMonth();
        int year = getYear();
        System.out.println("Date is: " + day + "/" + month + "/" + year);

    }

    public static int getDay(){
        sc = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = sc.nextInt();
        while (day > 31 || day == 0){
            System.out.println("Error. Enter a day: ");
            day = sc.nextInt();
        }
        return day;
    }

    public static int getMonth(){
        sc = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int month = sc.nextInt();
        while (month > 12 || month == 0){
            System.out.println("Error. Enter a month: ");
            month = sc.nextInt();
        }
        return month;
    }

    public static int getYear(){
        sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        while (year > 2023 || year < 1900){
            System.out.println("Error. Enter a year: ");
            year = sc.nextInt();
        }
        return year;
    }



}