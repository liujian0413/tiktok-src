package com.facebook.react.bridge;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import org.json.JSONObject;

public class ReactBridge {
    private static JSExceptionListener mJSExceptionListener;
    private static PageFinishedListener mPageFinishListener;
    public static volatile boolean sDidInit;
    public static volatile INativeLibraryLoader soLoader;

    public interface JSExceptionListener {
        void upLoad(JSONObject jSONObject);
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                if (soLoader != null) {
                    soLoader.loadLibrary("reactnativejni");
                } else {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("reactnativejni");
                }
                sDidInit = true;
            }
        }
    }

    public static void setJSExceptionListener(JSExceptionListener jSExceptionListener) {
        mJSExceptionListener = jSExceptionListener;
    }

    public static void setPageFinishListener(PageFinishedListener pageFinishedListener) {
        mPageFinishListener = pageFinishedListener;
    }

    public static boolean isSupportRN(OnRNLoadExceptionListener onRNLoadExceptionListener) {
        staticInit(onRNLoadExceptionListener);
        return sDidInit;
    }

    public static void uploadJSException(JSONObject jSONObject) {
        if (mJSExceptionListener != null) {
            mJSExceptionListener.upLoad(jSONObject);
        }
    }

    public static void uploadPageFinishPerf(JSONObject jSONObject) {
        if (mPageFinishListener != null) {
            mPageFinishListener.upLoad(jSONObject);
        }
    }

    public static synchronized void staticInit(OnRNLoadExceptionListener onRNLoadExceptionListener) {
        synchronized (ReactBridge.class) {
            try {
                staticInit();
            } catch (Throwable th) {
                if (onRNLoadExceptionListener != null) {
                    onRNLoadExceptionListener.onLoadError(th.toString());
                }
            }
        }
    }

    public static synchronized void staticInit(OnRNLoadExceptionListener onRNLoadExceptionListener, INativeLibraryLoader iNativeLibraryLoader) {
        synchronized (ReactBridge.class) {
            try {
                if (soLoader != iNativeLibraryLoader) {
                    soLoader = iNativeLibraryLoader;
                }
                staticInit();
            } catch (Throwable th) {
                if (onRNLoadExceptionListener != null) {
                    onRNLoadExceptionListener.onLoadError(th.toString());
                }
            }
        }
    }
}
