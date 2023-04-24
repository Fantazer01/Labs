package org.example.lab3.task15;

import java.util.Random;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    long next();

    static IntSequence of(int... arr) {
        if (arr.length > 0) {
            long res = 0;
            for (int i = arr.length; i > 0; i--) {
                res += arr[arr.length - i] * Math.pow(10, i - 1);
            }

            long finalRes = res;
            return new IntSequence() {

                private long number = finalRes;

                @Override
                public boolean hasNext() {
                    return !(Long.toString(number).length() == 1 && number == 0);
                }

                @Override
                public long next() {
                    long a = (long) Math.pow(10L, Long.toString(number).length() - 1);
                    long res = number / a;
                    number = number - res * a;
                    return res;
                }

                @Override
                public String toString() {
                    return "{ number: " + number + '}';
                }
            };
        }
        throw new NullPointerException("Not args");
    }

    class RandomSequence implements IntSequence {
        final Random generator = new Random();
        int high;
        int low;

        public RandomSequence(int low, int high) {
            this.high = high;
            this.low = low;
        }

        public long next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }

    static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    static IntSequence constant(int num) {
        return () -> num;
    }
}

