package com.ttnet.org.chromium.net1.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.net1.NetworkChangeNotifier;
import java.io.File;

@JNINamespace("cronet")
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = CronetLibraryLoader.class.getSimpleName();
    private static volatile boolean sInitStarted = false;
    private static final HandlerThread sInitThread = new HandlerThread("CronetInit");
    private static volatile boolean sInitThreadInitDone = false;
    private static final Object sLoadLock = new Object();

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

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    private static boolean onInitThread() {
        if (sInitThread.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    static void ensureInitializedOnInitThread(Context context) {
        if (!sInitThreadInitDone) {
            NetworkChangeNotifier.init(context);
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            nativeCronetInitOnInitThread();
            sInitThreadInitDone = true;
        }
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    private static void loadCronetLibrary(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String cronetSoPath = cronetEngineBuilderImpl.getCronetSoPath();
        if (!TextUtils.isEmpty(cronetSoPath)) {
            File file = new File(cronetSoPath);
            if (file.exists() && !file.isDirectory()) {
                Log.m22892i(TAG, "cronet so load: %s", cronetSoPath);
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(cronetSoPath);
                return;
            }
        }
        if (cronetEngineBuilderImpl.libraryLoader() != null) {
            cronetEngineBuilderImpl.libraryLoader().loadLibrary("sscronet1");
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("sscronet1");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void ensureInitialized(final android.content.Context r6, com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl r7) {
        /*
            java.lang.Object r0 = sLoadLock
            monitor-enter(r0)
            boolean r1 = sInitStarted     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return
        L_0x0009:
            r1 = 1
            sInitStarted = r1     // Catch:{ all -> 0x006b }
            com.ttnet.org.chromium.base1.ContextUtils.initApplicationContext(r6)     // Catch:{ all -> 0x006b }
            loadCronetLibrary(r7)     // Catch:{ all -> 0x006b }
            com.ttnet.org.chromium.base1.ContextUtils.initApplicationContextForNative()     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "58.0.2991.0"
            java.lang.String r2 = nativeGetCronetVersion()     // Catch:{ all -> 0x006b }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x006b }
            r2 = 0
            r3 = 2
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = TAG     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "Cronet version: %s, arch: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "58.0.2991.0"
            r3[r2] = r5     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x006b }
            r3[r1] = r2     // Catch:{ all -> 0x006b }
            com.ttnet.org.chromium.base1.Log.m22892i(r7, r4, r3)     // Catch:{ all -> 0x006b }
            boolean r7 = sInitThreadInitDone     // Catch:{ all -> 0x006b }
            if (r7 != 0) goto L_0x0051
            android.os.HandlerThread r7 = sInitThread     // Catch:{ all -> 0x006b }
            boolean r7 = r7.isAlive()     // Catch:{ all -> 0x006b }
            if (r7 != 0) goto L_0x0049
            android.os.HandlerThread r7 = sInitThread     // Catch:{ all -> 0x006b }
            r7.start()     // Catch:{ all -> 0x006b }
        L_0x0049:
            com.ttnet.org.chromium.net1.impl.CronetLibraryLoader$1 r7 = new com.ttnet.org.chromium.net1.impl.CronetLibraryLoader$1     // Catch:{ all -> 0x006b }
            r7.<init>(r6)     // Catch:{ all -> 0x006b }
            postToInitThread(r7)     // Catch:{ all -> 0x006b }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            return
        L_0x0053:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Expected Cronet version number %s, actual version number %s."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "58.0.2991.0"
            r3[r2] = r4     // Catch:{ all -> 0x006b }
            java.lang.String r2 = nativeGetCronetVersion()     // Catch:{ all -> 0x006b }
            r3[r1] = r2     // Catch:{ all -> 0x006b }
            java.lang.String r7 = com.C1642a.m8034a(r7, r3)     // Catch:{ all -> 0x006b }
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.impl.CronetLibraryLoader.ensureInitialized(android.content.Context, com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl):void");
    }
}
