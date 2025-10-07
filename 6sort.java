import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Cherry", "Grape", "Mango"};
        Arrays.sort(strings);
        System.out.println("Sorted strings: ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
