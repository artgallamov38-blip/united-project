package arraylist;

import java.util.NoSuchElementException;
class MyStringList extends MyList<String> {
    private String[] array;

    public MyStringList(String... strs) {
        this.array = strs.clone();
        this.indsize = this.array.length;
    }
    public MyStringList() {
        this.array = new String[10];
        this.indsize = 0;
    }

    public void add(String str) {
        int originallen = array.length;
        if (indsize == originallen) {
            String[] newarray = new String[originallen * 2];
            for (int i = 0; i < originallen; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[indsize++] = str;
    }

    public String get(int index) {
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

    public int indexOf(String value) {
        for (int i = 0; i < indsize; i++) {
            if (array[i].equals(value)) {return i;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }
    public void removeByValue(String value) {
        for (int i = 0; i < indsize; i++) {
            if (array[i].equals(value)) {removeByIndex(i); return;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }

}