import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number) {
        String result = numericAlpha.get(number);
        return result;
        // Je kan dit verkorten: return numericAlpha.get(number);
    }

}
