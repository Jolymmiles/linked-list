public class Element<E> {
    private E data;
    private Element<E> prew;
    private Element<E> next;


    public Element(E data, Element<E> prew, Element<E> next) {
        this.data = data;
        this.prew = prew;
        this.next = next;
    }

}
