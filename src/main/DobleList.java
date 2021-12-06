public class DobleList<E> {
    private Element<E> first;
    private Element<E> last;

    private static class Element<E> {
        final private E data;
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

    /**
     * Adding object
     * @param data - E data object
     *
     */
    //Добавляет элемент
    public void push(E data){
        if (first == null){
            Element<E> newElement = new Element<>(null, data, null);
            first = newElement;
            last = newElement;
        } else {
            Element<E> newElement = new Element<>(last, data, null);
            if (first.next == null) {
                first.next = newElement;
            }
            if (last.next == null) {
                last.next = newElement;
            }
            last = newElement;

        }
    }
    /**
     * Delete last object
     *
     *
     */
    //Удаляет последний элемент
    public void pop(){
        last = last.prev;
        last.next = null;


    }

    /**
     * Delete first object
     *
     *
     */
    //Удаляет первый элемент
    public void shift(){
        first = first.next;
        first.prev = null;

    }

    /**
     * Adding object before first element
     * @param data - E data object
     *
     */
    public void unshift(E data){
        Element<E> newElement = new Element<>(null, data, first);
        first.prev = newElement;
        first = newElement;
    }

    /**
     * Get first element
     */
    public Element<E> getFirst(){
        return first;
    }
    /**
     * Get last element
     */
    public Element<E> getLast(){
        return last;
    }


}
