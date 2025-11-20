public class SpecChangeableArray {
    enum Type {STRING, INT, DOUBLE, FLOAT, CHAR, BOOLEAN}
    Type type;
    double DEFAULT_DOUBLE = 0.0;
    int DEFAULT_INT = 0;
    float DEFAULT_FLOAT = 0.0f;
    double[] doubleArray;
    int[] intArray;
    String[] stringArray;
    char[] charArray;
    float[] floatArray;
    boolean[] booleanArray;

    //конструкторы
    SpecChangeableArray(boolean[] booleanArray) {
        this.type = Type.BOOLEAN;
        this.booleanArray = booleanArray;
    }

    SpecChangeableArray(char[] charArray) {
        this.type = Type.CHAR;
        this.charArray = charArray;
    }

    SpecChangeableArray(float[] floatArray) {
        this.type = Type.FLOAT;
        this.floatArray = floatArray;
    }

    SpecChangeableArray(int[] intArray) {
        this.type = Type.INT;
        this.intArray = intArray;
    }

    SpecChangeableArray(String[] stringArray) {
        this.type = Type.STRING;
        this.stringArray = stringArray;
    }

    SpecChangeableArray(double[] doubleArray) {
        this.type = Type.DOUBLE;
        this.doubleArray = doubleArray;
    }


    // методы для double
    void fillWithChangingDefaultValue(double[] doubleArray, double value) {
        this.DEFAULT_DOUBLE = value;
        for (int i = 0, len = doubleArray.length; i < len; i++)
            doubleArray[i] = value;
    }
    void fill(double[] doubleArray, double value) {
        for (int i = 0, len = doubleArray.length; i < len; i++)
            doubleArray[i] = value;
    }
    void add(double value) {
        this.doubleArray = newLengthArray(this.doubleArray, this.doubleArray.length + 1);
        this.doubleArray[this.doubleArray.length - 1] = value;
    }
    void remove(double value) {
        int length = this.doubleArray.length;
        boolean flag = false;
        for (int i = 0, len = this.doubleArray.length; i < len; i++) {
            if (this.doubleArray[i] == value) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.doubleArray[j] = this.doubleArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.doubleArray = newLengthArray(this.doubleArray, length - 1);
    }
    double[] newLengthArray(double[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            double[] newArray = new double[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    double[] clone(double[] original) {
        double[] copy = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    public double getDouble(int index) {
         return doubleArray[index];
    }

    // методы для int
    void fillWithChangingDefaultValue(int[] intArray, int value) {
        this.DEFAULT_INT = value;
        for (int i = 0, len = intArray.length; i < len; i++)
            intArray[i] = value;
    }
    void fill(int[] intArray, int value) {
        for (int i = 0, len = intArray.length; i < len; i++)
            intArray[i] = value;
    }
    void add(int value) {
        this.intArray = newLengthArray(this.intArray, this.intArray.length + 1);
        this.intArray[this.intArray.length - 1] = value;
    }
    void remove(int value) {
        int length = this.intArray.length;
        boolean flag = false;
        for (int i = 0, len = this.intArray.length; i < len; i++) {
            if (this.intArray[i] == value) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.intArray[j] = this.intArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.intArray = newLengthArray(this.intArray, length - 1);
    }
    int[] newLengthArray(int[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            int[] newArray = new int[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    int[] clone(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    public int getInt(int index) {
        return intArray[index];
    }


    // методы для float
    void fillWithChangingDefaultValue(float[] floatArray, float value) {
        this.DEFAULT_FLOAT = value;
        for (int i = 0, len = floatArray.length; i < len; i++)
            floatArray[i] = value;
    }
    void fill(float[] floatArray, float value) {
        for (int i = 0, len = floatArray.length; i < len; i++)
            floatArray[i] = value;
    }
    void add(float value) {
        this.floatArray = newLengthArray(this.floatArray, this.floatArray.length + 1);
        this.floatArray[this.floatArray.length - 1] = value;
    }
    void remove(float value) {
        int length = this.floatArray.length;
        boolean flag = false;
        for (int i = 0, len = this.floatArray.length; i < len; i++) {
            if (this.floatArray[i] == value) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.floatArray[j] = this.floatArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.floatArray = newLengthArray(this.floatArray, length - 1);
    }
    float[] newLengthArray(float[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            float[] newArray = new float[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    float[] clone(float[] original) {
        float[] copy = new float[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    public float getFloat(int index) {
        return floatArray[index];
    }

    //методы для String
    void fill(String[] stringArray, String value) {
        for (int i = 0, len = stringArray.length; i < len; i++)
            stringArray[i] = value;
    }
    void add(String value) {
        this.stringArray = newLengthArray(this.stringArray, this.stringArray.length + 1);
        this.stringArray[this.stringArray.length - 1] = value;
    }
    void remove(String value) {
        int length = this.stringArray.length;
        boolean flag = false;
        for (int i = 0, len = this.stringArray.length; i < len; i++) {
            if (this.stringArray[i].equals(value)) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.stringArray[j] = this.stringArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.stringArray = newLengthArray(this.stringArray, length - 1);
    }
    String[] newLengthArray(String[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            String[] newArray = new String[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    String[] clone(String[] original) {
        String[] copy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    public String getString(int index) {
        return stringArray[index];
    }


    // методы для char
    void fill(char[] charArray, char value) {
        for (int i = 0, len = charArray.length; i < len; i++)
            charArray[i] = value;
    }
    void add(char value) {
        this.charArray = newLengthArray(this.charArray, this.charArray.length + 1);
        this.charArray[this.charArray.length - 1] = value;
    }
    void remove(char value) {
        int length = this.charArray.length;
        boolean flag = false;
        for (int i = 0, len = this.charArray.length; i < len; i++) {
            if (this.charArray[i] == value) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.charArray[j] = this.charArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.charArray = newLengthArray(this.charArray, length - 1);
    }
    char[] newLengthArray(char[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            char[] newArray = new char[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    char[] clone(char[] original) {
        char[] copy = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
    public char getChar(int index) {
        return charArray[index];
    }


    // методы для boolean
    void fill(boolean[] booleanArray, boolean value) {
        for (int i = 0, len = booleanArray.length; i < len; i++)
            booleanArray[i] = value;
    }
    void add(boolean value) {
        this.booleanArray = newLengthArray(this.booleanArray, this.booleanArray.length + 1);
        this.booleanArray[this.booleanArray.length - 1] = value;
    }
    void remove(boolean value) {
        int length = this.booleanArray.length;
        boolean flag = false;
        for (int i = 0, len = this.booleanArray.length; i < len; i++) {
            if (this.booleanArray[i] == value) {
                flag = true;
                for (int j = i; j < length - 1; j++) {
                    this.booleanArray[j] = this.booleanArray[j + 1];
                }
                break;
            }
        }
        if (!flag) {throw new IllegalArgumentException("Указанный элемент не содержится в массиве");}
        this.booleanArray = newLengthArray(this.booleanArray, length - 1);
    }
    boolean[] newLengthArray(boolean[] original, int newLength) {
        if (original.length == newLength) {
            return original.clone();
        } else {
            boolean[] newArray = new boolean[newLength];
            for (int i = 0; i < Math.min(original.length, newLength); i++) {
                newArray[i] = original[i];
            }
            return newArray;
        }
    }
    boolean[] clone(boolean[] original) {
        boolean[] copy = new boolean[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    //универсальный метод length
    int length() {
        switch (type) {
            case DOUBLE: return doubleArray.length;
            case INT: return intArray.length;
            case STRING: return stringArray.length;
            case FLOAT: return floatArray.length;
            case CHAR: return charArray.length;
            case BOOLEAN: return booleanArray.length;
            default:
                throw new IllegalArgumentException("Некорректный массив");
        }
    }

    public String toString() {
        String arr = "";
        switch(type) {
            case INT: for (int integer : intArray) {arr += integer + " ";} return arr;
            case DOUBLE: for (double thedouble : intArray) {arr += thedouble + " ";} return arr;
            case FLOAT: for (double thefloat : intArray) {arr += thefloat + " ";} return arr;
            case CHAR: for (double thechar : intArray) {arr += thechar + " ";} return arr;
            case STRING: for (double thestring : intArray) {arr += thestring + " ";} return arr;
            case BOOLEAN: for (double theboolean : intArray) {arr += theboolean + " ";} return arr;
            default:
                throw new IllegalArgumentException("Некорректный массив");
        }
    }
}
