package com.pb.smolianykova.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first string: ");
            String first = in.nextLine().toUpperCase();


            System.out.print("Enter second string: ");
            String second = in.nextLine().toUpperCase();

            String result = isAnagram(first, second);
            System.out.println(result);
        }

        private static String isAnagram(String first, String second) {
            String answer = "";


            if (first.matches("[A-Z\\.\\,\\s]")) {
                String st = first.replaceAll("\\.\\,\\s", "");
                String nd = second.replaceAll("\\.\\,\\s", "");
                char[] arraySt = st.toCharArray();
                char[] arrayNd = nd.toCharArray();
                Arrays.sort(arraySt);
                Arrays.sort(arrayNd);

                if(Arrays.equals(arraySt, arrayNd)) {
                    answer = "Anagram.";
                }

                else {
                    answer = "No anagram.";
                }
            }

            else  {
                answer = "No anagram.";
            }
            return answer;
        }
}

