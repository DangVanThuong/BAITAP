package bai3;
import java.util.HashMap;
import java.util.Map;
public class Test {public static void main(String[] args) {

    String [] b= {"learn java by example",
            "guide to advance java",
            "example of distributed in java"
    };
    int tong =0;
    Map<String , Integer> sotu = new HashMap<String, Integer>();
    for (String string : b)
    {
        String[] tu =string.split("\\W+")
        for (String tu2 : tu)
        {
            sotu.put(tu2, sotu.getOrDefault(tu2, 0)+1);

            tong++;
        }
    }
    System.out.println("Tần suất xuất hiện của mỗi từ:");
    for (Map.Entry<String, Integer> entry : sotu.entrySet())
    {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    System.out.println("Total words: " +tong);
}
}
