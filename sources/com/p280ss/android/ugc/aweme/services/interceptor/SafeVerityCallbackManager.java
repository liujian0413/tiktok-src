package com.p280ss.android.ugc.aweme.services.interceptor;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.SafeVerityCallbackManager */
public class SafeVerityCallbackManager {
    private static final Object LOCK = new Object();
    private static volatile SafeVerityCallbackManager sInstance;
    private SafeVerityCallback mCallback;

    private SafeVerityCallbackManager() {
    }

    public static SafeVerityCallbackManager getInstance() {
        if (sInstance == null) {
            synchronized (SafeVerityCallbackManager.class) {
                if (sInstance == null) {
                    sInstance = new SafeVerityCallbackManager();
                }
            }
        }
        return sInstance;
    }

    public void register(SafeVerityCallback safeVerityCallback) {
        if (safeVerityCallback != null) {
            synchronized (LOCK) {
                this.mCallback = safeVerityCallback;
            }
        }
    }

    public void notifyResult(SafeVerityResponse safeVerityResponse) {
        synchronized (LOCK) {
            if (this.mCallback != null) {
                this.mCallback.onComplete(safeVerityResponse);
                this.mCallback = null;
            }
        }
    }
}
