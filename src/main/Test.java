public class Test {
    public static void main(String[] args) {
        DobleList<Integer> array = new DobleList<>();
        array.push(123);
        array.push(4324);
        array.shift();
        array.push(345465);
        array.pop();


        System.out.println(array);
    }
}
