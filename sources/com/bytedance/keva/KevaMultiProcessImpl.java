package com.bytedance.keva;

import com.bytedance.keva.Keva.OnChangeListener;
import java.util.Map;
import java.util.Set;

public class KevaMultiProcessImpl extends KevaImpl {
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

    public int count() {
        int size;
        synchronized (this) {
            this.mValueMap.clear();
            try {
                rebuildValueMap(this.mHandle);
                checkReportException(this.mHandle);
                size = this.mValueMap.size();
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, name(), null, null, th);
                return 0;
            }
        }
        return size;
    }

    public Map<String, ?> getAll() {
        Map<String, ?> generateOutMap;
        synchronized (this) {
            this.mValueMap.clear();
            try {
                rebuildValueMap(this.mHandle);
                checkReportException(this.mHandle);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, name(), null, null, th);
            }
            generateOutMap = generateOutMap();
        }
        return generateOutMap;
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
        boolean contains;
        synchronized (this) {
            contains = contains(this.mHandle, str);
        }
        return contains;
    }

    KevaMultiProcessImpl(String str, int i) {
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
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchBoolean(j2, str, j, z);
    }

    /* access modifiers changed from: protected */
    public double fetchDouble(String str, double d) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchDouble(j2, str, j, d);
    }

    /* access modifiers changed from: protected */
    public float fetchFloat(String str, float f) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchFloat(j2, str, j, f);
    }

    /* access modifiers changed from: protected */
    public int fetchInt(String str, int i) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchInt(j2, str, j, i);
    }

    /* access modifiers changed from: protected */
    public long fetchLong(String str, long j) {
        long j2;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchLong(j3, str, j2, j);
    }

    /* access modifiers changed from: protected */
    public String fetchString(String str, String str2, boolean z) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchString(j2, str, j, str2);
    }

    /* access modifiers changed from: protected */
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchStringArray(j2, str, j, strArr, 3);
    }

    /* access modifiers changed from: protected */
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        long j;
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchBytes(j2, str, j, bArr, i);
    }
}
