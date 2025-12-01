package arraylist;

import java.util.NoSuchElementException;

class MyIntList extends MyList<Integer> {
    private int[] array;

    public MyIntList(int... numbers) {
        this.array = numbers.clone();
        this.indsize = this.array.length;
    }
    public MyIntList() {
        this.array = new int[10];
        this.indsize = 0;
    }

    public void add(Integer number) {
        int originallen = array.length;
        if (indsize == originallen) {
            int[] newarray = new int[originallen * 2];
            for (int i = 0; i < originallen; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[indsize++] = number;
    }

    public Integer get(int index) {
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
        array[indsize - 1] = 0;
        indsize--;
    }

    public int indexOf(Integer number) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == number) {return i;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }
    public void removeByValue(Integer number) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == number) {removeByIndex(i); return;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }

}
