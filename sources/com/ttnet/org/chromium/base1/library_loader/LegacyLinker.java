package com.ttnet.org.chromium.base1.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import com.C1642a;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.SysUtils;
import com.ttnet.org.chromium.base1.ThreadUtils;
import com.ttnet.org.chromium.base1.library_loader.Linker.LibInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

class LegacyLinker extends Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long mBaseLoadAddress = -1;
    private boolean mBrowserUsesSharedRelro;
    private long mCurrentLoadAddress = -1;
    private boolean mInBrowserProcess = true;
    private boolean mInitialized;
    private HashMap<String, LibInfo> mLoadedLibraries;
    private boolean mPrepareLibraryLoadCalled;
    private Bundle mSharedRelros;
    private boolean mWaitForSharedRelros;

    private void dumpBundle(Bundle bundle) {
    }

    private static native boolean nativeCreateSharedRelro(String str, long j, LibInfo libInfo);

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);

    private static native boolean nativeLoadLibraryInZipFile(String str, String str2, long j, LibInfo libInfo);

    public static native void nativeRunCallbackOnUiThread(long j);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    static Linker create() {
        return new LegacyLinker();
    }

    private LegacyLinker() {
    }

    public void disableSharedRelros() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = false;
            this.mBrowserUsesSharedRelro = false;
        }
    }

    public Bundle getSharedRelros() {
        synchronized (this.mLock) {
            if (!this.mInBrowserProcess) {
                return null;
            }
            Bundle bundle = this.mSharedRelros;
            return bundle;
        }
    }

    public boolean isUsingBrowserSharedRelros() {
        boolean z;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (!this.mInBrowserProcess || !this.mBrowserUsesSharedRelro) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void prepareLibraryLoad() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            this.mPrepareLibraryLoadCalled = true;
            if (this.mInBrowserProcess) {
                setupBaseLoadAddressLocked();
            }
        }
    }

    private void ensureInitializedLocked() {
        if (!this.mInitialized && NativeLibraries.sUseLinker) {
            loadLinkerJniLibrary();
            if (this.mMemoryDeviceConfig == 0) {
                if (SysUtils.isLowEndDevice()) {
                    this.mMemoryDeviceConfig = 1;
                } else {
                    this.mMemoryDeviceConfig = 2;
                }
            }
            if (this.mMemoryDeviceConfig == 1) {
                this.mBrowserUsesSharedRelro = true;
                Log.m22901w("LibraryLoader", "Low-memory device: shared RELROs used in all processes", new Object[0]);
            } else {
                this.mBrowserUsesSharedRelro = false;
            }
            this.mInitialized = true;
        }
    }

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            this.mBaseLoadAddress = getRandomBaseLoadAddress();
            this.mCurrentLoadAddress = this.mBaseLoadAddress;
            if (this.mBaseLoadAddress == 0) {
                Log.m22901w("LibraryLoader", "Disabling shared RELROs due address space pressure", new Object[0]);
                this.mBrowserUsesSharedRelro = false;
                this.mWaitForSharedRelros = false;
            }
        }
    }

    public long getBaseLoadAddress() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (!this.mInBrowserProcess) {
                Log.m22901w("LibraryLoader", "Shared RELRO sections are disabled in this process!", new Object[0]);
                return 0;
            }
            setupBaseLoadAddressLocked();
            long j = this.mBaseLoadAddress;
            return j;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|30|27|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0023, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finishLibraryLoad() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r3.ensureInitializedLocked()     // Catch:{ all -> 0x004f }
            java.util.HashMap<java.lang.String, com.ttnet.org.chromium.base1.library_loader.Linker$LibInfo> r1 = r3.mLoadedLibraries     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0042
            boolean r1 = r3.mInBrowserProcess     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, com.ttnet.org.chromium.base1.library_loader.Linker$LibInfo> r1 = r3.mLoadedLibraries     // Catch:{ all -> 0x004f }
            android.os.Bundle r1 = r3.createBundleFromLibInfoMap(r1)     // Catch:{ all -> 0x004f }
            r3.mSharedRelros = r1     // Catch:{ all -> 0x004f }
            boolean r1 = r3.mBrowserUsesSharedRelro     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r1 = r3.mSharedRelros     // Catch:{ all -> 0x004f }
            r3.useSharedRelrosLocked(r1)     // Catch:{ all -> 0x004f }
        L_0x001f:
            boolean r1 = r3.mWaitForSharedRelros     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0042
        L_0x0023:
            android.os.Bundle r1 = r3.mSharedRelros     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0035
            java.lang.Object r1 = r3.mLock     // Catch:{ InterruptedException -> 0x002d }
            r1.wait()     // Catch:{ InterruptedException -> 0x002d }
            goto L_0x0023
        L_0x002d:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004f }
            r1.interrupt()     // Catch:{ all -> 0x004f }
            goto L_0x0023
        L_0x0035:
            android.os.Bundle r1 = r3.mSharedRelros     // Catch:{ all -> 0x004f }
            r3.useSharedRelrosLocked(r1)     // Catch:{ all -> 0x004f }
            android.os.Bundle r1 = r3.mSharedRelros     // Catch:{ all -> 0x004f }
            r1.clear()     // Catch:{ all -> 0x004f }
            r1 = 0
            r3.mSharedRelros = r1     // Catch:{ all -> 0x004f }
        L_0x0042:
            boolean r1 = com.ttnet.org.chromium.base1.library_loader.NativeLibraries.sEnableLinkerTests     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004d
            int r1 = r3.mMemoryDeviceConfig     // Catch:{ all -> 0x004f }
            boolean r2 = r3.mInBrowserProcess     // Catch:{ all -> 0x004f }
            r3.runTestRunnerClassForTesting(r1, r2)     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.library_loader.LegacyLinker.finishLibraryLoad():void");
    }

    public static void postCallbackOnMainThread(final long j) {
        ThreadUtils.postOnUiThread((Runnable) new Runnable() {
            public final void run() {
                LegacyLinker.nativeRunCallbackOnUiThread(j);
            }
        });
    }

    public void initServiceProcess(long j) {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mBrowserUsesSharedRelro = false;
            this.mWaitForSharedRelros = true;
            this.mBaseLoadAddress = j;
            this.mCurrentLoadAddress = j;
        }
    }

    public void useSharedRelros(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle.setClassLoader(LibInfo.class.getClassLoader());
            bundle2 = new Bundle(LibInfo.class.getClassLoader());
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            bundle2.readFromParcel(obtain);
            obtain.recycle();
        } else {
            bundle2 = null;
        }
        synchronized (this.mLock) {
            this.mSharedRelros = bundle2;
            this.mLock.notifyAll();
        }
    }

    private void useSharedRelrosLocked(Bundle bundle) {
        if (bundle != null && this.mLoadedLibraries != null) {
            HashMap createLibInfoMapFromBundle = createLibInfoMapFromBundle(bundle);
            for (Entry entry : createLibInfoMapFromBundle.entrySet()) {
                String str = (String) entry.getKey();
                if (!nativeUseSharedRelro(str, (LibInfo) entry.getValue())) {
                    StringBuilder sb = new StringBuilder("Could not use shared RELRO section for ");
                    sb.append(str);
                    Log.m22901w("LibraryLoader", sb.toString(), new Object[0]);
                }
            }
            if (!this.mInBrowserProcess) {
                closeLibInfoMap(createLibInfoMapFromBundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void loadLibraryImpl(String str, String str2, boolean z) {
        long j;
        String str3;
        String str4 = str;
        String str5 = str2;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (this.mLoadedLibraries == null) {
                this.mLoadedLibraries = new HashMap<>();
            }
            if (!this.mLoadedLibraries.containsKey(str5)) {
                LibInfo libInfo = new LibInfo();
                if (!z || ((!this.mInBrowserProcess || !this.mBrowserUsesSharedRelro) && !this.mWaitForSharedRelros)) {
                    j = 0;
                } else {
                    j = this.mCurrentLoadAddress;
                    if (j > this.mBaseLoadAddress + 201326592) {
                        StringBuilder sb = new StringBuilder("Load address outside reservation, for: ");
                        sb.append(str5);
                        String sb2 = sb.toString();
                        Log.m22891e("LibraryLoader", sb2, new Object[0]);
                        throw new UnsatisfiedLinkError(sb2);
                    }
                }
                if (str4 != null) {
                    if (!nativeLoadLibraryInZipFile(str4, str5, j, libInfo)) {
                        StringBuilder sb3 = new StringBuilder("Unable to load library: ");
                        sb3.append(str5);
                        sb3.append(", in: ");
                        sb3.append(str4);
                        String sb4 = sb3.toString();
                        Log.m22891e("LibraryLoader", sb4, new Object[0]);
                        throw new UnsatisfiedLinkError(sb4);
                    }
                } else if (nativeLoadLibrary(str5, j, libInfo)) {
                    str4 = str5;
                } else {
                    StringBuilder sb5 = new StringBuilder("Unable to load library: ");
                    sb5.append(str5);
                    String sb6 = sb5.toString();
                    Log.m22891e("LibraryLoader", sb6, new Object[0]);
                    throw new UnsatisfiedLinkError(sb6);
                }
                if (NativeLibraries.sEnableLinkerTests) {
                    if (this.mInBrowserProcess) {
                        str3 = "BROWSER_LIBRARY_ADDRESS";
                    } else {
                        str3 = "RENDERER_LIBRARY_ADDRESS";
                    }
                    Object[] objArr = {str3, str5, Long.valueOf(libInfo.mLoadAddress)};
                    Log.m22892i("LibraryLoader", C1642a.m8035a(Locale.US, "%s: %s %x", objArr), new Object[0]);
                }
                if (this.mInBrowserProcess && !nativeCreateSharedRelro(str4, this.mCurrentLoadAddress, libInfo)) {
                    Log.m22901w("LibraryLoader", C1642a.m8035a(Locale.US, "Could not create shared RELRO for %s at %x", new Object[]{str5, Long.valueOf(this.mCurrentLoadAddress)}), new Object[0]);
                }
                if (!(j == 0 || this.mCurrentLoadAddress == 0)) {
                    this.mCurrentLoadAddress = libInfo.mLoadAddress + libInfo.mLoadSize + 16777216;
                }
                this.mLoadedLibraries.put(str4, libInfo);
            }
        }
    }
}
