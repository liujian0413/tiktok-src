package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.p255e.C6326a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import java.util.ArrayList;

public class Optimizer {
    private static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    private static volatile boolean mOptimzerLibLoaded;

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    public static boolean loadOptimizerLibrary(Context context) {
        if (mOptimzerLibLoaded) {
            return true;
        }
        synchronized (Optimizer.class) {
            if (mOptimzerLibLoaded) {
                return true;
            }
            if (context == null) {
                try {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("sysoptimizer");
                } catch (UnsatisfiedLinkError e) {
                    mLoadError.add(e);
                    return false;
                }
            } else {
                C6326a.m19642a("sysoptimizer", context);
            }
            mOptimzerLibLoaded = true;
            return true;
        }
    }
}
