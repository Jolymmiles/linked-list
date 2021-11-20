import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DobleList<E> {
    private int DEFAULT_CAPACITY = 0;
    Object[] elementData;
    private int size;

    public DobleList(){
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void up() {
        elementData = Arrays.copyOf(elementData, elementData.length+1);
    }
    private void down() {
        elementData = Arrays.copyOf(elementData, elementData.length-1);
    }

    public void push(E element) {
        up();
        elementData[size++] = element;
    }

    public void pop() {
        int numMoved = size - elementData.length-1 - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, size+1, elementData, size,
                    numMoved);
        elementData[--size] = null;
    }

    public int getSize(){
        return this.elementData.length;
    }

    @Override
    public String toString() {
        return "DobleList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
