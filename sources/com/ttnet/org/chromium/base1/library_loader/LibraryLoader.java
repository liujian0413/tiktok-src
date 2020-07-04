package com.ttnet.org.chromium.base1.library_loader;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.ttnet.org.chromium.base1.CommandLine;
import com.ttnet.org.chromium.base1.ContextUtils;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.TraceEvent;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.metrics.RecordHistogram;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("base::android")
public class LibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static volatile LibraryLoader sInstance;
    private static NativeLibraryPreloader sLibraryPreloader;
    private static final Object sLock = new Object();
    private boolean mCommandLineSwitched;
    private volatile boolean mInitialized;
    private boolean mIsUsingBrowserSharedRelros;
    private long mLibraryLoadTimeMs;
    private int mLibraryPreloaderStatus = -1;
    private final int mLibraryProcessType;
    private boolean mLibraryWasLoadedFromApk;
    private boolean mLoadAtFixedAddressFailed;
    private boolean mLoaded;
    private final AtomicBoolean mPrefetchLibraryHasBeenCalled;

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static native boolean nativeForkAndPrefetchNativeLibrary();

    private native String nativeGetVersionNumber();

    private native void nativeInitCommandLine(String[] strArr);

    private native boolean nativeLibraryLoaded();

    public static native int nativePercentageOfResidentNativeLibraryCode();

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(boolean z, boolean z2, int i, long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(boolean z, boolean z2, long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    public void onNativeInitializationComplete() {
        recordBrowserProcessHistogram();
    }

    private int getLibraryLoadFromApkStatus() {
        if (this.mLibraryWasLoadedFromApk) {
            return 3;
        }
        return 0;
    }

    public void loadNow() throws ProcessInitException {
        loadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    public static int getLibraryProcessType() {
        if (sInstance == null) {
            return 0;
        }
        return sInstance.mLibraryProcessType;
    }

    public static boolean isInitialized() {
        if (sInstance == null || !sInstance.mInitialized) {
            return false;
        }
        return true;
    }

    public void initialize() throws ProcessInitException {
        synchronized (sLock) {
            initializeAlreadyLocked();
        }
    }

    public void switchCommandLineForWebView() {
        synchronized (sLock) {
            ensureCommandLineSwitchedAlreadyLocked();
        }
    }

    private void ensureCommandLineSwitchedAlreadyLocked() {
        if (!this.mCommandLineSwitched) {
            nativeInitCommandLine(CommandLine.getJavaSwitchesOrNull());
            CommandLine.enableNativeProxy();
            this.mCommandLineSwitched = true;
            ContextUtils.initApplicationContextForNative();
        }
    }

    public void asyncPrefetchLibrariesToMemory() {
        final boolean compareAndSet = this.mPrefetchLibraryHasBeenCalled.compareAndSet(false, true);
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                boolean z;
                String str;
                TraceEvent.begin("LibraryLoader.asyncPrefetchLibrariesToMemory");
                int nativePercentageOfResidentNativeLibraryCode = LibraryLoader.nativePercentageOfResidentNativeLibraryCode();
                boolean z2 = false;
                if (!compareAndSet || nativePercentageOfResidentNativeLibraryCode >= 90) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    boolean nativeForkAndPrefetchNativeLibrary = LibraryLoader.nativeForkAndPrefetchNativeLibrary();
                    if (!nativeForkAndPrefetchNativeLibrary) {
                        Log.m22901w("LibraryLoader", "Forking a process to prefetch the native library failed.", new Object[0]);
                    }
                    z2 = nativeForkAndPrefetchNativeLibrary;
                }
                RecordHistogram.initialize();
                if (z) {
                    RecordHistogram.recordBooleanHistogram("LibraryLoader.PrefetchStatus", z2);
                }
                if (nativePercentageOfResidentNativeLibraryCode != -1) {
                    StringBuilder sb = new StringBuilder("LibraryLoader.PercentageOfResidentCodeBeforePrefetch");
                    if (compareAndSet) {
                        str = ".ColdStartup";
                    } else {
                        str = ".WarmStartup";
                    }
                    sb.append(str);
                    RecordHistogram.recordPercentageHistogram(sb.toString(), nativePercentageOfResidentNativeLibraryCode);
                }
                TraceEvent.end("LibraryLoader.asyncPrefetchLibrariesToMemory");
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void ensureInitialized() throws ProcessInitException {
        synchronized (sLock) {
            if (!this.mInitialized) {
                loadAlreadyLocked(ContextUtils.getApplicationContext());
                initializeAlreadyLocked();
            }
        }
    }

    private void recordBrowserProcessHistogram() {
        Linker.getInstance();
        if (Linker.isUsed()) {
            nativeRecordChromiumAndroidLinkerBrowserHistogram(this.mIsUsingBrowserSharedRelros, this.mLoadAtFixedAddressFailed, getLibraryLoadFromApkStatus(), this.mLibraryLoadTimeMs);
        }
        if (sLibraryPreloader != null) {
            nativeRecordLibraryPreloaderBrowserHistogram(this.mLibraryPreloaderStatus);
        }
    }

    private void initializeAlreadyLocked() throws ProcessInitException {
        if (!this.mInitialized) {
            ensureCommandLineSwitchedAlreadyLocked();
            if (nativeLibraryLoaded()) {
                Log.m22892i("LibraryLoader", C1642a.m8034a("Expected native library version number \"%s\", actual native library version number \"%s\"", new Object[]{NativeLibraries.sVersionNumber, nativeGetVersionNumber()}), new Object[0]);
                if (NativeLibraries.sVersionNumber.equals(nativeGetVersionNumber())) {
                    TraceEvent.registerNativeEnabledObserver();
                    this.mInitialized = true;
                    return;
                }
                throw new ProcessInitException(3);
            }
            Log.m22891e("LibraryLoader", "error calling nativeLibraryLoaded", new Object[0]);
            throw new ProcessInitException(1);
        }
    }

    private LibraryLoader(int i) {
        this.mLibraryProcessType = i;
        this.mPrefetchLibraryHasBeenCalled = new AtomicBoolean();
    }

    public static void setNativeLibraryPreloader(NativeLibraryPreloader nativeLibraryPreloader) {
        synchronized (sLock) {
            sLibraryPreloader = nativeLibraryPreloader;
        }
    }

    public void loadNowOverrideApplicationContext(Context context) throws ProcessInitException {
        synchronized (sLock) {
            if (this.mLoaded) {
                if (context != ContextUtils.getApplicationContext()) {
                    throw new IllegalStateException("Attempt to load again from alternate context.");
                }
            }
            loadAlreadyLocked(context);
        }
    }

    public static LibraryLoader get(int i) throws ProcessInitException {
        synchronized (sLock) {
            if (sInstance == null) {
                LibraryLoader libraryLoader = new LibraryLoader(i);
                sInstance = libraryLoader;
                return libraryLoader;
            } else if (sInstance.mLibraryProcessType == i) {
                LibraryLoader libraryLoader2 = sInstance;
                return libraryLoader2;
            } else {
                throw new ProcessInitException(2);
            }
        }
    }

    private void loadAlreadyLocked(Context context) throws ProcessInitException {
        String[] strArr;
        try {
            if (!this.mLoaded) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (Linker.isUsed()) {
                    Linker instance = Linker.getInstance();
                    instance.prepareLibraryLoad();
                    for (String str : NativeLibraries.LIBRARIES) {
                        if (!instance.isChromiumLinkerLibrary(str)) {
                            String str2 = null;
                            String mapLibraryName = System.mapLibraryName(str);
                            if (Linker.isInZipFile()) {
                                str2 = context.getApplicationInfo().sourceDir;
                                StringBuilder sb = new StringBuilder("Loading ");
                                sb.append(str);
                                sb.append(" from within ");
                                sb.append(str2);
                                Log.m22892i("LibraryLoader", sb.toString(), new Object[0]);
                            } else {
                                StringBuilder sb2 = new StringBuilder("Loading ");
                                sb2.append(str);
                                Log.m22892i("LibraryLoader", sb2.toString(), new Object[0]);
                            }
                            loadLibrary(instance, str2, mapLibraryName);
                        }
                    }
                    instance.finishLibraryLoad();
                } else {
                    if (sLibraryPreloader != null) {
                        this.mLibraryPreloaderStatus = sLibraryPreloader.loadLibrary(context);
                    }
                    for (String com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary : NativeLibraries.LIBRARIES) {
                        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary);
                    }
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.mLibraryLoadTimeMs = uptimeMillis2 - uptimeMillis;
                Log.m22892i("LibraryLoader", C1642a.m8034a("Time to load native libraries: %d ms (timestamps %d-%d)", new Object[]{Long.valueOf(this.mLibraryLoadTimeMs), Long.valueOf(uptimeMillis % 10000), Long.valueOf(uptimeMillis2 % 10000)}), new Object[0]);
                this.mLoaded = true;
            }
        } catch (UnsatisfiedLinkError e) {
            throw new ProcessInitException(2, e);
        }
    }

    public void registerRendererProcessHistogram(boolean z, boolean z2) {
        Linker.getInstance();
        if (Linker.isUsed()) {
            nativeRegisterChromiumAndroidLinkerRendererHistogram(z, z2, this.mLibraryLoadTimeMs);
        }
        if (sLibraryPreloader != null) {
            nativeRegisterLibraryPreloaderRendererHistogram(this.mLibraryPreloaderStatus);
        }
    }

    private void loadLibrary(Linker linker, String str, String str2) {
        if (linker.isUsingBrowserSharedRelros()) {
            this.mIsUsingBrowserSharedRelros = true;
            try {
                linker.loadLibrary(str, str2);
            } catch (UnsatisfiedLinkError unused) {
                Log.m22901w("LibraryLoader", "Failed to load native library with shared RELRO, retrying without", new Object[0]);
                this.mLoadAtFixedAddressFailed = true;
                linker.loadLibraryNoFixedAddress(str, str2);
            }
        } else {
            linker.loadLibrary(str, str2);
        }
        if (str != null) {
            this.mLibraryWasLoadedFromApk = true;
        }
    }
}
