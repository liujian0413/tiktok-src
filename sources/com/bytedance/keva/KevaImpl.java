package com.bytedance.keva;

import android.content.Context;
import android.os.Environment;
import com.bytedance.keva.Keva.OnChangeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

abstract class KevaImpl extends Keva {
    static final Executor sExecutor;
    static final KevaMonitor sMonitor;
    public static final String sPortedSpRepoName;
    private static final HashMap<String, Keva> sRepoMap = new HashMap<>();
    private static final File sSharedPrefsDir;
    private final List<OnChangeListener> mChangeListeners = new ArrayList();
    private List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();
    volatile long mHandle;
    private boolean mIsMultiProcess;
    private volatile int mMode;
    public String mName;
    final HashMap<String, KevaValueWrapper> mValueMap = new HashMap<>();

    static class KevaValueWrapper {
        volatile boolean loaded;
        volatile long offset;
        volatile int type;
        volatile Object value;

        KevaValueWrapper() {
        }
    }

    static class PortedSpRepoHolder {
        public static final KevaImpl sInstance;
        public static final Map<String, ?> sPortedSpMap = sInstance.generateOutMap();

        private PortedSpRepoHolder() {
        }

        static {
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
        }
    }

    protected interface PrivateConstants {
    }

    static native void checkReportException(long j);

    private static native void clear(long j);

    private static native boolean delete(String str);

    private native void dump(long j);

    private native void erase(long j, String str, long j2);

    private native void eraseUnusedChunk(long j, long j2);

    static void forceInitImpl() {
    }

    private static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    private static native void initialize(String str);

    private native long loadRepo(String str, int i, boolean z);

    private native int protectPortingInterProcess(String str, boolean z, int i);

    private native long storeBoolean(long j, String str, long j2, boolean z);

    private native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private native long storeDouble(long j, String str, long j2, double d);

    private native long storeFloat(long j, String str, long j2, float f);

    private native long storeInt(long j, String str, long j2, int i);

    private native long storeLong(long j, String str, long j2, long j3);

    private native long storeString(long j, String str, long j2, String str2);

    private native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    /* access modifiers changed from: 0000 */
    public native boolean contains(long j, String str);

