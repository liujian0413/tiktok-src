package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import java.io.File;

@JNINamespace("cronet")
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread sInitThread = new HandlerThread("CronetInit");
    private static volatile boolean sInitThreadInitDone;
    private static volatile boolean sLibraryLoaded = false;
    private static final Object sLoadLock = new Object();
    private static final ConditionVariable sWaitForLibLoad = new ConditionVariable();

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

    private static String getDefaultUserAgent() {
        return UserAgent.from(ContextUtils.getApplicationContext());
    }

    private static boolean onInitThread() {
        if (sInitThread.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static void ensureInitializedFromNative() {
        synchronized (sLoadLock) {
            sLibraryLoaded = true;
            sWaitForLibLoad.open();
        }
        ensureInitialized(ContextUtils.getApplicationContext(), null);
    }

    static void ensureInitializedOnInitThread() {
        if (!sInitThreadInitDone) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            sWaitForLibLoad.block();
            nativeCronetInitOnInitThread();
            sInitThreadInitDone = true;
        }
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
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
                Log.m146395i(TAG, "cronet so load: %s", cronetSoPath);
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(cronetSoPath);
                return;
            }
        }
        if (cronetEngineBuilderImpl.libraryLoader() != null) {
            cronetEngineBuilderImpl.libraryLoader().loadLibrary("sscronet");
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("sscronet");
        }
    }

    public static void ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                ContextUtils.initApplicationContext(context);
                if (!sInitThread.isAlive()) {
                    sInitThread.start();
                }
                postToInitThread(new Runnable() {
                    public void run() {
                        CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
            if (!sLibraryLoaded) {
                loadCronetLibrary(cronetEngineBuilderImpl);
                String cronetVersion = ImplVersion.getCronetVersion();
                if (cronetVersion.equals(nativeGetCronetVersion())) {
                    Log.m146395i(TAG, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch"));
                    sLibraryLoaded = true;
                    sWaitForLibLoad.open();
                } else {
                    throw new RuntimeException(C1642a.m8034a("Expected Cronet version number %s, actual version number %s.", new Object[]{cronetVersion, nativeGetCronetVersion()}));
                }
            }
        }
    }
}
