package com.p280ss.video.rtc.base.utils;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.video.rtc.base.utils.ContextManager */
public class ContextManager {
    private WeakReference<Context> mContextWeakReference;

    /* renamed from: com.ss.video.rtc.base.utils.ContextManager$SingletonHelper */
    static class SingletonHelper {
        public static final ContextManager INSTANCE = new ContextManager();

        private SingletonHelper() {
        }
    }

    public static ContextManager instance() {
        return SingletonHelper.INSTANCE;
    }

    public Context getContext() {
        if (this.mContextWeakReference == null || this.mContextWeakReference.get() == null) {
            return null;
        }
        return (Context) this.mContextWeakReference.get();
    }

    public void setContext(Context context) {
        if (this.mContextWeakReference != null) {
            this.mContextWeakReference = null;
        }
        this.mContextWeakReference = new WeakReference<>(context);
    }
}
