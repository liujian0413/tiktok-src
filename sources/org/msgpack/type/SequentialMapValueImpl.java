package org.msgpack.type;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.packer.Packer;
import org.msgpack.util.android.PortedImmutableEntry;

class SequentialMapValueImpl extends AbstractMapValue {
    private static SequentialMapValueImpl emptyInstance = new SequentialMapValueImpl(new Value[0], true);
    private Value[] array;

    static class EntrySet extends AbstractSet<Entry<Value, Value>> {
        private Value[] array;

        public Iterator<Entry<Value, Value>> iterator() {
            return new EntrySetIterator(this.array);
        }

        public int size() {
            return this.array.length / 2;
        }

        EntrySet(Value[] valueArr) {
            this.array = valueArr;
        }
    }

    static class EntrySetIterator implements Iterator<Entry<Value, Value>> {
        private static final boolean hasDefaultImmutableEntry;
        private Value[] array;
        private int pos;

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            if (this.pos < this.array.length) {
                return true;
            }
            return false;
        }

        static {
            boolean z = true;
            try {
                Class.forName("java.util.AbstractMap.SimpleImmutableEntry");
            } catch (ClassNotFoundException unused) {
                z = false;
            } finally {
                hasDefaultImmutableEntry = z;
            }
        }

        public Entry<Value, Value> next() {
            Entry<Value, Value> entry;
            if (this.pos < this.array.length) {
                Value value = this.array[this.pos];
                Value value2 = this.array[this.pos + 1];
                if (hasDefaultImmutableEntry) {
                    entry = new SimpleImmutableEntry<>(value, value2);
                } else {
                    entry = new PortedImmutableEntry<>(value, value2);
                }
                Entry<Value, Value> entry2 = entry;
                this.pos += 2;
                return entry2;
            }
            throw new NoSuchElementException();
        }

        EntrySetIterator(Value[] valueArr) {
            this.array = valueArr;
        }
    }

    static class KeySet extends AbstractSet<Value> {
        private Value[] array;

        public int size() {
            return this.array.length / 2;
        }

        public Iterator<Value> iterator() {
            return new ValueIterator(this.array, 0);
        }

        KeySet(Value[] valueArr) {
            this.array = valueArr;
        }
    }

    static class ValueCollection extends AbstractCollection<Value> {
        private Value[] array;

        public int size() {
            return this.array.length / 2;
        }

        public Iterator<Value> iterator() {
            return new ValueIterator(this.array, 1);
        }

        ValueCollection(Value[] valueArr) {
            this.array = valueArr;
        }
    }

    static class ValueIterator implements Iterator<Value> {
        private Value[] array;
        private int pos;

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            if (this.pos < this.array.length) {
                return true;
            }
            return false;
        }

        public Value next() {
            if (this.pos < this.array.length) {
                Value value = this.array[this.pos];
                this.pos += 2;
                return value;
            }
            throw new NoSuchElementException();
        }

        ValueIterator(Value[] valueArr, int i) {
            this.array = valueArr;
            this.pos = i;
        }
    }

    public static MapValue getEmptyInstance() {
        return emptyInstance;
    }

    public Value[] getKeyValueArray() {
        return this.array;
    }

    public Set<Entry<Value, Value>> entrySet() {
        return new EntrySet(this.array);
    }

    public Set<Value> keySet() {
        return new KeySet(this.array);
    }

    public Collection<Value> values() {
        return new ValueCollection(this.array);
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.array.length; i2 += 2) {
            i += this.array[i2].hashCode() ^ this.array[i2 + 1].hashCode();
        }
        return i;
    }

    public Value get(Object obj) {
        if (obj == null) {
            return null;
        }
        for (int length = this.array.length - 2; length >= 0; length -= 2) {
            if (this.array[length].equals(obj)) {
                return this.array[length + 1];
            }
        }
        return null;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.writeMapBegin(this.array.length / 2);
        for (Value writeTo : this.array) {
            writeTo.writeTo(packer);
        }
        packer.writeMapEnd();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isMapValue()) {
            return false;
        }
        MapValue asMapValue = value.asMapValue();
        if (asMapValue.size() != this.array.length / 2) {
            return false;
        }
        int i = 0;
        while (i < this.array.length) {
            try {
                if (!this.array[i + 1].equals(asMapValue.get(this.array[i]))) {
                    return false;
                }
                i += 2;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return true;
    }

    public StringBuilder toString(StringBuilder sb) {
        if (this.array.length == 0) {
            sb.append("{}");
            return sb;
        }
        sb.append("{");
        sb.append(this.array[0]);
        sb.append(":");
        sb.append(this.array[1]);
        for (int i = 2; i < this.array.length; i += 2) {
            sb.append(",");
            this.array[i].toString(sb);
            sb.append(":");
            this.array[i + 1].toString(sb);
        }
        sb.append("}");
        return sb;
    }

    SequentialMapValueImpl(Value[] valueArr, boolean z) {
        if (valueArr.length % 2 != 0) {
            throw new IllegalArgumentException();
        } else if (z) {
            this.array = valueArr;
        } else {
            this.array = new Value[valueArr.length];
            System.arraycopy(valueArr, 0, this.array, 0, valueArr.length);
        }
    }
}
