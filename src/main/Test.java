public class Test {
    public static void main(String[] args) {
        DobleList<String> array = new DobleList<>();
        array.push("cat");
        array.push("dog");
        array.pop();
        array.push("dog");
        System.out.println(array);
    }
}
