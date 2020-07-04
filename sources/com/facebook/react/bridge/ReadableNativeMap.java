package com.facebook.react.bridge;

import com.facebook.infer.p728a.C13854a;
import com.facebook.jni.HybridData;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;

public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private static boolean mUseNativeAccessor;
    private String[] mKeys;
    private HashMap<String, Object> mLocalMap;
    private HashMap<String, ReadableType> mLocalTypeMap;

    static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        private final HybridData mHybridData;
        private final ReadableNativeMap mMap;

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        public native boolean hasNextKey();

        public native String nextKey();

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    private native ReadableNativeMap getMapNative(String str);

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(String str);

    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    private HashMap<String, Object> getLocalMap() {
        if (this.mLocalMap != null) {
            return this.mLocalMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) C13854a.m40916b(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) C13854a.m40916b(importValues());
                mJniCallCounter++;
                this.mLocalMap = new HashMap<>();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    private HashMap<String, ReadableType> getLocalTypeMap() {
        if (this.mLocalTypeMap != null) {
            return this.mLocalTypeMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) C13854a.m40916b(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) C13854a.m40916b(importTypes());
                mJniCallCounter++;
                this.mLocalTypeMap = new HashMap<>();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    public HashMap<String, Object> toHashMap() {
        if (mUseNativeAccessor) {
            ReadableMapKeySetIterator keySetIterator = keySetIterator();
            HashMap<String, Object> hashMap = new HashMap<>();
            while (keySetIterator.hasNextKey()) {
                mJniCallCounter++;
                String nextKey = keySetIterator.nextKey();
                mJniCallCounter++;
                switch (getType(nextKey)) {
                    case Null:
                        hashMap.put(nextKey, null);
                        break;
                    case Boolean:
                        hashMap.put(nextKey, Boolean.valueOf(getBoolean(nextKey)));
                        break;
                    case Number:
                        hashMap.put(nextKey, Double.valueOf(getDouble(nextKey)));
                        break;
                    case String:
                        hashMap.put(nextKey, getString(nextKey));
                        break;
                    case Map:
                        hashMap.put(nextKey, ((ReadableNativeMap) C13854a.m40916b(getMap(nextKey))).toHashMap());
                        break;
                    case Array:
                        hashMap.put(nextKey, ((ReadableArray) C13854a.m40916b(getArray(nextKey))).toArrayList());
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Could not convert object with key: ");
                        sb.append(nextKey);
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        throw new IllegalArgumentException(sb.toString());
                }
            }
            return hashMap;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(getLocalMap());
        for (String str : hashMap2.keySet()) {
            switch (getType(str)) {
                case Null:
                case Boolean:
                case Number:
                case String:
                    break;
                case Map:
                    hashMap2.put(str, ((ReadableNativeMap) C13854a.m40916b(getMap(str))).toHashMap());
                    break;
                case Array:
                    hashMap2.put(str, ((ReadableArray) C13854a.m40916b(getArray(str))).toArrayList());
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder("Could not convert object with key: ");
                    sb2.append(str);
                    sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                    throw new IllegalArgumentException(sb2.toString());
            }
        }
        return hashMap2;
    }

    protected ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    public static void setUseNativeAccessor(boolean z) {
        mUseNativeAccessor = z;
    }

    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private Object getValue(String str) {
        if (hasKey(str) && !isNull(str)) {
            return C13854a.m40916b(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    public ReadableArray getArray(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableArray) getNullableValue(str);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    public boolean getBoolean(String str) {
        if (!mUseNativeAccessor) {
            return ((Boolean) getValue(str)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    public double getDouble(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public double getDoubleFromDeg(String str) {
        if (!mUseNativeAccessor) {
            return transformDataType(str);
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public int getInt(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    public ReadableNativeMap getMap(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeMap) getNullableValue(str);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    public String getString(String str) {
        if (!mUseNativeAccessor) {
            return (String) getNullableValue(str);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    public boolean hasKey(String str) {
        if (!mUseNativeAccessor) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    private double transformDataType(String str) {
        Object value = getValue(str);
        if (value == null || !value.toString().endsWith("deg")) {
            return ((Double) value).doubleValue();
        }
        return (Double.valueOf(value.toString().replace("deg", "")).doubleValue() * 3.141592653589793d) / 180.0d;
    }

    public ReadableType getType(String str) {
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return getTypeNative(str);
        } else if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) C13854a.m40916b(getLocalTypeMap().get(str));
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    public boolean isNull(String str) {
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return isNullNative(str);
        } else if (!getLocalMap().containsKey(str)) {
            throw new NoSuchKeyException(str);
        } else if (getLocalMap().get(str) == null) {
            return true;
        } else {
            return false;
        }
    }
}
