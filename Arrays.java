
public class Arrays {

    public static Object[] expandArray(Object[] a) {
        Object[] b = new Object[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void shiftElements(Object[] a, int i) {
        Object[] b = new Object[a.length + 1];
        for (int j = 0; j < i; j++) {
            b[j] = a[j];
        }
        b[i] = null;
        for (int j = i + 1; j <= a.length; j++) {
            b[j] = a[j - 1];
        }
        for (int k = 0; k < a.length; k++) {
            a[k] = b[k];
        }
    }
}
