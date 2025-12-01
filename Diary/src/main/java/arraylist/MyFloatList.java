package arraylist;

import java.util.NoSuchElementException;
class MyFloatList extends MyList<Float> {
    private float[] array;

    public MyFloatList(float... numbers) {
        this.array = numbers.clone();
        this.indsize = this.array.length;
    }
    public MyFloatList() {
        this.array = new float[10];
        this.indsize = 0;
    }

    public void add(Float number) {
        int originallen = array.length;
        if (indsize == originallen) {
            float[] newarray = new float[originallen * 2];
            for (int i = 0; i < originallen; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[indsize++] = number;
    }

    public Float get(int index) {
        if (index < 0 || index >= indsize ) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int length() {
        return indsize;
    }

    public void removeByIndex(int index) {
        for (int i = index; i < indsize - 1; i++) {
            array[i] = array[i + 1];
        }
        array[indsize - 1] = 0;
        indsize--;
    }

    public int indexOf(Float value) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == (float) value) {return i;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }
    public void removeByValue(Float number) {
        for (int i = 0; i < indsize; i++) {
            if (array[i] == (float) number) {removeByIndex(i); return;}
        }
        throw new NoSuchElementException("Элемент не найден");
    }

}
