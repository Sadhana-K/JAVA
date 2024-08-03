import java.util.ArrayList;
import java.util.List;

public class MagicalString {

    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>();
        // Populate L1 with some values
        L1.add(2);
        L1.add(4);
        L1.add(6);
        L1.add(3);
        L1.add(5);

        // Call the method to get the magical string
        String result = getMagicalStr(L1);

        // Print the magical string
        System.out.println(result);
    }

    public static String getMagicalStr(List<Integer> L1) {
        int N = L1.size();
        StringBuilder magicalString = new StringBuilder();

        for (int i = 0; i < N; i++) {
            // Check if double of the current element exists in the list
            if (L1.contains(2 * L1.get(i))) {
                magicalString.append("1");
            } else {
                magicalString.append("0");
            }
        }

        return magicalString.toString();
    }
}
