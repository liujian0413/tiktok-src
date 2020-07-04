package org.msgpack.type;

import java.io.IOException;
import java.util.ListIterator;
import org.msgpack.packer.Packer;

class ArrayValueImpl extends AbstractArrayValue {
    private static ArrayValueImpl emptyInstance = new ArrayValueImpl(new Value[0], true);
    private Value[] array;

    public static ArrayValue getEmptyInstance() {
        return emptyInstance;
    }

    public Value[] getElementArray() {
        return this.array;
    }

    public int size() {
        return this.array.length;
    }

    public boolean isEmpty() {
        if (this.array.length == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public int hashCode() {
        int i = 1;
        for (Value hashCode : this.array) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public Value get(int i) {
        if (i >= 0 && this.array.length > i) {
            return this.array[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int length = this.array.length - 1; length >= 0; length--) {
            if (this.array[length].equals(obj)) {
                return length;
            }
        }
        return -1;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.writeArrayBegin(this.array.length);
        for (Value writeTo : this.array) {
            writeTo.writeTo(packer);
        }
        packer.writeArrayEnd();
    }

    private boolean equals(ArrayValueImpl arrayValueImpl) {
        if (this.array.length != arrayValueImpl.array.length) {
            return false;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (!this.array[i].equals(arrayValueImpl.array[i])) {
                return false;
            }
        }
        return true;
    }

    public StringBuilder toString(StringBuilder sb) {
        if (this.array.length == 0) {
            sb.append("[]");
            return sb;
        }
        sb.append("[");
        sb.append(this.array[0]);
        for (int i = 1; i < this.array.length; i++) {
            sb.append(",");
            this.array[i].toString(sb);
        }
        sb.append("]");
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isArrayValue()) {
            return false;
        }
        if (value.getClass() == ArrayValueImpl.class) {
            return equals((ArrayValueImpl) value);
        }
        ListIterator listIterator = value.asArrayValue().listIterator();
        for (Value equals : this.array) {
            if (!listIterator.hasNext() || !equals.equals(listIterator.next())) {
                return false;
            }
        }
        if (!listIterator.hasNext()) {
            return true;
        }
        return false;
    }

    ArrayValueImpl(Value[] valueArr, boolean z) {
        if (z) {
            this.array = valueArr;
            return;
        }
        this.array = new Value[valueArr.length];
        System.arraycopy(valueArr, 0, this.array, 0, valueArr.length);
    }
}
