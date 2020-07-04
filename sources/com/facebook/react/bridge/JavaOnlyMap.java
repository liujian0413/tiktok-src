package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaOnlyMap implements ReadableMap, WritableMap {
    public final Map mBackingMap;

    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() {
            Iterator<String> mIterator = JavaOnlyMap.this.mBackingMap.keySet().iterator();

            public boolean hasNextKey() {
                return this.mIterator.hasNext();
            }

            public String nextKey() {
                return (String) this.mIterator.next();
            }
        };
    }

    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this.mBackingMap);
    }

    public String toString() {
        return this.mBackingMap.toString();
    }

    public JavaOnlyMap() {
        this.mBackingMap = new HashMap();
    }

    public int hashCode() {
        if (this.mBackingMap != null) {
            return this.mBackingMap.hashCode();
        }
        return 0;
    }

    /* renamed from: of */
    public static JavaOnlyMap m41786of(Object... objArr) {
        return new JavaOnlyMap(objArr);
    }

    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    public boolean hasKey(String str) {
        return this.mBackingMap.containsKey(str);
    }

    public void putNull(String str) {
        this.mBackingMap.put(str, null);
    }

    public JavaOnlyArray getArray(String str) {
        return (JavaOnlyArray) this.mBackingMap.get(str);
    }

    public boolean getBoolean(String str) {
        return ((Boolean) this.mBackingMap.get(str)).booleanValue();
    }

    public double getDouble(String str) {
        return ((Number) this.mBackingMap.get(str)).doubleValue();
    }

    public double getDoubleFromDeg(String str) {
        return ((Number) this.mBackingMap.get(str)).doubleValue();
    }

    public int getInt(String str) {
        return ((Number) this.mBackingMap.get(str)).intValue();
    }

    public ReadableMap getMap(String str) {
        return (ReadableMap) this.mBackingMap.get(str);
    }

    public String getString(String str) {
        return (String) this.mBackingMap.get(str);
    }

    public boolean isNull(String str) {
        if (this.mBackingMap.get(str) == null) {
            return true;
        }
        return false;
    }

    public void merge(ReadableMap readableMap) {
        this.mBackingMap.putAll(((JavaOnlyMap) readableMap).mBackingMap);
    }

    private JavaOnlyMap(Object... objArr) {
        if (objArr.length % 2 == 0) {
            this.mBackingMap = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                this.mBackingMap.put(objArr[i], objArr[i + 1]);
            }
            return;
        }
        throw new IllegalArgumentException("You must provide the same number of keys and values");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) obj;
        if (this.mBackingMap == null ? javaOnlyMap.mBackingMap == null : this.mBackingMap.equals(javaOnlyMap.mBackingMap)) {
            return true;
        }
        return false;
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case Boolean:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case String:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }

    public ReadableType getType(String str) {
        Object obj = this.mBackingMap.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        StringBuilder sb = new StringBuilder("Invalid value ");
        sb.append(obj.toString());
        sb.append(" for key ");
        sb.append(str);
        sb.append("contained in JavaOnlyMap");
        throw new IllegalArgumentException(sb.toString());
    }

    public void putArray(String str, WritableArray writableArray) {
        this.mBackingMap.put(str, writableArray);
    }

    public void putMap(String str, WritableMap writableMap) {
        this.mBackingMap.put(str, writableMap);
    }

    public void putString(String str, String str2) {
        this.mBackingMap.put(str, str2);
    }

    public void putBoolean(String str, boolean z) {
        this.mBackingMap.put(str, Boolean.valueOf(z));
    }

    public void putDouble(String str, double d) {
        this.mBackingMap.put(str, Double.valueOf(d));
    }

    public void putInt(String str, int i) {
        this.mBackingMap.put(str, Integer.valueOf(i));
    }
}