    /* access modifiers changed from: 0000 */
    public native boolean fetchBoolean(long j, String str, long j2, boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean fetchBoolean(String str, boolean z);

    /* access modifiers changed from: 0000 */
    public native byte[] fetchBytes(long j, String str, long j2, byte[] bArr, int i);

    /* access modifiers changed from: protected */
    public abstract byte[] fetchBytes(String str, byte[] bArr, int i, boolean z);

    /* access modifiers changed from: 0000 */
    public native double fetchDouble(long j, String str, long j2, double d);

    /* access modifiers changed from: protected */
    public abstract double fetchDouble(String str, double d);

    /* access modifiers changed from: 0000 */
    public native float fetchFloat(long j, String str, long j2, float f);

    /* access modifiers changed from: protected */
    public abstract float fetchFloat(String str, float f);

    /* access modifiers changed from: 0000 */
    public native int fetchInt(long j, String str, long j2, int i);

    /* access modifiers changed from: protected */
    public abstract int fetchInt(String str, int i);

    /* access modifiers changed from: 0000 */
    public native long fetchLong(long j, String str, long j2, long j3);

    /* access modifiers changed from: protected */
    public abstract long fetchLong(String str, long j);

    /* access modifiers changed from: 0000 */
    public native String fetchString(long j, String str, long j2, String str2);

    /* access modifiers changed from: protected */
    public abstract String fetchString(String str, String str2, boolean z);

    /* access modifiers changed from: 0000 */
    public native String[] fetchStringArray(long j, String str, long j2, String[] strArr, int i);

    /* access modifiers changed from: protected */
    public abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    public String name() {
        return this.mName;
    }

    /* access modifiers changed from: 0000 */
    public native void rebuildValueMap(long j);

    public void dumpNative() {
        synchronized (this) {
            dump(this.mHandle);
        }
    }

    public void clear() {
        synchronized (this) {
            try {
                this.mValueMap.clear();
                clear(this.mHandle);
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, null, null, th);
            }
        }
    }

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder sb = new StringBuilder("free space is ");
            sb.append(Environment.getDataDirectory().getFreeSpace());
            kevaMonitor.reportWarning(1, str, null, null, sb.toString());
            return;
        }
        try {
            for (KevaValueWrapper kevaValueWrapper : this.mDuplicatedOldWrappers) {
                eraseUnusedChunk(this.mHandle, kevaValueWrapper.offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    static {
        KevaBuilder instance = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        Executor executor = instance.mExecutor;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            sExecutor = threadPoolExecutor;
        }
        String str = instance.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepoName = str;
        File filesDir = instance.mContext.getFilesDir();
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = instance.mWorkDir;
        if (file == null) {
            file = new File(filesDir, "keva");
        }
        sSharedPrefsDir = new File(filesDir.getParent(), "shared_prefs");
        KevaMonitor kevaMonitor = instance.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        if (!file.exists() && !file.mkdirs()) {
            KevaMonitor kevaMonitor2 = sMonitor;
            StringBuilder sb = new StringBuilder("fail to create work dir ");
            sb.append(file.getPath());
            kevaMonitor2.reportThrowable(1, null, null, null, new IllegalStateException(sb.toString()));
        }
        try {
            sMonitor.loadLibrary("Akeva");
            initialize(file.getAbsolutePath());
        } catch (Throwable th) {
            Throwable th2 = th;
            sMonitor.logDebug("fail to load so and init");
            sMonitor.reportThrowable(1, null, null, null, th2);
        }
    }

    public void dump() {
        synchronized (this) {
            KevaMonitor kevaMonitor = sMonitor;
            StringBuilder sb = new StringBuilder("start dumping keva ");
            sb.append(this.mName);
            sb.append(", size=");
            sb.append(this.mValueMap.size());
            kevaMonitor.logDebug(sb.toString());
            for (Entry entry : this.mValueMap.entrySet()) {
                KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) entry.getValue();
                String str = (String) entry.getKey();
                KevaMonitor kevaMonitor2 = sMonitor;
                StringBuilder sb2 = new StringBuilder("key: ");
                sb2.append(str);
                sb2.append(", value: ");
                sb2.append(kevaValueWrapper.value);
                sb2.append(", offset: ");
                sb2.append(kevaValueWrapper.offset);
                sb2.append(", loaded: ");
                sb2.append(kevaValueWrapper.loaded);
                kevaMonitor2.logDebug(sb2.toString());
            }
            KevaMonitor kevaMonitor3 = sMonitor;
            StringBuilder sb3 = new StringBuilder("finish dumping keva ");
            sb3.append(this.mName);
            sb3.append(", size=");
            sb3.append(this.mValueMap.size());
            kevaMonitor3.logDebug(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public Map<String, ?> generateOutMap() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.mValueMap.entrySet()) {
            KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) entry.getValue();
            if (kevaValueWrapper.offset != 0) {
                String str = (String) entry.getKey();
                try {
                    if (!kevaValueWrapper.loaded) {
                        int i = kevaValueWrapper.type;
                        if (i == 23) {
                            throw new UnsupportedOperationException("keva has not implemented utf8");
                        } else if (i != 39) {
                            if (i != 55) {
                                switch (i) {
                                    case 6:
                                        kevaValueWrapper.value = fetchString(this.mHandle, str, kevaValueWrapper.offset, null);
                                        break;
                                    case 7:
                                        kevaValueWrapper.value = fetchBytes(this.mHandle, str, kevaValueWrapper.offset, null, 0);
                                        break;
                                    default:
                                        if (this.mIsMultiProcess && kevaValueWrapper.type <= 5) {
                                            break;
                                        } else {
                                            StringBuilder sb = new StringBuilder("keva has not implemented type ");
                                            sb.append(kevaValueWrapper.type);
                                            throw new UnsupportedOperationException(sb.toString());
                                        }
                                        break;
                                }
                            } else {
                                kevaValueWrapper.value = fetchStringArray(this.mHandle, str, kevaValueWrapper.offset, null, 3);
                            }
                            if (!this.mIsMultiProcess) {
                                kevaValueWrapper.loaded = true;
                            }
                        } else {
                            throw new UnsupportedOperationException("keva has not implemented utf16");
                        }
                    }
                    hashMap.put(str, kevaValueWrapper.value);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    sMonitor.reportThrowable(2, this.mName, str, Long.valueOf(kevaValueWrapper.offset), th2);
                }
            }
        }
        return hashMap;
    }

    public void unRegisterChangeListener(OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    private static boolean existSharedPrefs(String str) {
        File file = sSharedPrefsDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".xml");
        return new File(file, sb.toString()).exists();
    }

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = (KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper != null) {
            return kevaValueWrapper;
        }
        KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper2);
        return kevaValueWrapper2;
    }

    public void registerChangeListener(OnChangeListener onChangeListener) {
        synchronized (this) {
            if (!this.mChangeListeners.contains(onChangeListener)) {
                this.mChangeListeners.add(onChangeListener);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void checkMode(int i) {
        if (!(this.mHandle == 0 || this.mMode == i)) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder sb = new StringBuilder("mode is different: ");
            sb.append(this.mMode);
            sb.append(" != ");
            sb.append(i);
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException(sb.toString()));
        }
    }

    public void erase(String str) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
                erase(this.mHandle, str, obtainWrapperLocked.offset);
                obtainWrapperLocked.value = null;
                obtainWrapperLocked.offset = 0;
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, str, null, th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void init(boolean z) {
        synchronized (this) {
            if (this.mHandle == 0) {
                try {
                    this.mHandle = loadRepo(this.mName, this.mMode, z);
                    cleanUpAfterLoadRepo();
                } catch (Throwable th) {
                    sMonitor.reportThrowable(1, this.mName, null, null, th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0201, code lost:
        r0 = sMonitor;
        r1 = new java.lang.StringBuilder("poring set ported repo >> ");
        r1.append(r9.mName);
        r0.logDebug(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0216, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d9 A[Catch:{ Throwable -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00b3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doPortingFromSp(android.content.Context r20) {
        /*
            r19 = this;
            r9 = r19
            monitor-enter(r19)
            long r0 = r9.mHandle     // Catch:{ all -> 0x0217 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            monitor-exit(r19)     // Catch:{ all -> 0x0217 }
            return
        L_0x000d:
            boolean r10 = r9 instanceof com.bytedance.keva.KevaMultiProcessImpl     // Catch:{ all -> 0x0217 }
            r0 = -1
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L_0x0038
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            int r0 = r9.protectPortingInterProcess(r1, r11, r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            boolean r1 = isRepoPorted(r1)     // Catch:{ all -> 0x0217 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            int r2 = r9.mMode     // Catch:{ all -> 0x0217 }
            long r1 = r9.loadRepo(r1, r2, r12)     // Catch:{ all -> 0x0217 }
            r9.mHandle = r1     // Catch:{ all -> 0x0217 }
            r19.cleanUpAfterLoadRepo()     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            r9.protectPortingInterProcess(r1, r12, r0)     // Catch:{ all -> 0x0217 }
            monitor-exit(r19)     // Catch:{ all -> 0x0217 }
            return
        L_0x0036:
            r13 = r0
            goto L_0x0039
        L_0x0038:
            r13 = -1
        L_0x0039:
            if (r10 != 0) goto L_0x0045
            java.lang.String r0 = r9.mName     // Catch:{ all -> 0x0217 }
            boolean r0 = delete(r0)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            com.bytedance.keva.KevaMonitor r1 = sMonitor     // Catch:{ all -> 0x0217 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            java.lang.String r5 = "poring load empty repo >> "
            r4.<init>(r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r5 = r9.mName     // Catch:{ all -> 0x0217 }
            r4.append(r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0217 }
            r1.logDebug(r4)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            int r4 = r9.mMode     // Catch:{ all -> 0x0217 }
            long r4 = r9.loadRepo(r1, r4, r12)     // Catch:{ all -> 0x0217 }
            r9.mHandle = r4     // Catch:{ all -> 0x0217 }
            r19.cleanUpAfterLoadRepo()     // Catch:{ all -> 0x0217 }
            long r4 = r9.mHandle     // Catch:{ all -> 0x0217 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0070
            monitor-exit(r19)     // Catch:{ all -> 0x0217 }
            return
        L_0x0070:
            if (r0 != 0) goto L_0x0075
            r19.clear()     // Catch:{ all -> 0x0217 }
        L_0x0075:
            java.lang.String r0 = r9.mName     // Catch:{ all -> 0x0217 }
            r1 = r20
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r12)     // Catch:{ all -> 0x0217 }
            com.bytedance.keva.KevaMonitor r1 = sMonitor     // Catch:{ all -> 0x0217 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            java.lang.String r3 = "poring get sp >> "
            r2.<init>(r3)     // Catch:{ all -> 0x0217 }
            java.lang.String r3 = r9.mName     // Catch:{ all -> 0x0217 }
            r2.append(r3)     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0217 }
            r1.logDebug(r2)     // Catch:{ all -> 0x0217 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0217 }
            com.bytedance.keva.KevaMonitor r1 = sMonitor     // Catch:{ all -> 0x0217 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            java.lang.String r3 = "poring get all value >> "
            r2.<init>(r3)     // Catch:{ all -> 0x0217 }
            java.lang.String r3 = r9.mName     // Catch:{ all -> 0x0217 }
            r2.append(r3)     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0217 }
            r1.logDebug(r2)     // Catch:{ all -> 0x0217 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0217 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0217 }
        L_0x00b3:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0217 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0217 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0217 }
            java.lang.Object r15 = r0.getValue()     // Catch:{ all -> 0x0217 }
            if (r15 == 0) goto L_0x00b3
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x00d6
            r0 = 0
            r8 = r0
            goto L_0x00d7
        L_0x00d6:
            r8 = r1
        L_0x00d7:
            com.bytedance.keva.KevaMonitor r0 = sMonitor     // Catch:{ all -> 0x0217 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = "poring process key: "
            r1.<init>(r2)     // Catch:{ all -> 0x0217 }
            r1.append(r8)     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = ", value: "
            r1.append(r2)     // Catch:{ all -> 0x0217 }
            r1.append(r15)     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = " >> "
            r1.append(r2)     // Catch:{ all -> 0x0217 }
            java.lang.String r2 = r9.mName     // Catch:{ all -> 0x0217 }
            r1.append(r2)     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0217 }
            r0.logDebug(r1)     // Catch:{ all -> 0x0217 }
            com.bytedance.keva.KevaImpl$KevaValueWrapper r0 = new com.bytedance.keva.KevaImpl$KevaValueWrapper     // Catch:{ all -> 0x0217 }
            r0.<init>()     // Catch:{ all -> 0x0217 }
            java.util.HashMap<java.lang.String, com.bytedance.keva.KevaImpl$KevaValueWrapper> r1 = r9.mValueMap     // Catch:{ all -> 0x0217 }
            r1.put(r8, r0)     // Catch:{ all -> 0x0217 }
            boolean r1 = r15 instanceof java.lang.Boolean     // Catch:{ Throwable -> 0x01df }
            if (r1 == 0) goto L_0x0128
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x0122 }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x0122 }
            r1 = r15
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x0122 }
            boolean r7 = r1.booleanValue()     // Catch:{ Throwable -> 0x0122 }
            r1 = r19
            r4 = r8
            long r1 = r1.storeBoolean(r2, r4, r5, r7)     // Catch:{ Throwable -> 0x0122 }
            r0.offset = r1     // Catch:{ Throwable -> 0x0122 }
        L_0x011e:
            r18 = r8
            goto L_0x01d3
        L_0x0122:
            r0 = move-exception
            r7 = r0
            r18 = r8
            goto L_0x01e3
        L_0x0128:
            boolean r1 = r15 instanceof java.lang.Integer     // Catch:{ Throwable -> 0x01df }
            if (r1 == 0) goto L_0x0141
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x0122 }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x0122 }
            r1 = r15
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x0122 }
            int r7 = r1.intValue()     // Catch:{ Throwable -> 0x0122 }
            r1 = r19
            r4 = r8
            long r1 = r1.storeInt(r2, r4, r5, r7)     // Catch:{ Throwable -> 0x0122 }
            r0.offset = r1     // Catch:{ Throwable -> 0x0122 }
            goto L_0x011e
        L_0x0141:
            boolean r1 = r15 instanceof java.lang.Long     // Catch:{ Throwable -> 0x01df }
            if (r1 == 0) goto L_0x015f
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x01df }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x01df }
            r1 = r15
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Throwable -> 0x01df }
            long r16 = r1.longValue()     // Catch:{ Throwable -> 0x01df }
            r1 = r19
            r4 = r8
            r18 = r8
            r7 = r16
            long r1 = r1.storeLong(r2, r4, r5, r7)     // Catch:{ Throwable -> 0x01dd }
            r0.offset = r1     // Catch:{ Throwable -> 0x01dd }
            goto L_0x01d3
        L_0x015f:
            r18 = r8
            boolean r1 = r15 instanceof java.lang.Float     // Catch:{ Throwable -> 0x01dd }
            if (r1 == 0) goto L_0x017b
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x01dd }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x01dd }
            r1 = r15
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ Throwable -> 0x01dd }
            float r7 = r1.floatValue()     // Catch:{ Throwable -> 0x01dd }
            r1 = r19
            r4 = r18
            long r1 = r1.storeFloat(r2, r4, r5, r7)     // Catch:{ Throwable -> 0x01dd }
            r0.offset = r1     // Catch:{ Throwable -> 0x01dd }
            goto L_0x01d3
        L_0x017b:
            boolean r1 = r15 instanceof java.lang.String     // Catch:{ Throwable -> 0x01dd }
            if (r1 == 0) goto L_0x0191
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x01dd }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x01dd }
            r7 = r15
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x01dd }
            r1 = r19
            r4 = r18
            long r1 = r1.storeString(r2, r4, r5, r7)     // Catch:{ Throwable -> 0x01dd }
            r0.offset = r1     // Catch:{ Throwable -> 0x01dd }
            goto L_0x01d3
        L_0x0191:
            boolean r1 = r15 instanceof java.util.Set     // Catch:{ Throwable -> 0x01dd }
            if (r1 == 0) goto L_0x01b1
            r1 = r15
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ Throwable -> 0x01dd }
            int r2 = r1.size()     // Catch:{ Throwable -> 0x01dd }
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x01dd }
            r1.toArray(r7)     // Catch:{ Throwable -> 0x01dd }
            long r2 = r9.mHandle     // Catch:{ Throwable -> 0x01dd }
            long r5 = r0.offset     // Catch:{ Throwable -> 0x01dd }
            r8 = 3
            r1 = r19
            r4 = r18
            long r1 = r1.storeStringArray(r2, r4, r5, r7, r8)     // Catch:{ Throwable -> 0x01dd }
            r0.offset = r1     // Catch:{ Throwable -> 0x01dd }
            goto L_0x01d3
        L_0x01b1:
            com.bytedance.keva.KevaMonitor r2 = sMonitor     // Catch:{ Throwable -> 0x01dd }
            r3 = 1
            java.lang.String r4 = r9.mName     // Catch:{ Throwable -> 0x01dd }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ Throwable -> 0x01dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01dd }
            java.lang.String r5 = "do not support type: "
            r1.<init>(r5)     // Catch:{ Throwable -> 0x01dd }
            java.lang.Class r5 = r15.getClass()     // Catch:{ Throwable -> 0x01dd }
            r1.append(r5)     // Catch:{ Throwable -> 0x01dd }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x01dd }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x01dd }
            r5 = r18
            r6 = r15
            r2.reportThrowable(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x01dd }
        L_0x01d3:
            r0.value = r15     // Catch:{ Throwable -> 0x01dd }
            boolean r1 = r9.mIsMultiProcess     // Catch:{ Throwable -> 0x01dd }
            if (r1 != 0) goto L_0x00b3
            r0.loaded = r11     // Catch:{ Throwable -> 0x01dd }
            goto L_0x00b3
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e2
        L_0x01df:
            r0 = move-exception
            r18 = r8
        L_0x01e2:
            r7 = r0
        L_0x01e3:
            com.bytedance.keva.KevaMonitor r2 = sMonitor     // Catch:{ all -> 0x0217 }
            r3 = 3
            java.lang.String r4 = r9.mName     // Catch:{ all -> 0x0217 }
            r5 = r18
            r6 = r15
            r2.reportThrowable(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0217 }
            goto L_0x00b3
        L_0x01f0:
            com.bytedance.keva.Keva r0 = getPortedSpRepo()     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = r9.mName     // Catch:{ all -> 0x0217 }
            r0.storeBoolean(r1, r11)     // Catch:{ all -> 0x0217 }
            if (r10 == 0) goto L_0x0200
            java.lang.String r0 = r9.mName     // Catch:{ all -> 0x0217 }
            r9.protectPortingInterProcess(r0, r12, r13)     // Catch:{ all -> 0x0217 }
        L_0x0200:
            monitor-exit(r19)     // Catch:{ all -> 0x0217 }
            com.bytedance.keva.KevaMonitor r0 = sMonitor
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "poring set ported repo >> "
            r1.<init>(r2)
            java.lang.String r2 = r9.mName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.logDebug(r1)
            return
        L_0x0217:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0217 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.doPortingFromSp(android.content.Context):void");
    }

    public static Keva getRepo(String str, int i) {
        return getRepoImpl(str, i, false);
    }

    public static Keva getRepoSync(String str, int i) {
        return getRepoImpl(str, i, true);
    }

    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    private void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.size() != 0) {
            for (OnChangeListener onChanged : this.mChangeListeners) {
                onChanged.onChanged(keva, str);
            }
        }
    }

    protected KevaImpl(String str, int i) {
        this.mName = str;
        this.mMode = i;
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.mIsMultiProcess = z;
    }

    static KevaImpl getEmptyRepoImpl(String str, int i) {
        if (i < 0 || i >= 2) {
            KevaMonitor kevaMonitor = sMonitor;
            StringBuilder sb = new StringBuilder("mode is not valid! ");
            sb.append(i);
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException(sb.toString()));
        }
        if ((i & 1) == 0) {
            return new KevaPrivateImpl(str, i);
        }
        return new KevaMultiProcessImpl(str, i);
    }

    public boolean getBoolean(String str, boolean z) {
        boolean fetchBoolean;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchBoolean = fetchBoolean(str2, z);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBoolean;
    }

    public byte[] getBytes(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBytes;
    }

    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBytes;
    }

    public double getDouble(String str, double d) {
        double fetchDouble;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchDouble = fetchDouble(str2, d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchDouble;
    }

    public float getFloat(String str, float f) {
        float fetchFloat;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchFloat = fetchFloat(str2, f);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchFloat;
    }

    public int getInt(String str, int i) {
        int fetchInt;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchInt = fetchInt(str2, i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchInt;
    }

    public long getLong(String str, long j) {
        long fetchLong;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchLong = fetchLong(str2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchLong;
    }

    public String getString(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        String str3 = str;
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchString;
    }

    public String[] getStringArray(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringArray;
    }

    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringArray;
    }

    public String getStringJustDisk(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        String str3 = str;
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchString;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringSet;
    }

    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringSet;
    }

    public void storeBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                try {
                    obtainWrapperLocked.offset = storeBoolean(this.mHandle, str, obtainWrapperLocked.offset, z);
                    obtainWrapperLocked.value = Boolean.valueOf(z);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Boolean.valueOf(z), th);
                }
            }
        }
    }

    public void storeDouble(String str, double d) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Double.valueOf(d))) {
                try {
                    obtainWrapperLocked.offset = storeDouble(this.mHandle, str, obtainWrapperLocked.offset, d);
                    obtainWrapperLocked.value = Double.valueOf(d);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Double.valueOf(d), th);
                }
            }
        }
    }

    public void storeFloat(String str, float f) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Float.valueOf(f))) {
                try {
                    obtainWrapperLocked.offset = storeFloat(this.mHandle, str, obtainWrapperLocked.offset, f);
                    obtainWrapperLocked.value = Float.valueOf(f);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Float.valueOf(f), th);
                }
            }
        }
    }

    public void storeInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                try {
                    obtainWrapperLocked.offset = storeInt(this.mHandle, str, obtainWrapperLocked.offset, i);
                    obtainWrapperLocked.value = Integer.valueOf(i);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Integer.valueOf(i), th);
                }
            }
        }
    }

    public void storeLong(String str, long j) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Long.valueOf(j))) {
                try {
                    obtainWrapperLocked.offset = storeLong(this.mHandle, str, obtainWrapperLocked.offset, j);
                    obtainWrapperLocked.value = Long.valueOf(j);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Long.valueOf(j), th);
                }
            }
        }
    }

    public static Keva getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 10000) {
            sExecutor.execute(new Runnable() {
                public void run() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str = KevaImpl.this.mName;
                    String str2 = str;
                    Object obj = obj;
                    StringBuilder sb = new StringBuilder("value too big, size=");
                    sb.append(i);
                    kevaMonitor.reportWarning(3, str, str2, obj, sb.toString());
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j, 2);
    }

    /* access modifiers changed from: 0000 */
    public void addMapDoubleWhenLoading(String str, double d, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d), j, 5);
    }

    /* access modifiers changed from: 0000 */
    public void addMapFloatWhenLoading(String str, float f, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f), j, 4);
    }

    /* access modifiers changed from: 0000 */
    public void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j, 1);
    }

    /* access modifiers changed from: 0000 */
    public void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2, 3);
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] fetchStringArray = fetchStringArray(str, strArr, z);
        if (fetchStringArray != null) {
            return new HashSet(Arrays.asList(fetchStringArray));
        }
        return null;
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    /* access modifiers changed from: 0000 */
    public void addMapOffsetWhenLoading(String str, long j, int i) {
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        KevaValueWrapper kevaValueWrapper2 = (KevaValueWrapper) this.mValueMap.put(str, kevaValueWrapper);
        if (kevaValueWrapper2 != null && this.mDuplicatedOldWrappers != null) {
            this.mDuplicatedOldWrappers.add(kevaValueWrapper2);
        }
    }

    private static Keva getRepoImpl(final String str, final int i, boolean z) {
        Keva keva;
        boolean z2;
        Keva kevaFuture;
        synchronized (sRepoMap) {
            keva = (Keva) sRepoMap.get(str);
            if (keva == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    kevaFuture = getEmptyRepoImpl(str, i);
                } else {
                    kevaFuture = new KevaFuture(str, i, new Callable<KevaImpl>() {
                        public final KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i);
                            emptyRepoImpl.init(false);
                            return emptyRepoImpl;
                        }
                    });
                }
                keva = kevaFuture;
                sRepoMap.put(str, keva);
            }
        }
        if (z2) {
            if (!(keva instanceof KevaFuture)) {
                ((KevaImpl) keva).init(false);
            }
        } else if (!(keva instanceof KevaFuture)) {
            ((KevaImpl) keva).checkMode(i);
        } else {
            ((KevaFuture) keva).checkMode(i);
        }
        return keva;
    }

    private void storeString(final String str, final String str2, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(str2)) {
                try {
                    obtainWrapperLocked.offset = storeString(this.mHandle, str, obtainWrapperLocked.offset, str2);
                    obtainWrapperLocked.type = 6;
                    if (!z) {
                        obtainWrapperLocked.value = str2;
                        if (!this.mIsMultiProcess) {
                            obtainWrapperLocked.loaded = true;
                        }
                    } else {
                        obtainWrapperLocked.value = null;
                        obtainWrapperLocked.loaded = false;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, str2, th);
                }
            } else {
                return;
            }
        }
        if (str2 != null) {
            final int length = str2.length();
            if (length > 10000) {
                sExecutor.execute(new Runnable() {
                    public void run() {
                        KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                        String str = KevaImpl.this.mName;
                        String str2 = str;
                        String str3 = str2;
                        StringBuilder sb = new StringBuilder("value too big, size=");
                        sb.append(length);
                        kevaMonitor.reportWarning(3, str, str2, str3, sb.toString());
                    }
                });
            }
        }
    }

    private void storeStringArray(final String str, String[] strArr, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            try {
                obtainWrapperLocked.offset = storeStringArray(this.mHandle, str, obtainWrapperLocked.offset, strArr, 3);
                obtainWrapperLocked.type = 55;
                if (!z) {
                    obtainWrapperLocked.value = strArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                } else {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                }
                notifyChangeListeners(this, str);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str, null, th);
            }
        }
        if (strArr != null) {
            final String arrays = Arrays.toString(strArr);
            final int length = arrays.length();
            if (length > 10000) {
                sExecutor.execute(new Runnable() {
                    public void run() {
                        KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                        String str = KevaImpl.this.mName;
                        String str2 = str;
                        String str3 = arrays;
                        StringBuilder sb = new StringBuilder("value too big, size=");
                        sb.append(length);
                        kevaMonitor.reportWarning(3, str, str2, str3, sb.toString());
                    }
                });
            }
        }
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j, int i) {
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper kevaValueWrapper2 = (KevaValueWrapper) this.mValueMap.put(str, kevaValueWrapper);
        if (kevaValueWrapper2 != null && this.mDuplicatedOldWrappers != null) {
            this.mDuplicatedOldWrappers.add(kevaValueWrapper2);
        }
    }

    private void storeBytes(final String str, byte[] bArr, int i, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            try {
                obtainWrapperLocked.offset = storeBytes(this.mHandle, str, obtainWrapperLocked.offset, bArr, i);
                obtainWrapperLocked.type = (i << 4) | 7;
                if (!z) {
                    obtainWrapperLocked.value = bArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                } else {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                }
                notifyChangeListeners(this, str);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str, bArr, th);
            }
        }
        if (bArr != null) {
            final int length = bArr.length;
            if (length > 10000) {
                sExecutor.execute(new Runnable() {
                    public void run() {
                        KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                        String str = KevaImpl.this.mName;
                        String str2 = str;
                        StringBuilder sb = new StringBuilder("value too big, size=");
                        sb.append(length);
                        kevaMonitor.reportWarning(3, str, str2, null, sb.toString());
                    }
                });
            }
        }
    }

    private static Keva getRepoFromSpImpl(final Context context, final String str, final int i, boolean z) {
        Keva keva;
        Keva kevaFuture;
        if (isRepoPorted(str)) {
            return getRepo(str, i);
        }
        boolean z2 = true;
        if (!existSharedPrefs(str)) {
            getPortedSpRepo().storeBoolean(str, true);
            return getRepo(str, i);
        }
        KevaMonitor kevaMonitor = sMonitor;
        StringBuilder sb = new StringBuilder("do poring from sp: ");
        sb.append(str);
        kevaMonitor.logDebug(sb.toString());
        synchronized (sRepoMap) {
            keva = (Keva) sRepoMap.get(str);
            if (keva != null) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    kevaFuture = getEmptyRepoImpl(str, i);
                } else {
                    kevaFuture = new KevaFuture(str, i, new Callable<KevaImpl>() {
                        public final KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i);
                            emptyRepoImpl.doPortingFromSp(context);
                            return emptyRepoImpl;
                        }
                    });
                }
                keva = kevaFuture;
                sRepoMap.put(str, keva);
            }
        }
        if (z2) {
            if (keva instanceof KevaImpl) {
                try {
                    ((KevaImpl) keva).doPortingFromSp(context);
                } catch (UnsatisfiedLinkError e) {
                    sMonitor.reportThrowable(1, str, null, null, e);
                }
            }
        } else if (keva instanceof KevaImpl) {
            ((KevaImpl) keva).checkMode(i);
        } else {
            ((KevaFuture) keva).checkMode(i);
        }
        return keva;
    }
}
