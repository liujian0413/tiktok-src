package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class ReactStylesDiffMap {
    final ReadableMap mBackingMap;

    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.mBackingMap.toString());
        sb.append(" }");
        return sb.toString();
    }

    public ReactStylesDiffMap(ReadableMap readableMap) {
        this.mBackingMap = readableMap;
    }

    public ReadableArray getArray(String str) {
        return this.mBackingMap.getArray(str);
    }

    public Dynamic getDynamic(String str) {
        return this.mBackingMap.getDynamic(str);
    }

    public ReadableMap getMap(String str) {
        return this.mBackingMap.getMap(str);
    }

    public String getString(String str) {
        return this.mBackingMap.getString(str);
    }

    public boolean hasKey(String str) {
        return this.mBackingMap.hasKey(str);
    }

    public boolean isNull(String str) {
        return this.mBackingMap.isNull(str);
    }

    public boolean getBoolean(String str, boolean z) {
        if (this.mBackingMap.isNull(str)) {
            return z;
        }
        return this.mBackingMap.getBoolean(str);
    }

    public double getDouble(String str, double d) {
        if (this.mBackingMap.isNull(str)) {
            return d;
        }
        return this.mBackingMap.getDouble(str);
    }

    public int getInt(String str, int i) {
        if (this.mBackingMap.isNull(str)) {
            return i;
        }
        return this.mBackingMap.getInt(str);
    }

    public float getFloat(String str, float f) {
        if (this.mBackingMap.isNull(str)) {
            return f;
        }
        return (float) this.mBackingMap.getDouble(str);
    }
}
