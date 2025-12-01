package arraylist;

public abstract class MyList<T> {
    protected int indsize;
    public abstract void add(T value);
    public abstract int length();
    public abstract void removeByIndex(int index);
    public abstract void removeByValue(T value);
    public abstract int indexOf(T value);
    public abstract T get(int index);

    //MyIntList
    public static MyList<Integer> ofInt(int... numbers) {
        return new MyIntList(numbers);
    }
    public static MyList<Integer> ofInt() {
        return new MyIntList();
    }


    //MyDoubleList

    public static MyList<Double> ofDouble(double... numbers) {
        return new MyDoubleList(numbers);
    }
    public static MyList<Double> ofDouble() {
        return new MyDoubleList();
    }

    //MyFloatList
    public static MyList<Float> ofFloat(float... numbers) {
        return new MyFloatList(numbers);
    }
    public static MyList<Float> ofFloat() {
        return new MyFloatList();
    }

    //MyBooleanList
    public static MyList<Boolean> ofBoolean(boolean... values) {
        return new MyBooleanList(values);
    }
    public static MyList<Boolean> ofBoolean() {
        return new MyBooleanList();
    }

    //MyStringList
    public static MyList<String> ofString(String... strs){
        return new MyStringList(strs);
    }
    public static MyList<String> ofString() {
        return new MyStringList();
    }

    //MyFloatList
    public static MyList<Object> ofObject(Object... objs) {
        return new MyObjectList(objs);
    }
    public static MyList<Object> ofObject() {
        return new MyObjectList();
    }
}
