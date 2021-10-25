package assign_6;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_words {


        public static void main(String[] args) {
            String str = "I  am not the one who is thinking I one thing at time am i right";
            String[] words = str.toLowerCase().trim().split(" ");

            Map<String, Integer> duplicateString = new HashMap<>();
            int count = 1;
            for (String x : words) {
                if (duplicateString.containsKey(x)) {
                    duplicateString.put(x, duplicateString.get(x) + 1);

                } else {
                    duplicateString.put(x, count);
                }
            }

            System.out.println("Duplicate Words in above String : ");
            for (Map.Entry a : duplicateString.entrySet()) {
                int val = (Integer) a.getValue();
                if (val > 1) {
                    System.out.println(a);
                }
            }
        }
    }

