package com.ttnet.org.chromium.base.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.StreamUtil;
import com.ttnet.org.chromium.base.SysUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

public class Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Linker sSingleton = new Linker();
    private long mBaseLoadAddress = -1;
    private boolean mBrowserUsesSharedRelro;
    private long mCurrentLoadAddress = -1;
    private boolean mInBrowserProcess = true;
    private boolean mInitialized;
    private HashMap<String, LibInfo> mLoadedLibraries;
    protected final Object mLock = new Object();
    private int mMemoryDeviceConfig;
    private boolean mPrepareLibraryLoadCalled;
    private Bundle mSharedRelros;
    private String mTestRunnerClassName;
    private boolean mWaitForSharedRelros;

    static class LibInfo implements Parcelable {
        public static final Creator<LibInfo> CREATOR = new Creator<LibInfo>() {
            public LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }

            public LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }
        };
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd = -1;
        public long mRelroSize;
        public long mRelroStart;

        public int describeContents() {
            return 1;
        }

        LibInfo() {
        }

        public void close() {
            if (this.mRelroFd >= 0) {
                StreamUtil.closeQuietly((Closeable) ParcelFileDescriptor.adoptFd(this.mRelroFd));
                this.mRelroFd = -1;
            }
        }

        LibInfo(Parcel parcel) {
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor != null) {
                this.mRelroFd = parcelFileDescriptor.detachFd();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (this.mRelroFd >= 0) {
                parcel.writeLong(this.mLoadAddress);
                parcel.writeLong(this.mLoadSize);
                parcel.writeLong(this.mRelroStart);
                parcel.writeLong(this.mRelroSize);
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.mRelroFd);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e) {
                    Log.m146394e("LibraryLoader", "Can't write LibInfo file descriptor to parcel", e);
                }
            }
        }
    }

    public interface TestRunner {
        boolean runChecks(int i, boolean z);
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static boolean areTestsEnabled() {
        return NativeLibraries.sEnableLinkerTests;
    }

    private static void assertLinkerTestsAreEnabled() {
    }

    private void dumpBundle(Bundle bundle) {
    }

    public static Linker getInstance() {
        return sSingleton;
    }

    private static native boolean nativeAddZipArchivePath(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j, LibInfo libInfo);

    private static native long nativeGetRandomBaseLoadAddress();

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    private long getRandomBaseLoadAddress() {
        return nativeGetRandomBaseLoadAddress();
    }

    public final String getTestRunnerClassNameForTesting() {
        String str;
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            str = this.mTestRunnerClassName;
        }
        return str;
    }

    private Linker() {
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

    private void ensureInitializedLocked() {
        if (!this.mInitialized) {
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
                Log.m146404w("LibraryLoader", "Low-memory device: shared RELROs used in all processes", new Object[0]);
            } else {
                this.mBrowserUsesSharedRelro = false;
            }
            this.mInitialized = true;
        }
    }

    private static void loadLinkerJniLibrary() {
        LibraryLoader.setEnvForNative();
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("chromium_android_linker");
            LibraryLoader.incrementRelinkerCountNotHitHistogram();
        } catch (UnsatisfiedLinkError unused) {
            if (LibraryLoader.PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(LibraryLoader.getExtractedLibraryPath(ContextUtils.getApplicationContext().getApplicationInfo(), "chromium_android_linker"));
                LibraryLoader.incrementRelinkerCountHitHistogram();
            }
        }
    }

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            this.mBaseLoadAddress = getRandomBaseLoadAddress();
            this.mCurrentLoadAddress = this.mBaseLoadAddress;
            if (this.mBaseLoadAddress == 0) {
                Log.m146404w("LibraryLoader", "Disabling shared RELROs due address space pressure", new Object[0]);
                this.mBrowserUsesSharedRelro = false;
                this.mWaitForSharedRelros = false;
            }
        }
    }

    public long getBaseLoadAddress() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (!this.mInBrowserProcess) {
                Log.m146404w("LibraryLoader", "Shared RELRO sections are disabled in this process!", new Object[0]);
                return 0;
            }
            setupBaseLoadAddressLocked();
            long j = this.mBaseLoadAddress;
            return j;
        }
    }

    /* access modifiers changed from: 0000 */
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
            java.util.HashMap<java.lang.String, com.ttnet.org.chromium.base.library_loader.Linker$LibInfo> r1 = r3.mLoadedLibraries     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0042
            boolean r1 = r3.mInBrowserProcess     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, com.ttnet.org.chromium.base.library_loader.Linker$LibInfo> r1 = r3.mLoadedLibraries     // Catch:{ all -> 0x004f }
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
            boolean r1 = com.ttnet.org.chromium.base.library_loader.NativeLibraries.sEnableLinkerTests     // Catch:{ all -> 0x004f }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.Linker.finishLibraryLoad():void");
    }

    /* access modifiers changed from: 0000 */
    public boolean isChromiumLinkerLibrary(String str) {
        return str.equals("chromium_android_linker");
    }

    /* access modifiers changed from: 0000 */
    public void loadLibrary(String str) {
        loadLibraryImpl(str, true);
    }

    /* access modifiers changed from: 0000 */
    public void loadLibraryNoFixedAddress(String str) {
        loadLibraryImpl(str, false);
    }

    public static final void setupForTesting(String str) {
        assertLinkerTestsAreEnabled();
        synchronized (sSingleton) {
            sSingleton.mTestRunnerClassName = str;
        }
    }

    public final void setMemoryDeviceConfigForTesting(int i) {
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            this.mMemoryDeviceConfig = i;
        }
    }

    private void closeLibInfoMap(HashMap<String, LibInfo> hashMap) {
        for (Entry value : hashMap.entrySet()) {
            ((LibInfo) value.getValue()).close();
        }
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

    public void prepareLibraryLoad(String str) {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (str != null) {
                nativeAddZipArchivePath(str);
            }
            this.mPrepareLibraryLoadCalled = true;
            if (this.mInBrowserProcess) {
                setupBaseLoadAddressLocked();
            }
        }
    }

    private Bundle createBundleFromLibInfoMap(HashMap<String, LibInfo> hashMap) {
        Bundle bundle = new Bundle(hashMap.size());
        for (Entry entry : hashMap.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
        }
        return bundle;
    }

    private HashMap<String, LibInfo> createLibInfoMapFromBundle(Bundle bundle) {
        HashMap<String, LibInfo> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, (LibInfo) bundle.getParcelable(str));
        }
        return hashMap;
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
                    Log.m146404w("LibraryLoader", sb.toString(), new Object[0]);
                }
            }
            if (!this.mInBrowserProcess) {
                closeLibInfoMap(createLibInfoMapFromBundle);
            }
        }
    }

    private final void runTestRunnerClassForTesting(int i, boolean z) {
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            if (this.mTestRunnerClassName == null) {
                Log.wtf("LibraryLoader", "Linker runtime tests not set up for this process", new Object[0]);
            }
            TestRunner testRunner = null;
            try {
                testRunner = (TestRunner) Class.forName(this.mTestRunnerClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Log.wtf("LibraryLoader", "Could not instantiate test runner class by name", e);
            }
            if (!testRunner.runChecks(i, z)) {
                Log.wtf("LibraryLoader", "Linker runtime tests failed in this process", new Object[0]);
            }
            Log.m146395i("LibraryLoader", "All linker tests passed", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public void loadLibraryImpl(String str, boolean z) {
        long j;
        String str2;
        String str3 = str;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (this.mLoadedLibraries == null) {
                this.mLoadedLibraries = new HashMap<>();
            }
            if (!this.mLoadedLibraries.containsKey(str3)) {
                LibInfo libInfo = new LibInfo();
                if (!z || ((!this.mInBrowserProcess || !this.mBrowserUsesSharedRelro) && !this.mWaitForSharedRelros)) {
                    j = 0;
                } else {
                    j = this.mCurrentLoadAddress;
                    if (j > this.mBaseLoadAddress + 201326592) {
                        StringBuilder sb = new StringBuilder("Load address outside reservation, for: ");
                        sb.append(str3);
                        String sb2 = sb.toString();
                        Log.m146394e("LibraryLoader", sb2, new Object[0]);
                        throw new UnsatisfiedLinkError(sb2);
                    }
                }
                if (nativeLoadLibrary(str3, j, libInfo)) {
                    if (NativeLibraries.sEnableLinkerTests) {
                        if (this.mInBrowserProcess) {
                            str2 = "BROWSER_LIBRARY_ADDRESS";
                        } else {
                            str2 = "RENDERER_LIBRARY_ADDRESS";
                        }
                        Log.m146395i("LibraryLoader", C1642a.m8035a(Locale.US, "%s: %s %x", new Object[]{str2, str3, Long.valueOf(libInfo.mLoadAddress)}), new Object[0]);
                    }
                    if (this.mInBrowserProcess && !nativeCreateSharedRelro(str3, this.mCurrentLoadAddress, libInfo)) {
                        Log.m146404w("LibraryLoader", C1642a.m8035a(Locale.US, "Could not create shared RELRO for %s at %x", new Object[]{str3, Long.valueOf(this.mCurrentLoadAddress)}), new Object[0]);
                    }
                    if (!(j == 0 || this.mCurrentLoadAddress == 0)) {
                        this.mCurrentLoadAddress = libInfo.mLoadAddress + libInfo.mLoadSize;
                    }
                    this.mLoadedLibraries.put(str3, libInfo);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("Unable to load library: ");
                sb3.append(str3);
                String sb4 = sb3.toString();
                Log.m146394e("LibraryLoader", sb4, new Object[0]);
                throw new UnsatisfiedLinkError(sb4);
            }
        }
    }
}
