public class Test {
    public static void main(String[] args) {
        DobleList<Integer> array = new DobleList<>();
        array.push(123);
        array.push(4324);
        array.push(735);
        array.push(675);
        array.pop();
        array.unshift(666);
    }
}
