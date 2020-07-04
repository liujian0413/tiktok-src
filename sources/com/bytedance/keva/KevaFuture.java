package com.bytedance.keva;

import com.bytedance.keva.Keva.OnChangeListener;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class KevaFuture extends Keva {
    private KevaImpl mFallBackInstance;
    private FutureTask<KevaImpl> mFuture;
    private int mMode;
    private String mName;

    public void clear() {
        obtain().clear();
    }

    public void dump() {
        obtain().dump();
    }

    public int count() {
        return obtain().count();
    }

    public Map<String, ?> getAll() {
        return obtain().getAll();
    }

    public String name() {
        return obtain().name();
    }

    private KevaImpl obtain() {
        try {
            return (KevaImpl) this.mFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            Throwable th = e;
            KevaImpl.sMonitor.logDebug("fail to obtain keva future instance");
            KevaImpl.sMonitor.reportThrowable(5, this.mName, null, null, th);
            if (this.mFallBackInstance == null) {
                this.mFallBackInstance = KevaImpl.getEmptyRepoImpl(this.mName, this.mMode);
                this.mFallBackInstance.init(false);
            }
            return this.mFallBackInstance;
        }
    }

    public void erase(String str) {
        obtain().erase(str);
    }

    public void registerChangeListener(OnChangeListener onChangeListener) {
        obtain().registerChangeListener(onChangeListener);
    }

    public void unRegisterChangeListener(OnChangeListener onChangeListener) {
        obtain().unRegisterChangeListener(onChangeListener);
    }

    /* access modifiers changed from: 0000 */
    public void checkMode(int i) {
        if (this.mFuture.isDone()) {
            obtain().checkMode(i);
        }
    }

    public boolean contains(String str) {
        return obtain().contains(str);
    }

    public void storeBoolean(String str, boolean z) {
        obtain().storeBoolean(str, z);
    }

    public void storeBytes(String str, byte[] bArr) {
        obtain().storeBytes(str, bArr);
    }

    public void storeBytesJustDisk(String str, byte[] bArr) {
        obtain().storeBytesJustDisk(str, bArr);
    }

    public void storeDouble(String str, double d) {
        obtain().storeDouble(str, d);
    }

    public void storeFloat(String str, float f) {
        obtain().storeFloat(str, f);
    }

    public void storeInt(String str, int i) {
        obtain().storeInt(str, i);
    }

    public void storeLong(String str, long j) {
        obtain().storeLong(str, j);
    }

    public void storeString(String str, String str2) {
        obtain().storeString(str, str2);
    }

    public void storeStringArray(String str, String[] strArr) {
        obtain().storeStringArray(str, strArr);
    }

    public void storeStringArrayJustDisk(String str, String[] strArr) {
        obtain().storeStringArrayJustDisk(str, strArr);
    }

    public void storeStringJustDisk(String str, String str2) {
        obtain().storeStringJustDisk(str, str2);
    }

    public void storeStringSet(String str, Set<String> set) {
        obtain().storeStringSet(str, set);
    }

    public void storeStringSetJustDisk(String str, Set<String> set) {
        obtain().storeStringSetJustDisk(str, set);
    }

    public boolean getBoolean(String str, boolean z) {
        return obtain().getBoolean(str, z);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        return obtain().getBytes(str, bArr);
    }

    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return obtain().getBytesJustDisk(str, bArr);
    }

    public double getDouble(String str, double d) {
        return obtain().getDouble(str, d);
    }

    public float getFloat(String str, float f) {
        return obtain().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return obtain().getInt(str, i);
    }

    public long getLong(String str, long j) {
        return obtain().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return obtain().getString(str, str2);
    }

    public String[] getStringArray(String str, String[] strArr) {
        return obtain().getStringArray(str, strArr);
    }

    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return obtain().getStringArrayJustDisk(str, strArr);
    }

    public String getStringJustDisk(String str, String str2) {
        return obtain().getStringJustDisk(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return obtain().getStringSet(str, set);
    }

    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return obtain().getStringSetJustDisk(str, set);
    }

    KevaFuture(String str, int i, Callable<KevaImpl> callable) {
        this.mName = str;
        this.mMode = i;
        this.mFuture = new FutureTask<>(callable);
        KevaImpl.sExecutor.execute(this.mFuture);
    }
}
