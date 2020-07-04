package com.facebook.react.bridge;

import android.support.p022v4.util.Pools.SimplePool;

public class DynamicFromArray implements Dynamic {
    private static final SimplePool<DynamicFromArray> sPool = new SimplePool<>(10);
    private ReadableArray mArray;
    private int mIndex = -1;

    private DynamicFromArray() {
    }

    public void recycle() {
        this.mArray = null;
        this.mIndex = -1;
        sPool.release(this);
    }

    public ReadableArray asArray() {
        if (this.mArray != null) {
            return this.mArray.getArray(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean asBoolean() {
        if (this.mArray != null) {
            return this.mArray.getBoolean(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public double asDouble() {
        if (this.mArray != null) {
            return this.mArray.getDouble(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public int asInt() {
        if (this.mArray != null) {
            return this.mArray.getInt(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableMap asMap() {
        if (this.mArray != null) {
            return this.mArray.getMap(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public String asString() {
        if (this.mArray != null) {
            return this.mArray.getString(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableType getType() {
        if (this.mArray != null) {
            return this.mArray.getType(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean isNull() {
        if (this.mArray != null) {
            return this.mArray.isNull(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        DynamicFromArray dynamicFromArray = (DynamicFromArray) sPool.acquire();
        if (dynamicFromArray == null) {
            dynamicFromArray = new DynamicFromArray();
        }
        dynamicFromArray.mArray = readableArray;
        dynamicFromArray.mIndex = i;
        return dynamicFromArray;
    }
}
