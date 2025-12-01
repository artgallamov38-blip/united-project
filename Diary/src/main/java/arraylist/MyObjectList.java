package arraylist;

import java.util.NoSuchElementException;
import java.util.Objects;

class MyObjectList extends MyList<Object> {
    private Object[] array;

    public MyObjectList(Object... Objs) {
        this.array = Objs.clone();
        this.indsize = this.array.length;
    }
    public MyObjectList() {
        this.array = new Object[10];
        this.indsize = 0;
    }

    public void add(Object Obj) {
        int originallen = array.length;
        if (indsize == originallen) {
            Object[] newarray = new Object[originallen * 2];
            for (int i = 0; i < originallen; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[indsize++] = Obj;
    }

    public Object get(int index) {
        if (index < 0 || index >= indsize ) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int length() {
        return indsize;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= indsize ) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < indsize - 1; i++) {
            array[i] = array[i + 1];
        }
        array[indsize - 1] = null;
        indsize--;
    }

    public int indexOf(Object value) {
        for (int i = 0; i < indsize; i++) {
            if (Objects.equals(array[i], value)) {return i;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }
    public void removeByValue(Object value) {
        for (int i = 0; i < indsize; i++) {
            if (Objects.equals(array[i], value)) {removeByIndex(i); return;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }

}