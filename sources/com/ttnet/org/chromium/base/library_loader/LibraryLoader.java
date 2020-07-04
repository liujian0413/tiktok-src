package com.ttnet.org.chromium.base.library_loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p022v4.content.C0683b;
import android.system.Os;
import com.C1642a;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.BuildInfo;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.FileUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.StreamUtil;
import com.ttnet.org.chromium.base.StrictModeContext;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.CachedMetrics.EnumeratedHistogramSample;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@JNINamespace("base::android")
public class LibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION;
    private static LibraryLoader sInstance = new LibraryLoader();
    private static final EnumeratedHistogramSample sRelinkerCountHistogram = new EnumeratedHistogramSample("ChromiumAndroidLinker.RelinkerFallbackCount", 2);
    private boolean mCommandLineSwitched;
    private volatile boolean mInitialized;
    private boolean mIsUsingBrowserSharedRelros;
    private long mLibraryLoadTimeMs;
    private NativeLibraryPreloader mLibraryPreloader;
    private boolean mLibraryPreloaderCalled;
    private int mLibraryPreloaderStatus = -1;
    private int mLibraryProcessType;
    private boolean mLibraryWasLoadedFromApk;
    private boolean mLoadAtFixedAddressFailed;
    private boolean mLoaded;
    private boolean mLoadedByZygote;
    private final Object mLock = new Object();

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

    public static LibraryLoader getInstance() {
        return sInstance;
    }

    private static boolean isInZipFile() {
        return NativeLibraries.sUseLibraryInZipFile;
    }

    private native String nativeGetVersionNumber();

    private native boolean nativeLibraryLoaded(int i);

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    public static boolean useCrazyLinker() {
        return NativeLibraries.sUseLinker;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public boolean isLoadedByZygote() {
        return this.mLoadedByZygote;
    }

    static void incrementRelinkerCountHitHistogram() {
        sRelinkerCountHistogram.record(1);
    }

    static void incrementRelinkerCountNotHitHistogram() {
        sRelinkerCountHistogram.record(0);
    }

    public void loadNow() throws ProcessInitException {
        loadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    public void preloadNow() {
        preloadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    private LibraryLoader() {
    }

    private void ensureCommandLineSwitchedAlreadyLocked() {
        if (!this.mCommandLineSwitched) {
            CommandLine.enableNativeProxy();
            this.mCommandLineSwitched = true;
        }
    }

    private static File getLibraryDir() {
        return new File(C0683b.m2913c(ContextUtils.getApplicationContext()), "native_libraries");
    }

    public void onNativeInitializationComplete() {
        synchronized (this.mLock) {
            recordBrowserProcessHistogramAlreadyLocked();
        }
    }

    public void switchCommandLineForWebView() {
        synchronized (this.mLock) {
            ensureCommandLineSwitchedAlreadyLocked();
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT <= 19) {
            z = true;
        } else {
            z = false;
        }
        PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isReachedCodeProfilerEnabled() {
        /*
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()
            r1 = 0
            android.content.SharedPreferences r2 = com.ttnet.org.chromium.base.ContextUtils.getAppSharedPreferences()     // Catch:{ Throwable -> 0x0018 }
            java.lang.String r3 = "reached_code_profiler_enabled"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)     // Catch:{ Throwable -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            $closeResource(r1, r0)
        L_0x0015:
            return r2
        L_0x0016:
            r2 = move-exception
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            $closeResource(r1, r0)
        L_0x001f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryLoader.isReachedCodeProfilerEnabled():boolean");
    }

    private void recordBrowserProcessHistogramAlreadyLocked() {
        if (useCrazyLinker()) {
            nativeRecordChromiumAndroidLinkerBrowserHistogram(this.mLibraryLoadTimeMs);
        }
        if (this.mLibraryPreloader != null) {
            nativeRecordLibraryPreloaderBrowserHistogram(this.mLibraryPreloaderStatus);
        }
    }

    public void registerRendererProcessHistogram() {
        synchronized (this.mLock) {
            if (useCrazyLinker()) {
                nativeRegisterChromiumAndroidLinkerRendererHistogram(this.mLibraryLoadTimeMs);
            }
            if (this.mLibraryPreloader != null) {
                nativeRegisterLibraryPreloaderRendererHistogram(this.mLibraryPreloaderStatus);
            }
        }
    }

    private static File makeLibraryDirAndSetPermission() {
        if (!ContextUtils.isIsolatedProcess()) {
            File c = C0683b.m2913c(ContextUtils.getApplicationContext());
            File file = new File(c, "native_libraries");
            c.mkdir();
            c.setExecutable(true, false);
            file.mkdir();
            file.setExecutable(true, false);
        }
        return getLibraryDir();
    }

    public static void setEnvForNative() {
        if (BuildConfig.IS_UBSAN && VERSION.SDK_INT >= 21) {
            try {
                Os.setenv("UBSAN_OPTIONS", "print_stacktrace=1 stack_trace_format='#%n pc %o %m' handle_segv=0 handle_sigbus=0 handle_sigfpe=0", true);
            } catch (Exception e) {
                Log.m146404w("LibraryLoader", "failed to set UBSAN_OPTIONS", e);
            }
        }
    }

    static final /* synthetic */ void lambda$initializeAlreadyLocked$0$LibraryLoader() {
        String str = BuildInfo.getInstance().extractedFileSuffix;
        File[] listFiles = getLibraryDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().contains(str)) {
                    String name = file.getName();
                    if (!file.delete()) {
                        Log.m146404w("LibraryLoader", "Unable to remove %s", name);
                    } else {
                        Log.m146395i("LibraryLoader", "Removed obsolete file %s", name);
                    }
                }
            }
        }
    }

    public static void setLibraryLoaderForTesting(LibraryLoader libraryLoader) {
        sInstance = libraryLoader;
    }

    public void initialize(int i) throws ProcessInitException {
        synchronized (this.mLock) {
            initializeAlreadyLocked(i);
        }
    }

    public void loadNowInZygote(ApplicationInfo applicationInfo) throws ProcessInitException {
        synchronized (this.mLock) {
            loadAlreadyLocked(applicationInfo, true);
            this.mLoadedByZygote = true;
        }
    }

    public void setNativeLibraryPreloader(NativeLibraryPreloader nativeLibraryPreloader) {
        synchronized (this.mLock) {
            this.mLibraryPreloader = nativeLibraryPreloader;
        }
    }

    public static void setReachedCodeProfilerEnabledOnNextRuns(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean("reached_code_profiler_enabled", z).apply();
    }

    public void ensureInitialized(int i) throws ProcessInitException {
        synchronized (this.mLock) {
            if (!this.mInitialized) {
                loadAlreadyLocked(ContextUtils.getApplicationContext().getApplicationInfo(), false);
                initializeAlreadyLocked(i);
            }
        }
    }

    public void preloadNowOverrideApplicationContext(Context context) {
        synchronized (this.mLock) {
            if (!useCrazyLinker()) {
                preloadAlreadyLocked(context.getApplicationInfo());
            }
        }
    }

    private void preloadAlreadyLocked(ApplicationInfo applicationInfo) {
        Throwable th;
        TraceEvent scoped = TraceEvent.scoped("LibraryLoader.preloadAlreadyLocked");
        try {
            if (this.mLibraryPreloader != null && !this.mLibraryPreloaderCalled) {
                this.mLibraryPreloaderStatus = this.mLibraryPreloader.loadLibrary(applicationInfo);
                this.mLibraryPreloaderCalled = true;
            }
            if (scoped != null) {
                $closeResource((Throwable) null, scoped);
            }
        } catch (Throwable th2) {
            if (scoped != null) {
                $closeResource(th, scoped);
            }
            throw th2;
        }
    }

    public void loadNowOverrideApplicationContext(Context context) throws ProcessInitException {
        synchronized (this.mLock) {
            if (this.mLoaded) {
                if (context != ContextUtils.getApplicationContext()) {
                    throw new IllegalStateException("Attempt to load again from alternate context.");
                }
            }
            loadAlreadyLocked(context.getApplicationInfo(), false);
        }
    }

    private void initializeAlreadyLocked(int i) throws ProcessInitException {
        if (!this.mInitialized) {
            this.mLibraryProcessType = i;
            if (this.mLibraryProcessType == 1 && isReachedCodeProfilerEnabled()) {
                CommandLine.getInstance().appendSwitch("enable-reached-code-profiler");
            }
            ensureCommandLineSwitchedAlreadyLocked();
            if (nativeLibraryLoaded(this.mLibraryProcessType)) {
                Log.m146395i("LibraryLoader", C1642a.m8034a("Expected native library version number \"%s\", actual native library version number \"%s\"", new Object[]{NativeLibraries.sVersionNumber, nativeGetVersionNumber()}), new Object[0]);
                if (NativeLibraries.sVersionNumber.equals(nativeGetVersionNumber())) {
                    TraceEvent.registerNativeEnabledObserver();
                    if (i == 1 && PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION) {
                        new Thread(LibraryLoader$$Lambda$0.$instance).start();
                    }
                    this.mInitialized = true;
                    return;
                }
                throw new ProcessInitException(3);
            }
            Log.m146394e("LibraryLoader", "error calling nativeLibraryLoaded", new Object[0]);
            throw new ProcessInitException(1);
        } else if (this.mLibraryProcessType != i) {
            throw new ProcessInitException(2);
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, StrictModeContext strictModeContext) {
        if (th != null) {
            try {
                strictModeContext.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            strictModeContext.close();
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, TraceEvent traceEvent) {
        if (th != null) {
            try {
                traceEvent.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            traceEvent.close();
        }
    }

    static String getExtractedLibraryPath(ApplicationInfo applicationInfo, String str) {
        Log.m146404w("LibraryLoader", "Failed to load libName %s, attempting fallback extraction then trying again", str);
        return extractFileIfStale(applicationInfo, makeLibraryPathInZipFile(str, false, false), makeLibraryDirAndSetPermission());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015b, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        $closeResource(r5, r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015e A[ExcHandler: Throwable (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164 A[SYNTHETIC, Splitter:B:66:0x0164] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAlreadyLocked(android.content.pm.ApplicationInfo r17, boolean r18) throws com.ttnet.org.chromium.base.library_loader.ProcessInitException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "LibraryLoader.loadAlreadyLocked"
            com.ttnet.org.chromium.base.TraceEvent r4 = com.ttnet.org.chromium.base.TraceEvent.scoped(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0168 }
            boolean r0 = r1.mLoaded     // Catch:{ Throwable -> 0x015e, all -> 0x015a }
            if (r0 != 0) goto L_0x0152
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            boolean r0 = useCrazyLinker()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r9 = 0
            if (r0 == 0) goto L_0x00af
            if (r18 != 0) goto L_0x00af
            com.ttnet.org.chromium.base.library_loader.Linker r10 = com.ttnet.org.chromium.base.library_loader.Linker.getInstance()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            boolean r0 = isInZipFile()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r2.sourceDir     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r11 = r0
            goto L_0x002a
        L_0x0029:
            r11 = 0
        L_0x002a:
            r10.prepareLibraryLoad(r11)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String[] r12 = com.ttnet.org.chromium.base.library_loader.NativeLibraries.LIBRARIES     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            int r13 = r12.length     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r14 = 0
        L_0x0031:
            if (r14 >= r13) goto L_0x00ab
            r15 = r12[r14]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            boolean r0 = r10.isChromiumLinkerLibrary(r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = java.lang.System.mapLibraryName(r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            if (r11 == 0) goto L_0x005f
            java.lang.String r3 = "LibraryLoader"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = " Loading "
            r8.<init>(r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r8.append(r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = " from within "
            r8.append(r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r8.append(r11)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            com.ttnet.org.chromium.base.Log.m146395i(r3, r5, r8)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            goto L_0x0074
        L_0x005f:
            java.lang.String r3 = "LibraryLoader"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r8 = "Loading "
            r5.<init>(r8)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r5.append(r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            com.ttnet.org.chromium.base.Log.m146395i(r3, r5, r8)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
        L_0x0074:
            r1.loadLibraryWithCustomLinkerAlreadyLocked(r10, r11, r0)     // Catch:{ UnsatisfiedLinkError -> 0x007b }
            incrementRelinkerCountNotHitHistogram()     // Catch:{ UnsatisfiedLinkError -> 0x007b }
            goto L_0x00a8
        L_0x007b:
            r0 = move-exception
            boolean r3 = isInZipFile()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            if (r3 != 0) goto L_0x0092
            boolean r3 = PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            if (r3 == 0) goto L_0x0092
            java.lang.String r0 = getExtractedLibraryPath(r2, r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r3 = 0
            r1.loadLibraryWithCustomLinkerAlreadyLocked(r10, r3, r0)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            incrementRelinkerCountHitHistogram()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            goto L_0x00a8
        L_0x0092:
            java.lang.String r2 = "LibraryLoader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = "Unable to load library: "
            r3.<init>(r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r3.append(r15)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            com.ttnet.org.chromium.base.Log.m146394e(r2, r3, r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            throw r0     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
        L_0x00a8:
            int r14 = r14 + 1
            goto L_0x0031
        L_0x00ab:
            r10.finishLibraryLoad()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            goto L_0x0118
        L_0x00af:
            setEnvForNative()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r16.preloadAlreadyLocked(r17)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String[] r0 = com.ttnet.org.chromium.base.library_loader.NativeLibraries.LIBRARIES     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            int r3 = r0.length     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r5 = 0
        L_0x00b9:
            if (r5 >= r3) goto L_0x0118
            r8 = r0[r5]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            boolean r10 = isInZipFile()     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            if (r10 != 0) goto L_0x00c7
            com.ttnet.org.chromium.base.library_loader.LibraryLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            goto L_0x00fe
        L_0x00c7:
            boolean r10 = com.ttnet.org.chromium.base.compat.ApiHelperForM.isProcess64Bit()     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r11 = r2.sourceDir     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            r12.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            r12.append(r11)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r11 = "!/"
            r12.append(r11)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            r11 = 1
            java.lang.String r10 = makeLibraryPathInZipFile(r8, r11, r10)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            r12.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r10 = r12.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r11 = "LibraryLoader"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r13 = "libraryName: "
            r12.<init>(r13)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            r12.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.String r12 = r12.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            com.ttnet.org.chromium.base.Log.m146395i(r11, r12, r13)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
            com.ttnet.org.chromium.base.library_loader.LibraryLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0101 }
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x00b9
        L_0x0101:
            r0 = move-exception
            java.lang.String r2 = "LibraryLoader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r5 = "Unable to load library: "
            r3.<init>(r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r3.append(r8)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            com.ttnet.org.chromium.base.Log.m146394e(r2, r3, r5)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            throw r0     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
        L_0x0118:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r0 = 0
            long r10 = r2 - r6
            r1.mLibraryLoadTimeMs = r10     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r0 = "LibraryLoader"
            java.lang.String r5 = "Time to load native libraries: %d ms (timestamps %d-%d)"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            long r10 = r1.mLibraryLoadTimeMs     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r8[r9] = r10     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r10 = 10000(0x2710, double:4.9407E-320)
            long r6 = r6 % r10
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r7 = 1
            r8[r7] = r6     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            long r2 = r2 % r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r3 = 2
            r8[r3] = r2     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.String r2 = com.C1642a.m8034a(r5, r8)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            com.ttnet.org.chromium.base.Log.m146395i(r0, r2, r3)     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            r2 = 1
            r1.mLoaded = r2     // Catch:{ Throwable -> 0x015e, all -> 0x014f }
            goto L_0x0152
        L_0x014f:
            r0 = move-exception
            r5 = 0
            goto L_0x0162
        L_0x0152:
            if (r4 == 0) goto L_0x0159
            r3 = 0
            $closeResource(r3, r4)     // Catch:{ UnsatisfiedLinkError -> 0x0168 }
            return
        L_0x0159:
            return
        L_0x015a:
            r0 = move-exception
            r3 = 0
            r5 = r3
            goto L_0x0162
        L_0x015e:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r0 = move-exception
        L_0x0162:
            if (r4 == 0) goto L_0x0167
            $closeResource(r5, r4)     // Catch:{ UnsatisfiedLinkError -> 0x0168 }
        L_0x0167:
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            com.ttnet.org.chromium.base.library_loader.ProcessInitException r2 = new com.ttnet.org.chromium.base.library_loader.ProcessInitException
            r3 = 2
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryLoader.loadAlreadyLocked(android.content.pm.ApplicationInfo, boolean):void");
    }

    private void loadLibraryWithCustomLinkerAlreadyLocked(Linker linker, String str, String str2) {
        if (linker.isUsingBrowserSharedRelros()) {
            this.mIsUsingBrowserSharedRelros = true;
            try {
                linker.loadLibrary(str2);
            } catch (UnsatisfiedLinkError unused) {
                Log.m146404w("LibraryLoader", "Failed to load native library with shared RELRO, retrying without", new Object[0]);
                this.mLoadAtFixedAddressFailed = true;
                linker.loadLibraryNoFixedAddress(str2);
            }
        } else {
            linker.loadLibrary(str2);
        }
        if (str != null) {
            this.mLibraryWasLoadedFromApk = true;
        }
    }

    private static String extractFileIfStale(ApplicationInfo applicationInfo, String str, File file) {
        String str2 = applicationInfo.sourceDir;
        StringBuilder sb = new StringBuilder();
        sb.append(new File(str).getName());
        sb.append(BuildInfo.getInstance().extractedFileSuffix);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            ZipFile zipFile = null;
            try {
                ZipFile zipFile2 = new ZipFile(str2);
                try {
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry != null) {
                        FileUtils.copyStreamToFile(zipFile2.getInputStream(entry), file2);
                        file2.setReadable(true, false);
                        file2.setExecutable(true, false);
                        StreamUtil.closeQuietly(zipFile2);
                    } else {
                        StringBuilder sb2 = new StringBuilder("Cannot find ZipEntry");
                        sb2.append(str);
                        throw new RuntimeException(sb2.toString());
                    }
                } catch (IOException e) {
                    e = e;
                    zipFile = zipFile2;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        zipFile2 = zipFile;
                        StreamUtil.closeQuietly(zipFile2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    StreamUtil.closeQuietly(zipFile2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        }
        return file2.getAbsolutePath();
    }

    public static String makeLibraryPathInZipFile(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        switch (NativeLibraries.sCpuFamily) {
            case 1:
                if (!z2) {
                    str2 = "armeabi-v7a";
                    break;
                } else {
                    str2 = "arm64-v8a";
                    break;
                }
            case 2:
                if (!z2) {
                    str2 = "mips";
                    break;
                } else {
                    str2 = "mips64";
                    break;
                }
            case 3:
                if (!z2) {
                    str2 = "x86";
                    break;
                } else {
                    str2 = "x86_64";
                    break;
                }
            default:
                throw new RuntimeException("Unknown CPU ABI for native libraries");
        }
        if (z) {
            str3 = "crazy.";
        } else {
            str3 = "";
        }
        return C1642a.m8034a("lib/%s/%s%s", new Object[]{str2, str3, System.mapLibraryName(str)});
    }
}
