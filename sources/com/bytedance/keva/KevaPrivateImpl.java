package com.bytedance.keva;

import com.bytedance.keva.Keva.OnChangeListener;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KevaPrivateImpl extends KevaImpl {
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ void dump() {
        super.dump();
    }

    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    public /* bridge */ /* synthetic */ String name() {
        return super.name();
    }

    public Map<String, ?> getAll() {
        Map<String, ?> generateOutMap;
        synchronized (this) {
            generateOutMap = generateOutMap();
        }
        return generateOutMap;
    }

    public int count() {
        int i;
        synchronized (this) {
            i = 0;
            for (Entry value : this.mValueMap.entrySet()) {
                if (((KevaValueWrapper) value.getValue()).offset != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public /* bridge */ /* synthetic */ void erase(String str) {
        super.erase(str);
    }

    public /* bridge */ /* synthetic */ void registerChangeListener(OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    public /* bridge */ /* synthetic */ void unRegisterChangeListener(OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    public boolean contains(String str) {
        boolean z;
        synchronized (this) {
            KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
            if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    KevaPrivateImpl(String str, int i) {
        super(str, i);
    }

    public /* bridge */ /* synthetic */ void storeBoolean(String str, boolean z) {
        super.storeBoolean(str, z);
    }

    public /* bridge */ /* synthetic */ void storeBytes(String str, byte[] bArr) {
        super.storeBytes(str, bArr);
    }

    public /* bridge */ /* synthetic */ void storeBytesJustDisk(String str, byte[] bArr) {
        super.storeBytesJustDisk(str, bArr);
    }

    public /* bridge */ /* synthetic */ void storeDouble(String str, double d) {
        super.storeDouble(str, d);
    }

    public /* bridge */ /* synthetic */ void storeFloat(String str, float f) {
        super.storeFloat(str, f);
    }

    public /* bridge */ /* synthetic */ void storeInt(String str, int i) {
        super.storeInt(str, i);
    }

    public /* bridge */ /* synthetic */ void storeLong(String str, long j) {
        super.storeLong(str, j);
    }

    public /* bridge */ /* synthetic */ void storeString(String str, String str2) {
        super.storeString(str, str2);
    }

    public /* bridge */ /* synthetic */ void storeStringArray(String str, String[] strArr) {
        super.storeStringArray(str, strArr);
    }

    public /* bridge */ /* synthetic */ void storeStringArrayJustDisk(String str, String[] strArr) {
        super.storeStringArrayJustDisk(str, strArr);
    }

    public /* bridge */ /* synthetic */ void storeStringJustDisk(String str, String str2) {
        super.storeStringJustDisk(str, str2);
    }

    public /* bridge */ /* synthetic */ void storeStringSet(String str, Set set) {
        super.storeStringSet(str, set);
    }

    public /* bridge */ /* synthetic */ void storeStringSetJustDisk(String str, Set set) {
        super.storeStringSetJustDisk(str, set);
    }

    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    public /* bridge */ /* synthetic */ byte[] getBytes(String str, byte[] bArr) {
        return super.getBytes(str, bArr);
    }

    public /* bridge */ /* synthetic */ byte[] getBytesJustDisk(String str, byte[] bArr) {
        return super.getBytesJustDisk(str, bArr);
    }

    public /* bridge */ /* synthetic */ double getDouble(String str, double d) {
        return super.getDouble(str, d);
    }

    public /* bridge */ /* synthetic */ float getFloat(String str, float f) {
        return super.getFloat(str, f);
    }

    public /* bridge */ /* synthetic */ int getInt(String str, int i) {
        return super.getInt(str, i);
    }

    public /* bridge */ /* synthetic */ long getLong(String str, long j) {
        return super.getLong(str, j);
    }

    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    public /* bridge */ /* synthetic */ String[] getStringArray(String str, String[] strArr) {
        return super.getStringArray(str, strArr);
    }

    public /* bridge */ /* synthetic */ String[] getStringArrayJustDisk(String str, String[] strArr) {
        return super.getStringArrayJustDisk(str, strArr);
    }

    public /* bridge */ /* synthetic */ String getStringJustDisk(String str, String str2) {
        return super.getStringJustDisk(str, str2);
    }

    public /* bridge */ /* synthetic */ Set getStringSet(String str, Set set) {
        return super.getStringSet(str, set);
    }

    public /* bridge */ /* synthetic */ Set getStringSetJustDisk(String str, Set set) {
        return super.getStringSetJustDisk(str, set);
    }

    /* access modifiers changed from: protected */
    public boolean fetchBoolean(String str, boolean z) {
        return ((Boolean) fetchObject(str, Boolean.valueOf(z))).booleanValue();
    }

    /* access modifiers changed from: protected */
    public double fetchDouble(String str, double d) {
        return ((Double) fetchObject(str, Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: protected */
    public float fetchFloat(String str, float f) {
        return ((Float) fetchObject(str, Float.valueOf(f))).floatValue();
    }

    /* access modifiers changed from: protected */
    public int fetchInt(String str, int i) {
        return ((Integer) fetchObject(str, Integer.valueOf(i))).intValue();
    }

    /* access modifiers changed from: protected */
    public long fetchLong(String str, long j) {
        return ((Long) fetchObject(str, Long.valueOf(j))).longValue();
    }

    private Object fetchObject(String str, Object obj) {
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return obj;
        }
        return kevaValueWrapper.value;
    }

    /* access modifiers changed from: protected */
    public String fetchString(String str, String str2, boolean z) {
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return str2;
        }
        if (kevaValueWrapper.loaded) {
            return (String) kevaValueWrapper.value;
        }
        String fetchString = fetchString(this.mHandle, str, kevaValueWrapper.offset, str2);
        if (!z) {
            kevaValueWrapper.value = fetchString;
            kevaValueWrapper.loaded = true;
        } else {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        }
        return fetchString;
    }

    /* access modifiers changed from: protected */
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return strArr;
        }
        if (kevaValueWrapper.loaded) {
            return (String[]) kevaValueWrapper.value;
        }
        String[] fetchStringArray = fetchStringArray(this.mHandle, str, kevaValueWrapper.offset, strArr, 3);
        if (!z) {
            kevaValueWrapper.value = fetchStringArray;
            kevaValueWrapper.loaded = true;
        } else {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        }
        return fetchStringArray;
    }

    /* access modifiers changed from: protected */
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return bArr;
        }
        if (kevaValueWrapper.loaded) {
            return (byte[]) kevaValueWrapper.value;
        }
        byte[] fetchBytes = fetchBytes(this.mHandle, str, kevaValueWrapper.offset, bArr, i);
        if (!z) {
            kevaValueWrapper.value = fetchBytes;
            kevaValueWrapper.loaded = true;
        } else {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        }
        return fetchBytes;
    }
}
