package org.example.lab3.Danildop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class DopMain {
        public static void main(String[] args) {
            String[] array = getStrings();

            Predicate<String> predicate = (str) -> {
                return str.length() > 3;
            };

            Iterator<String> iterator = MyIterator.fromIterator(Arrays.stream(array)
                                                .iterator()).filter(predicate);

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }

        private static String[] getStrings() {
            return new String[] {
                "Aha",
                "Ogo",
                "Nice",
                "Coca cola",
            };
        }


}
