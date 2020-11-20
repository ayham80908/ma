
@SuppressWarnings("unchecked")
public class ArrayList<T> {

    private int length;
    private Object[] objects;

    private final int leng = 10;

    public ArrayList() {
        length = 0;
        objects = new Object[leng];
    }

    public ArrayList(int len) {
        length = 0;
        objects = new Object[len];
    }

    public boolean isEmplty() {
        return length == 0;
    }

    public T remove(int ind) {
        T removed = null;
        for (int i = 0; i < this.length; i++) {
            if (i == ind) {
                removed = (T) this.objects[ind];
                --length;
            }
            if (i >= ind) {
                this.objects[i] = this.objects[i + 1];
            }
            if (i < ind) {
                this.objects[i] = this.objects[i];
            }

        }
        return removed;
    }

    public int size() {
        return length;
    }

    public T get(int i) {
        return (T) objects[i];
    }

    public void add(int i, T ob) {
        length++;
        if (objects[objects.length - 1] != null) {
            objects = Arrays.expandArray(objects);
        }
        Arrays.shiftElements(objects, i);

        objects[i] = ob;

    }
}
