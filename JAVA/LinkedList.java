interface List<E> {
	public void insert(E item);
	public void append(E item);
	public void moveToStart();
	public void next();
	public int length();
	public int currPos();
	public E getValue();
}

class Link<E> {
	private E element;
	private Link<E> next;

	public Link() {}
	public Link(E e, Link<E> n) {
		this.element = e;
		this.next = n;
	}
	public Link<E> next() {return next;}
	public E element() {return element;}
	public void setNext(Link<E> next) {
		this.next = next;
	}

}

class LList<E> implements List<E> {

	private Link<E> head;
	private Link<E> tail;
	private Link<E> curr;
	private int cnt; // list size

	LList(int size) {
		this();
	} // ignore size

	LList() {
		curr = tail = head = new Link<E>();
		cnt = 0;
	}

	public void insert(E item) {
		if (tail == curr) {
			tail = curr.next();
		}
		else {
			curr.setNext(new Link<E>(item, curr.next()));
		}
		
		cnt++;
	}

	public void append(E item) {
		tail.setNext(new Link<E>(item, null));
		tail=tail.next();
		cnt++;
	}

	public void moveToStart() {
		curr = head;
	}

	public void next() {
		if (curr != tail) {
			curr = curr.next();
		}
	}

	public int length() {
		return cnt;
	}

	public int currPos() {
		Link<E> temp = head;
		int i;
		for (i = 0; curr != temp; i++)
			temp = temp.next();
		return i;
	}

	public E getValue() {
		if (curr.next() == null)
			return null;
		return curr.next().element();
	}
}

public class LinkedList {
    public static void main(String[] args) {

        List<Integer> L = new LList<>();
        int arr[]= {1, 2, 3, 4, 5};
        
        for (int a : arr){
            L.append(a);
            System.out.println(a);
        }
        L.moveToStart();
        L.insert(10);
        System.out.println(L.getValue());
        L.next();
        System.out.println(L.getValue());
        
        int sum = 0;
        for (L.moveToStart(); L.currPos() < L.length(); L.next()) {
            sum += L.getValue();
        }

        System.out.println(sum);
    }
}
