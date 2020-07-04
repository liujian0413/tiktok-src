package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaOnlyArray implements ReadableArray, WritableArray {
    private final List mBackingList;

    public void pushNull() {
        this.mBackingList.add(null);
    }

    public int size() {
        return this.mBackingList.size();
    }

    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.mBackingList);
    }

    public String toString() {
        return this.mBackingList.toString();
    }

    public JavaOnlyArray() {
        this.mBackingList = new ArrayList();
    }

    public int hashCode() {
        if (this.mBackingList != null) {
            return this.mBackingList.hashCode();
        }
        return 0;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    /* renamed from: of */
    public static JavaOnlyArray m41785of(Object... objArr) {
        return new JavaOnlyArray(objArr);
    }

    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    public void pushArray(WritableArray writableArray) {
        this.mBackingList.add(writableArray);
    }

    public void pushMap(WritableMap writableMap) {
        this.mBackingList.add(writableMap);
    }

    public void pushString(String str) {
        this.mBackingList.add(str);
    }

    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) this.mBackingList.get(i);
    }

    public boolean getBoolean(int i) {
        return ((Boolean) this.mBackingList.get(i)).booleanValue();
    }

    public double getDouble(int i) {
        return ((Number) this.mBackingList.get(i)).doubleValue();
    }

    public int getInt(int i) {
        return ((Number) this.mBackingList.get(i)).intValue();
    }

    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) this.mBackingList.get(i);
    }

    public String getString(int i) {
        return (String) this.mBackingList.get(i);
    }

    public boolean isNull(int i) {
        if (this.mBackingList.get(i) == null) {
            return true;
        }
        return false;
    }

    public void pushBoolean(boolean z) {
        this.mBackingList.add(Boolean.valueOf(z));
    }

    public void pushDouble(double d) {
        this.mBackingList.add(Double.valueOf(d));
    }

    public void pushInt(int i) {
        this.mBackingList.add(Integer.valueOf(i));
    }

    private JavaOnlyArray(List list) {
        this.mBackingList = new ArrayList(list);
    }

    private JavaOnlyArray(Object... objArr) {
        this.mBackingList = Arrays.asList(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
        if (this.mBackingList == null ? javaOnlyArray.mBackingList == null : this.mBackingList.equals(javaOnlyArray.mBackingList)) {
            return true;
        }
        return false;
    }

    public ReadableType getType(int i) {
        Object obj = this.mBackingList.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    javaOnlyArray.pushNull();
                    break;
                case Boolean:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case Number:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case String:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case Map:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case Array:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }
}
