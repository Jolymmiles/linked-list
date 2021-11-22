import java.util.Arrays;

public class DobleList<E> {
    Object[] elementData;
    private int size;
    Element<E> first;
    Element<E> last;

    private static class Element<E> {
        private E data;
        private Element<E> prev;
        private Element<E> next;


        Element(Element<E> prev, E data, Element<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public DobleList(){
        this.elementData = new Object[0];
    }

    //Увеличивает массив на 1
    private void up() {
        elementData = Arrays.copyOf(elementData, elementData.length+1);
    }

    //Уменьшает массив на 1
    private void down() {
        elementData = Arrays.copyOf(elementData, elementData.length-1);
    }

    //Добавляет элемент
    public void push(E element) {
        up();
        final Element<E> f = first;
        final Element<E> newElem = new Element<>(null, element, f);
        first = newElem;
        if (f == null)
            last = newElem;
        else
            f.prev = newElem;
        elementData[size++] = newElem;
    }

    //Удаляет последний элемент
    public void pop() {
        int numMoved = size - elementData.length-1 - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, size+1, elementData, size,
                    numMoved);
        elementData[--size] = null;
        down();
    }

    //Удаляет первый элемент
    public void shift() {
        elementData[0] = null;
        elementData = Arrays.copyOfRange(elementData, 1,elementData.length);
        --size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
