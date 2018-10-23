import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int lol = Enum.ONE + Enum.TWO;
        System.out.println(lol);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("h");
        stringBuilder.append("e");
        stringBuilder.append("y");

        System.out.println(stringBuilder);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hoi");
        strings.add(stringBuilder.toString());
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str == "hoi") {
                continue;
            } else {
                break;
            }
        }

        File file = new File("Hey");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hi");
        fileWriter.flush();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String ee = scanner.next();
            System.out.println(ee);
        }
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(1);

        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "Test1");
        hashMap.put(2, "Test2");

        if (hashMap.containsValue("Test1")) {
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getValue().contains("Test2")) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
