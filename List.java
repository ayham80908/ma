
public interface List<T> {

    abstract public int size();

    abstract public T get(int index);

    abstract public void add(int index, T e);

    abstract public boolean isEmpty();

    abstract public T remove(int index);

}
