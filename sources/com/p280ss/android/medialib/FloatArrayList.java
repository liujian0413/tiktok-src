package com.p280ss.android.medialib;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.ss.android.medialib.FloatArrayList */
public class FloatArrayList implements Serializable {
    public static int initialCapacity = 10;
    private float[] array;
    private int size;

    public void clear() {
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public FloatArrayList() {
        this(initialCapacity);
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public synchronized float[] toArray() {
        float[] fArr;
        fArr = new float[this.size];
        System.arraycopy(this.array, 0, fArr, 0, this.size);
        return fArr;
    }

    public void trimToSize() {
        if (this.size < this.array.length) {
            float[] fArr = this.array;
            this.array = new float[this.size];
            System.arraycopy(fArr, 0, this.array, 0, this.size);
        }
    }

    public float get(int i) {
        checkRange(i);
        return this.array[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.array = new float[objectInputStream.readInt()];
        for (int i = 0; i < this.size; i++) {
            this.array[i] = objectInputStream.readFloat();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.array.length);
        for (int i = 0; i < this.size; i++) {
            objectOutputStream.writeFloat(this.array[i]);
        }
    }

    public synchronized void add(float f) {
        ensureCapacity(this.size + 1);
        float[] fArr = this.array;
        int i = this.size;
        this.size = i + 1;
        fArr[i] = f;
    }

    public float remove(int i) {
        checkRange(i);
        float f = this.array[i];
        int i2 = (this.size - i) - 1;
        if (i2 > 0) {
            System.arraycopy(this.array, i + 1, this.array, i, i2);
        }
        this.size--;
        return f;
    }

    public FloatArrayList(int i) {
        if (i >= 0) {
            this.array = new float[i];
            this.size = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Capacity can't be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private void checkRange(int i) {
        if (i < 0 || i >= this.size) {
            StringBuilder sb = new StringBuilder("Index should be at least 0 and less than ");
            sb.append(this.size);
            sb.append(", found ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    private void checkRangeIncludingEndpoint(int i) {
        if (i < 0 || i > this.size) {
            StringBuilder sb = new StringBuilder("Index should be at least 0 and at most ");
            sb.append(this.size);
            sb.append(", found ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public void ensureCapacity(int i) {
        if (i > this.array.length) {
            int length = ((this.array.length * 3) >> 1) + 1;
            float[] fArr = this.array;
            if (length >= i) {
                i = length;
            }
            this.array = new float[i];
            System.arraycopy(fArr, 0, this.array, 0, this.size);
        }
    }

    public FloatArrayList(float[] fArr) {
        double length = (double) fArr.length;
        Double.isNaN(length);
        this.array = new float[(((int) (length * 1.1d)) + 1)];
        this.size = fArr.length;
        System.arraycopy(fArr, 0, this.array, 0, this.size);
    }

    public void addAll(float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            int i = this.size;
            double d = (double) length;
            Double.isNaN(d);
            ensureCapacity(i + ((int) (d * 1.1d)) + 1);
            System.arraycopy(fArr, 0, this.array, this.size, length);
            this.size += length;
        }
    }

    public float set(int i, float f) {
        checkRange(i);
        float f2 = this.array[i];
        this.array[i] = f;
        return f2;
    }

    public boolean contains(float f, float f2) {
        for (int i = 0; i < this.size; i++) {
            if (Math.abs(this.array[i] - f) <= f2) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(float f, float f2) {
        for (int i = 0; i < this.size; i++) {
            if (Math.abs(this.array[i] - f) <= f2) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(float f, float f2) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (Math.abs(this.array[i] - f) <= f2) {
                return i;
            }
        }
        return -1;
    }

    public void removeRange(int i, int i2) {
        checkRange(i);
        checkRange(i2);
        if (i < i2) {
            int i3 = this.size - i2;
            if (i3 > 0) {
                float[] fArr = this.array;
                System.arraycopy(fArr, i2, fArr, i, i3);
            }
            this.size -= i2 - i;
        }
    }

    public void add(int i, float f) {
        checkRangeIncludingEndpoint(i);
        ensureCapacity(this.size + 1);
        int i2 = this.size - i;
        float[] fArr = this.array;
        System.arraycopy(fArr, i, fArr, i + 1, i2);
        this.array[i] = f;
        this.size++;
    }

    public void addAll(int i, float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            int i2 = this.size;
            double d = (double) length;
            Double.isNaN(d);
            ensureCapacity(i2 + ((int) (d * 1.1d)) + 1);
            float[] fArr2 = this.array;
            System.arraycopy(fArr2, i, fArr2, i + length, this.size - i);
            System.arraycopy(fArr, 0, this.array, i, length);
            this.size += length;
        }
    }
}
