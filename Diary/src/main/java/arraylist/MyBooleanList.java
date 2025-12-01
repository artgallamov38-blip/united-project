package arraylist;

import java.util.NoSuchElementException;
class MyBooleanList extends MyList<Boolean> {
    private boolean[] array;

    public MyBooleanList(boolean... values) {
        this.array = values.clone();
        this.indsize = this.array.length;
    }
    public MyBooleanList() {
        this.array = new boolean[10];
        this.indsize = 0;
    }

    public void add(Boolean number) {
        int originallen = array.length;
        if (indsize == originallen) {
            boolean[] newarray = new boolean[originallen * 2];
            for (int i = 0; i < originallen; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[indsize++] = number;
    }

    public Boolean get(int index) {
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
        array[indsize - 1] = false;
        indsize--;
    }

    public int indexOf(Boolean value) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == value) {return i;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }
    public void removeByValue(Boolean value) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == (boolean) value) {removeByIndex(i); return;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }

}
