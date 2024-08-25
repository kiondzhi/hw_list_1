import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");

        System.out.println(colors);

        Main mainInstance = new Main();
        boolean isColorPresent = mainInstance.checkColor(colors, "true");
        System.out.println(isColorPresent);
    }

    public boolean checkColor(ArrayList array, String color) {
        return array.contains(color);
    }
}
